package com.velebit.anippe.client.settings.leads;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.text.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import com.velebit.anippe.client.common.columns.AbstractIDColumn;
import com.velebit.anippe.client.common.menus.AbstractAddMenu;
import com.velebit.anippe.client.common.menus.AbstractDeleteMenu;
import com.velebit.anippe.client.common.menus.AbstractEditMenu;
import com.velebit.anippe.client.settings.leads.LeadSourcesTablePage.Table;
import com.velebit.anippe.shared.FontIcons;
import com.velebit.anippe.shared.settings.leads.ILeadSourcesService;
import com.velebit.anippe.shared.settings.leads.LeadSourcesTablePageData;

@Data(LeadSourcesTablePageData.class)
public class LeadSourcesTablePage extends AbstractPageWithTable<Table> {
	@Override
	protected boolean getConfiguredLeaf() {
		return true;
	}

	@Override
	protected String getConfiguredIconId() {
		return FontIcons.Draver;
	}

	@Override
	protected String getConfiguredOverviewIconId() {
		return FontIcons.Draver;
	}

	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(ILeadSourcesService.class).getLeadSourcesTableData(filter));
	}

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("Sources");
	}

	@Order(1000)
	public class AddMenu extends AbstractAddMenu {

		@Override
		protected void execAction() {
			LeadSourceForm form = new LeadSourceForm();
			form.startNew();
			form.waitFor();
			if (form.isFormStored()) {
				reloadPage();
			}
		}
	}

	public class Table extends AbstractTable {

		@Order(1000)
		public class LeadSourceIdColumn extends AbstractIDColumn {

		}

		public LeadSourceIdColumn getLeadSourceIdColumn() {
			return getColumnSet().getColumnByClass(LeadSourceIdColumn.class);
		}

		@Order(1000)
		public class EditMenu extends AbstractEditMenu {

			@Override
			protected void execAction() {
				LeadSourceForm form = new LeadSourceForm();
				form.setLeadSourceId(getLeadSourceIdColumn().getSelectedValue());
				form.startModify();
				form.waitFor();
				if (form.isFormStored()) {
					reloadPage();
				}
			}
		}

		@Order(2000)
		public class DeleteMenu extends AbstractDeleteMenu {

			@Override
			protected void execAction() {
			}
		}
	}
}
