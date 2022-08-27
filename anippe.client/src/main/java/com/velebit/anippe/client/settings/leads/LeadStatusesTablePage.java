package com.velebit.anippe.client.settings.leads;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.text.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import com.velebit.anippe.client.settings.leads.LeadStatusesTablePage.Table;
import com.velebit.anippe.shared.FontIcons;
import com.velebit.anippe.shared.settings.leads.ILeadStatusesService;
import com.velebit.anippe.shared.settings.leads.LeadStatusesTablePageData;

@Data(LeadStatusesTablePageData.class)
public class LeadStatusesTablePage extends AbstractPageWithTable<Table> {
	@Override
	protected boolean getConfiguredLeaf() {
		return true;
	}

	@Override
	protected String getConfiguredIconId() {
		return FontIcons.Wrench;
	}

	@Override
	protected String getConfiguredOverviewIconId() {
		return FontIcons.Wrench;
	}

	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(ILeadStatusesService.class).getLeadStatusesTableData(filter));
	}

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("Statuses");
	}

	public class Table extends AbstractTable {

	}
}
