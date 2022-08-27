package com.velebit.anippe.server.settings.leads;

import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import com.velebit.anippe.shared.settings.leads.ILeadStatusesService;
import com.velebit.anippe.shared.settings.leads.LeadStatusesTablePageData;

public class LeadStatusesService implements ILeadStatusesService {
	@Override
	public LeadStatusesTablePageData getLeadStatusesTableData(SearchFilter filter) {
		LeadStatusesTablePageData pageData = new LeadStatusesTablePageData();
		// TODO [Luka] fill pageData.
		return pageData;
	}
}
