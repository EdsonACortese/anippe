package com.velebit.anippe.client.work.lead;

import com.velebit.anippe.client.work.lead.LeadsTablePage.Table;
import com.velebit.anippe.shared.FontIcons;
import com.velebit.anippe.shared.work.lead.ILeadsService;
import com.velebit.anippe.shared.work.lead.LeadsTablePageData;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.text.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

@Data(LeadsTablePageData.class)
public class LeadsTablePage extends AbstractPageWithTable<Table> {
  @Override
  protected boolean getConfiguredLeaf() {
    return true;
  }

  @Override
  protected void execLoadData(SearchFilter filter) {
    importPageData(BEANS.get(ILeadsService.class).getLeadsTableData(filter));
  }

  @Override
  protected String getConfiguredIconId() {
    return FontIcons.UserPlus;
  }

  @Override
  protected String getConfiguredOverviewIconId() {
    return FontIcons.UserPlus;
  }

  @Override
  protected String getConfiguredTitle() {
    return TEXTS.get("Leads");
  }

  public class Table extends AbstractTable {

  }
}
