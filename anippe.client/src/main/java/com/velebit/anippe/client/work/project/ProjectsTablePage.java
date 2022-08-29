package com.velebit.anippe.client.work.project;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractDateTimeColumn;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractStringColumn;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
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
import com.velebit.anippe.client.project.ProjectForm;
import com.velebit.anippe.client.work.project.ProjectsTablePage.Table;
import com.velebit.anippe.shared.FontIcons;
import com.velebit.anippe.shared.project.IProjectService;
import com.velebit.anippe.shared.work.project.IProjectsService;
import com.velebit.anippe.shared.work.project.ProjectsTablePageData;

@Data(ProjectsTablePageData.class)
public class ProjectsTablePage extends AbstractPageWithTable<Table> {
	@Override
	protected boolean getConfiguredLeaf() {
		return true;
	}

	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(IProjectsService.class).getProjectsTableData(filter));
	}

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("Projects");
	}

	@Override
	protected String getConfiguredIconId() {
		return FontIcons.FolderOpen;
	}

	@Override
	protected String getConfiguredOverviewIconId() {
		return FontIcons.FolderOpen;
	}

	@Order(1000)
	public class AddMenu extends AbstractAddMenu {

		@Override
		protected void execAction() {
			ProjectForm form = new ProjectForm();
			form.startNew();
			form.waitFor();
			if (form.isFormStored()) {
				reloadPage();
			}
		}
	}

	public class Table extends AbstractTable {

		@Order(1000)
		public class ProjectIdColumn extends AbstractIDColumn {

		}

		public TypeColumn getTypeColumn() {
			return getColumnSet().getColumnByClass(TypeColumn.class);
		}

		public CustomerColumn getCustomerColumn() {
			return getColumnSet().getColumnByClass(CustomerColumn.class);
		}

		public DeadlineAtColumn getDeadlineAtColumn() {
			return getColumnSet().getColumnByClass(DeadlineAtColumn.class);
		}

		public UsersColumn getUsersColumn() {
			return getColumnSet().getColumnByClass(UsersColumn.class);
		}

		public NameColumn getNameColumn() {
			return getColumnSet().getColumnByClass(NameColumn.class);
		}

		public ProjectIdColumn getProjectIdColumn() {
			return getColumnSet().getColumnByClass(ProjectIdColumn.class);
		}

		@Order(1000)
		public class EditMenu extends AbstractEditMenu {

			@Override
			protected void execAction() {
				ProjectForm form = new ProjectForm();
				form.setProjectId(getProjectIdColumn().getSelectedValue());
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
				if (MessageBoxHelper.showDeleteConfirmationMessage() == IMessageBox.YES_OPTION) {
					BEANS.get(IProjectService.class).delete(getProjectIdColumn().getSelectedValue());

					NotificationHelper.showDeleteSuccessNotification();

					reloadPage();
				}
			}
		}

		@Override
		protected boolean getConfiguredAutoResizeColumns() {
			return true;
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
		public class TypeColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Type");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

		@Order(4000)
		public class CustomerColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Customer");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

		@Order(4500)
		public class UsersColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Users");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

		@Order(5000)
		public class DeadlineAtColumn extends AbstractDateTimeColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("DeadlineAt");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

	}
}
