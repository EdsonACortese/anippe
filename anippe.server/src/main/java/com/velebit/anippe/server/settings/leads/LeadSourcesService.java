package com.velebit.anippe.server.settings.leads;

import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import com.velebit.anippe.shared.settings.leads.ILeadSourcesService;
import com.velebit.anippe.shared.settings.leads.LeadSourcesTablePageData;

public class LeadSourcesService implements ILeadSourcesService {
	@Override
	public LeadSourcesTablePageData getLeadSourcesTableData(SearchFilter filter) {
		LeadSourcesTablePageData pageData = new LeadSourcesTablePageData();


		
		return pageData;
	}
}
