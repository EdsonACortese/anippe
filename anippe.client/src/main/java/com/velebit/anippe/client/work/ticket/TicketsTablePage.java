package com.velebit.anippe.client.work.ticket;

import com.velebit.anippe.client.common.menus.AbstractAddMenu;
import com.velebit.anippe.client.common.menus.AbstractDeleteMenu;
import com.velebit.anippe.client.common.menus.AbstractEditMenu;
import com.velebit.anippe.client.work.ticket.TicketsTablePage.Table;
import com.velebit.anippe.shared.FontIcons;
import com.velebit.anippe.shared.work.ticket.ITicketsService;
import com.velebit.anippe.shared.work.ticket.TicketsTablePageData;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.text.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

@Data(TicketsTablePageData.class)
public class TicketsTablePage extends AbstractPageWithTable<Table> {
	@Override
	protected boolean getConfiguredLeaf() {
		return true;
	}

	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(ITicketsService.class).getTicketsTableData(filter));
	}

	@Override
	protected String getConfiguredOverviewIconId() {
		return FontIcons.Question;
	}

	@Override
	protected String getConfiguredIconId() {
		return FontIcons.Question;
	}

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("Tickets");
	}

	@Order(1000)
	public class AddMenu extends AbstractAddMenu {

		@Override
		protected void execAction() {
		}
	}

	public class Table extends AbstractTable {
		@Order(1000)
		public class EditMenu extends AbstractEditMenu {

			@Override
			protected void execAction() {
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
