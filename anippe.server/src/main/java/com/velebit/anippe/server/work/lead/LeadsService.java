package com.velebit.anippe.server.work.lead;

import java.util.List;

import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.util.CollectionUtility;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import com.velebit.anippe.server.dao.LeadDao;
import com.velebit.anippe.shared.beans.Lead;
import com.velebit.anippe.shared.work.lead.ILeadsService;
import com.velebit.anippe.shared.work.lead.LeadsTablePageData;
import com.velebit.anippe.shared.work.lead.LeadsTablePageData.LeadsTableRowData;

public class LeadsService implements ILeadsService {
	@Override
	public LeadsTablePageData getLeadsTableData(SearchFilter filter) {
		LeadsTablePageData pageData = new LeadsTablePageData();

		List<Lead> leads = BEANS.get(LeadDao.class).findByRequest(null);
		
		if(CollectionUtility.isEmpty(leads)) return pageData;
		
		for(Lead lead : leads) {
			LeadsTableRowData row = pageData.addRow();
			row.setLead(lead);
			row.setName(lead.getFullName());
		}

		return pageData;
	}
}
