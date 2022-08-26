package com.velebit.anippe.server.settings.users;

import org.eclipse.scout.rt.platform.holders.NVPair;
import org.eclipse.scout.rt.server.jdbc.SQL;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import com.velebit.anippe.server.AbstractService;
import com.velebit.anippe.shared.settings.users.IUsersService;
import com.velebit.anippe.shared.settings.users.UsersTablePageData;

public class UsersService extends AbstractService implements IUsersService {
	@Override
	public UsersTablePageData getUsersTableData(SearchFilter filter) {
		UsersTablePageData pageData = new UsersTablePageData();

		StringBuffer varname1 = new StringBuffer();
		varname1.append("SELECT u.id, ");
		varname1.append("       u.last_name ");
		varname1.append("              || ' ' ");
		varname1.append("              || u.first_name, ");
		varname1.append("       u.username, ");
		varname1.append("       u.administrator, ");
		varname1.append("       u.last_login_at ");
		varname1.append("FROM   users u ");
		varname1.append("WHERE  u.deleted_at IS NULL ");
		varname1.append("AND    u.organisation_id = :organisationId ");
		varname1.append("INTO   :{rows.UserId}, ");
		varname1.append("       :{rows.FullName}, ");
		varname1.append("       :{rows.Username}, ");
		varname1.append("       :{rows.Administrator}, ");
		varname1.append("       :{rows.LastLoginAt}");
		SQL.selectInto(varname1.toString(), new NVPair("rows", pageData), new NVPair("organisationId", getCurrentOrganisationId()));

		return pageData;
	}
}
