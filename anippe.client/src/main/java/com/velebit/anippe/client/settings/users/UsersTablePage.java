package com.velebit.anippe.client.settings.users;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.action.menu.IMenu;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractBooleanColumn;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractDateTimeColumn;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractStringColumn;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.ISearchForm;
import org.eclipse.scout.rt.client.ui.messagebox.IMessageBox;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.text.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import com.velebit.anippe.client.common.columns.AbstractIDColumn;
import com.velebit.anippe.client.common.interaction.MessageBoxHelper;
import com.velebit.anippe.client.common.interaction.NotificationHelper;
import com.velebit.anippe.client.common.menus.AbstractAddMenu;
import com.velebit.anippe.client.common.menus.AbstractDeleteMenu;
import com.velebit.anippe.client.common.menus.AbstractEditMenu;
import com.velebit.anippe.client.settings.users.UsersTablePage.Table;
import com.velebit.anippe.shared.FontIcons;
import com.velebit.anippe.shared.settings.users.IUserService;
import com.velebit.anippe.shared.settings.users.IUsersService;
import com.velebit.anippe.shared.settings.users.UsersTablePageData;

@Data(UsersTablePageData.class)
public class UsersTablePage extends AbstractPageWithTable<Table> {
	@Override
	protected boolean getConfiguredLeaf() {
		return true;
	}

	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(IUsersService.class).getUsersTableData(filter));
	}

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("Users");
	}

	@Override
	protected String getConfiguredIconId() {
		return FontIcons.Users1;
	}

	@Override
	protected String getConfiguredOverviewIconId() {
		return FontIcons.Users1;
	}

	@Override
	protected Class<? extends ISearchForm> getConfiguredSearchForm() {
		return UsersSearchForm.class;
	}

	@Order(1000)
	public class AddMenu extends AbstractAddMenu {
		@Override
		protected void execAction() {
			UserForm form = new UserForm();
			form.startNew();
			form.waitFor();
			if (form.isFormStored()) {
				NotificationHelper.showSaveSuccessNotification();

				reloadPage();
			}
		}
	}

	public class Table extends AbstractTable {
		@Override
		protected Class<? extends IMenu> getConfiguredDefaultMenu() {
			return EditMenu.class;
		}

		@Override
		protected boolean getConfiguredAutoResizeColumns() {
			return true;
		}

		public AdministratorColumn getAdministratorColumn() {
			return getColumnSet().getColumnByClass(AdministratorColumn.class);
		}

		public FullNameColumn getFullNameColumn() {
			return getColumnSet().getColumnByClass(FullNameColumn.class);
		}

		public UserIdColumn getUserIdColumn() {
			return getColumnSet().getColumnByClass(UserIdColumn.class);
		}

		public LastLoginAtColumn getLastLoginAtColumn() {
			return getColumnSet().getColumnByClass(LastLoginAtColumn.class);
		}

		public RolesColumn getRolesColumn() {
			return getColumnSet().getColumnByClass(RolesColumn.class);
		}

		public UsernameColumn getUsernameColumn() {
			return getColumnSet().getColumnByClass(UsernameColumn.class);
		}

		@Order(1000)
		public class UserIdColumn extends AbstractIDColumn {

		}

		@Order(2000)
		public class FullNameColumn extends AbstractStringColumn {

			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("FullName");
			}

			@Override
			protected boolean getConfiguredSummary() {
				return true;
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

		@Order(3000)
		public class UsernameColumn extends AbstractStringColumn {

			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Username");
			}

			@Override
			protected boolean getConfiguredSummary() {
				return true;
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

		@Order(3437)
		public class AdministratorColumn extends AbstractBooleanColumn {

			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Administrator");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}

		}

		@Order(4000)
		public class RolesColumn extends AbstractStringColumn {

			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Roles");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

		@Order(5000)
		public class LastLoginAtColumn extends AbstractDateTimeColumn {

			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("LastLoginAt");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
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
				if (MessageBoxHelper.showDeleteConfirmationMessage() == IMessageBox.YES_OPTION) {
					BEANS.get(IUserService.class).delete(getUserIdColumn().getSelectedValue());

					NotificationHelper.showDeleteSuccessNotification();

					reloadPage();
				}
			}
		}
	}
}
