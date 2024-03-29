package com.velebit.anippe.server;

import com.velebit.anippe.server.dao.OrganisationDao;
import com.velebit.anippe.shared.ILoginService;
import com.velebit.anippe.shared.beans.Organisation;
import com.velebit.anippe.shared.beans.User;
import com.velebit.anippe.shared.utility.PasswordUtility;

import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.holders.NVPair;
import org.eclipse.scout.rt.server.jdbc.SQL;

public class LoginService implements ILoginService {

	private boolean checkLoginPassword(User user, String passwordPlainText) {
		return PasswordUtility.passwordIsValid(passwordPlainText, user.getPassword());
	}

	@Override
	public User getUserByUsername(String userId) {
		User user = new User();

		StringBuffer varname1 = new StringBuffer();
		varname1.append("SELECT u.id, ");
		varname1.append("       u.username, ");
		varname1.append("       u.password, ");
		varname1.append("       u.first_name, ");
		varname1.append("       u.last_name, ");
		varname1.append("       u.organisation_id, ");
		varname1.append("       u.administrator, ");
		varname1.append("       u.super_administrator ");
		varname1.append("FROM   users u ");
		varname1.append("WHERE  u.username = :username   ");
		varname1.append("AND    u.deleted_at IS NULL ");
		varname1.append("AND    u.active IS TRUE ");
		varname1.append("INTO :{user.id}, :{user.Username},:{user.Password}, :{user.firstName}, :{user.lastName}, :{user.organisationId}, :{user.Administrator}, :{user.superAdministrator}");
		SQL.selectInto(varname1.toString(), new NVPair("user", user), new NVPair("username", userId));

		return user;
	}

	@Override
	public Organisation getCurrentOrganisation(Integer organisationId) {
		return BEANS.get(OrganisationDao.class).findById(organisationId);
	}

	@Override
	public User getUser(String username, String password) {
		User user = new User();
		
		StringBuffer varname1 = new StringBuffer();
		varname1.append("SELECT u.id, ");
		varname1.append("       u.username, ");
		varname1.append("       u.password, ");
		varname1.append("       u.administrator, ");
		varname1.append("       u.super_administrator ");
		varname1.append("FROM   users u ");
		varname1.append("WHERE  u.username = :username ");
		varname1.append("       AND u.active = true ");
		varname1.append("       AND u.deleted_at IS NULL ");
		varname1.append("INTO :{user.id}, :{user.Username}, :{user.Password}, :{user.Administrator}, :{user.superAdministrator}");
		SQL.selectInto(varname1.toString(), new NVPair("user", user), new NVPair("username", username),
				new NVPair("password", password));

		if (user.getId() == null)
			return null;


		// Check password on login for user.
		if (!checkLoginPassword(user, password))
			return null;

		return user;
	}

}
