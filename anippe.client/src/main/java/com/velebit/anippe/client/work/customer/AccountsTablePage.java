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

import com.velebit.anippe.client.work.customer.AccountsTablePage.Table;
import com.velebit.anippe.shared.FontIcons;
import com.velebit.anippe.shared.beans.Account;
import com.velebit.anippe.shared.work.customer.AccountsTablePageData;
import com.velebit.anippe.shared.work.customer.IAccountsService;

@Data(AccountsTablePageData.class)
public class AccountsTablePage extends AbstractPageWithTable<Table> {
	@Override
	protected boolean getConfiguredLeaf() {
		return true;
	}

	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(IAccountsService.class).getAccountsTableData(filter));
	}

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("Tvrtke");
	}

	@Override
	protected String getConfiguredOverviewIconId() {
		return FontIcons.Building;
	}

	@Override
	protected String getConfiguredIconId() {
		return FontIcons.Building;
	}

	public class Table extends AbstractTable {
		@Override
		protected boolean getConfiguredAutoResizeColumns() {
			return true;
		}

		public AddressColumn getAddressColumn() {
			return getColumnSet().getColumnByClass(AddressColumn.class);
		}

		public PrimaryContactColumn getPrimaryContactColumn() {
			return getColumnSet().getColumnByClass(PrimaryContactColumn.class);
		}

		public CountryColumn getCountryColumn() {
			return getColumnSet().getColumnByClass(CountryColumn.class);
		}

		public CreatedAtColumn getCreatedAtColumn() {
			return getColumnSet().getColumnByClass(CreatedAtColumn.class);
		}

		public NameColumn getNameColumn() {
			return getColumnSet().getColumnByClass(NameColumn.class);
		}

		public AccountColumn getAccountColumn() {
			return getColumnSet().getColumnByClass(AccountColumn.class);
		}

		@Order(1000)
		public class AccountColumn extends AbstractColumn<Account> {
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

		@Order(3000)
		public class AddressColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Address");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

		@Order(3500)
		public class CountryColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Country");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

		@Order(4000)
		public class PrimaryContactColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("PrimaryContact");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

		@Order(5000)
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
