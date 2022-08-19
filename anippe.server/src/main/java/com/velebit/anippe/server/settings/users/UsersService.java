package com.velebit.anippe.server.settings.users;

import com.velebit.anippe.shared.settings.users.IUsersService;
import com.velebit.anippe.shared.settings.users.UsersTablePageData;

import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

public class UsersService implements IUsersService {
    @Override
    public UsersTablePageData getUsersTableData(SearchFilter filter) {
        UsersTablePageData pageData = new UsersTablePageData();
// TODO [Luka] fill pageData.
        return pageData;
    }
}
