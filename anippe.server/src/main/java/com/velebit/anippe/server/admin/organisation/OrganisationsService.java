package com.velebit.anippe.server.admin.organisation;

import java.util.List;

import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import com.velebit.anippe.server.dao.OrganisationDao;
import com.velebit.anippe.shared.admin.organisation.IOrganisationsService;
import com.velebit.anippe.shared.admin.organisation.OrganisationsTablePageData;
import com.velebit.anippe.shared.admin.organisation.OrganisationsTablePageData.OrganisationsTableRowData;
import com.velebit.anippe.shared.beans.Organisation;

public class OrganisationsService implements IOrganisationsService {
    @Override
    public OrganisationsTablePageData getOrganisationsTableData(SearchFilter filter) {
    	OrganisationsTablePageData pageData = new OrganisationsTablePageData();

		List<Organisation> organisations = BEANS.get(OrganisationDao.class).all();

		for (Organisation organisation : organisations) {
			OrganisationsTableRowData row = pageData.addRow();
			row.setOrganisation(organisation);
			row.setName(organisation.getName());
			row.setAddress(organisation.getAddress());
			row.setCountry(organisation.getCountry().getName());
			row.setPhone(organisation.getPhone());
			row.setEmail(organisation.getEmail());
			row.setWebsite(organisation.getWebsite());
			row.setCreatedAt(organisation.getCreatedAt());
			row.setSubdomain(organisation.getSubdomain());
		}

		return pageData;
    }
}
