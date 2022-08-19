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
        varname1.append("       u.active, ");
        varname1.append("       u.administrator, ");
        varname1.append("       u.business_email, ");
        varname1.append("       u.theme_type, ");
        varname1.append("       u.dense_mode, ");
        varname1.append("       u.service_provider, ");
        varname1.append("       u.primary_branch_id ");
        varname1.append("FROM   users u ");
        varname1.append("WHERE  u.username = :username AND u.active = true AND u.deleted_at IS NULL  ");
        varname1.append("INTO :{user.id}, :{user.Username},:{user.Password}, :{user.firstName}, :{user.lastName}, :{user.organisationId}, :{user.Active},  :{user.Administrator}, :{user.businessEmail},:{user.themeType},:{user.denseMode},:{user.serviceProvider}, :{user.primaryBranchId}");
        SQL.selectInto(varname1.toString(), new NVPair("user", user), new NVPair("username", userId));

        return user;
    }

    @Override
    public Organisation getCurrentOrganisation(Integer organisationId) {
        return BEANS.get(OrganisationDao.class).find(organisationId);
    }

    @Override
    public User getUser(String username, String password) {
        User user = new User();

        StringBuffer varname1 = new StringBuffer();
        varname1.append("SELECT u.id, ");
        varname1.append("       u.username, ");
        varname1.append("       u.password, ");
        varname1.append("       u.administrator, ");
        varname1.append("       u.organisation_id ");
        varname1.append("FROM   users u, ");
        varname1.append("       organisations o, ");
        varname1.append("       frontend.accounts a ");
        varname1.append("WHERE  u.organisation_id = o.id ");
        varname1.append("       AND u.username = :username ");
        varname1.append("       AND a.id = o.account_id ");
        varname1.append("       AND u.active = true ");
        varname1.append("       AND a.deleted_at IS NULL ");
        varname1.append("       AND o.deleted_at IS NULL ");
        varname1.append("       AND u.deleted_at IS NULL ");
        varname1.append("INTO :{user.id}, :{user.Username}, :{user.Password}, :{user.Administrator}, :{user.organisationId} ");
        SQL.selectInto(varname1.toString(), new NVPair("user", user), new NVPair("username", username), new NVPair("password", password));

        if (user.getId() == null)
            return null;

        // Check password on login for user.
        if (!checkLoginPassword(user, password))
            return null;

        return user;
    }


}
