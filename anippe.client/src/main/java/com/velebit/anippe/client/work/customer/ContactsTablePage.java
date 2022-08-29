package com.velebit.anippe.client.work.customer;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractColumn;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractDateTimeColumn;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractStringColumn;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.text.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import com.velebit.anippe.client.work.customer.ContactsTablePage.Table;
import com.velebit.anippe.shared.FontIcons;
import com.velebit.anippe.shared.beans.Contact;
import com.velebit.anippe.shared.work.customer.ContactsTablePageData;
import com.velebit.anippe.shared.work.customer.IContactsService;

@Data(ContactsTablePageData.class)
public class ContactsTablePage extends AbstractPageWithTable<Table> {
	@Override
	protected boolean getConfiguredLeaf() {
		return true;
	}

	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(IContactsService.class).getContactsTableData(filter));
	}

	@Override
	protected String getConfiguredOverviewIconId() {
		return FontIcons.UserCheck;
	}

	@Override
	protected String getConfiguredIconId() {
		return FontIcons.UserCheck;
	}

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("Contacts");
	}

	public class Table extends AbstractTable {
		@Override
		protected boolean getConfiguredAutoResizeColumns() {
			return true;
		}

		public EmailColumn getEmailColumn() {
			return getColumnSet().getColumnByClass(EmailColumn.class);
		}

		public PhoneColumn getPhoneColumn() {
			return getColumnSet().getColumnByClass(PhoneColumn.class);
		}

		public CreatedAtColumn getCreatedAtColumn() {
			return getColumnSet().getColumnByClass(CreatedAtColumn.class);
		}

		public CompanyColumn getCompanyColumn() {
			return getColumnSet().getColumnByClass(CompanyColumn.class);
		}

		public PositionColumn getPositionColumn() {
			return getColumnSet().getColumnByClass(PositionColumn.class);
		}

		public NameColumn getNameColumn() {
			return getColumnSet().getColumnByClass(NameColumn.class);
		}

		public ContactColumn getContactColumn() {
			return getColumnSet().getColumnByClass(ContactColumn.class);
		}

		@Order(1000)
		public class ContactColumn extends AbstractColumn<Contact> {
			@Override
			protected boolean getConfiguredDisplayable() {
				return false;
			}
		}

		@Order(2000)
		public class NameColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Name");
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

		@Order(5250)
		public class PositionColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Position");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

		@Order(5500)
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

		@Order(6000)
		public class CreatedAtColumn extends AbstractDateTimeColumn {
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
