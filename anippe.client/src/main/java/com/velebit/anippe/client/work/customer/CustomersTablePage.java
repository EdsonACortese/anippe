package com.velebit.anippe.client.work.customer;

import com.velebit.anippe.client.work.customer.CustomersTablePage.Table;
import com.velebit.anippe.shared.FontIcons;
import com.velebit.anippe.shared.work.customer.CustomersTablePageData;
import com.velebit.anippe.shared.work.customer.ICustomersService;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.text.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

@Data(CustomersTablePageData.class)
public class CustomersTablePage extends AbstractPageWithTable<Table> {
  @Override
  protected boolean getConfiguredLeaf() {
    return true;
  }

  @Override
  protected void execLoadData(SearchFilter filter) {
    importPageData(BEANS.get(ICustomersService.class).getCustomersTableData(filter));
  }

  @Override
  protected String getConfiguredOverviewIconId() {
    return FontIcons.Users1;
  }

  @Override
  protected String getConfiguredIconId() {
    return FontIcons.Users1;
  }

  @Override
  protected String getConfiguredTitle() {
    return TEXTS.get("Customers");
  }

  public class Table extends AbstractTable {

  }
}
