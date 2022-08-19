package com.velebit.anippe.server.admin.organisation;

import com.velebit.anippe.shared.admin.organisation.IOrganisationsService;
import com.velebit.anippe.shared.admin.organisation.OrganisationsTablePageData;

import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

public class OrganisationsService implements IOrganisationsService {
    @Override
    public OrganisationsTablePageData getOrganisationsTableData(SearchFilter filter) {
        OrganisationsTablePageData pageData = new OrganisationsTablePageData();
// TODO [Luka] fill pageData.
        return pageData;
    }
}
