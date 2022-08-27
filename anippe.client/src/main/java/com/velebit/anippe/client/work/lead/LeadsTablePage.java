package com.velebit.anippe.client.work.lead;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.cell.Cell;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.basic.table.ITableRow;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractColumn;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractSmartColumn;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractStringColumn;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.text.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import com.velebit.anippe.client.common.menus.AbstractAddMenu;
import com.velebit.anippe.client.common.menus.AbstractDeleteMenu;
import com.velebit.anippe.client.common.menus.AbstractEditMenu;
import com.velebit.anippe.client.work.lead.LeadsTablePage.Table;
import com.velebit.anippe.shared.FontIcons;
import com.velebit.anippe.shared.beans.Lead;
import com.velebit.anippe.shared.work.lead.ILeadsService;
import com.velebit.anippe.shared.work.lead.LeadsTablePageData;

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

	@Order(1000)
	public class AddMenu extends AbstractAddMenu {

		@Override
		protected void execAction() {
			LeadForm form = new LeadForm();
			form.startNew();
			form.waitFor();
			if (form.isFormStored()) {
				reloadPage();
			}
		}
	}

	public class Table extends AbstractTable {

		@Override
		protected boolean getConfiguredAutoResizeColumns() {
			return true;
		}

		public CompanyColumn getCompanyColumn() {
			return getColumnSet().getColumnByClass(CompanyColumn.class);
		}

		public EmailColumn getEmailColumn() {
			return getColumnSet().getColumnByClass(EmailColumn.class);
		}

		public PhoneColumn getPhoneColumn() {
			return getColumnSet().getColumnByClass(PhoneColumn.class);
		}

		public StatusColumn getStatusColumn() {
			return getColumnSet().getColumnByClass(StatusColumn.class);
		}

		public SourceColumn getSourceColumn() {
			return getColumnSet().getColumnByClass(SourceColumn.class);
		}

		public CreatedAtColumn getCreatedAtColumn() {
			return getColumnSet().getColumnByClass(CreatedAtColumn.class);
		}

		public LastActivityAtColumn getLastActivityAtColumn() {
			return getColumnSet().getColumnByClass(LastActivityAtColumn.class);
		}

		public NameColumn getNameColumn() {
			return getColumnSet().getColumnByClass(NameColumn.class);
		}

		public LeadColumn getLeadColumn() {
			return getColumnSet().getColumnByClass(LeadColumn.class);
		}

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

		@Order(1000)
		public class LeadColumn extends AbstractColumn<Lead> {
			@Override
			protected boolean getConfiguredDisplayable() {
				return false;
			}
		}

		@Order(2000)
		public class NameColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("FullName");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

		@Order(3000)
		public class CompanyColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Company");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

		@Order(4000)
		public class EmailColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Email");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

		@Order(5000)
		public class PhoneColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Phone");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

		@Order(6000)
		public class StatusColumn extends AbstractSmartColumn<Long> {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Status");
			}

			@Override
			protected void execDecorateCell(Cell cell, ITableRow row) {
				super.execDecorateCell(cell, row);

				cell.setEditable(true);
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

		@Order(7000)
		public class SourceColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Source");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

		@Order(7500)
		public class LastActivityAtColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("LastActivity");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

		@Order(8000)
		public class CreatedAtColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("CreatedAt");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

	}
}
