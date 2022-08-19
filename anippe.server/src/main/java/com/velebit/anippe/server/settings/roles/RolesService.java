package com.velebit.anippe.server.settings.roles;

import com.velebit.anippe.shared.settings.roles.IRolesService;
import com.velebit.anippe.shared.settings.roles.RolesTablePageData;

import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

public class RolesService implements IRolesService {
    @Override
    public RolesTablePageData getRolesTableData(SearchFilter filter) {
        RolesTablePageData pageData = new RolesTablePageData();
// TODO [Luka] fill pageData.
        return pageData;
    }
}
