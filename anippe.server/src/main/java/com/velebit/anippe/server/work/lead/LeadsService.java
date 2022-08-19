package com.velebit.anippe.server.work.lead;

import com.velebit.anippe.shared.work.lead.ILeadsService;
import com.velebit.anippe.shared.work.lead.LeadsTablePageData;

import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

public class LeadsService implements ILeadsService {
  @Override
  public LeadsTablePageData getLeadsTableData(SearchFilter filter) {
    LeadsTablePageData pageData = new LeadsTablePageData();
    return pageData;
  }
}
