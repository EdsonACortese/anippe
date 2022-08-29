package com.velebit.anippe.client.work.task;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractColumn;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractDateTimeColumn;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractSmartColumn;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractStringColumn;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.text.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import com.velebit.anippe.client.common.columns.AbstractRelatedColumn;
import com.velebit.anippe.client.common.menus.AbstractAddMenu;
import com.velebit.anippe.client.common.menus.AbstractDeleteMenu;
import com.velebit.anippe.client.common.menus.AbstractEditMenu;
import com.velebit.anippe.client.work.task.TasksTablePage.Table;
import com.velebit.anippe.shared.FontIcons;
import com.velebit.anippe.shared.beans.Task;
import com.velebit.anippe.shared.work.task.ITasksService;
import com.velebit.anippe.shared.work.task.TasksTablePageData;

@Data(TasksTablePageData.class)
public class TasksTablePage extends AbstractPageWithTable<Table> {
	@Override
	protected boolean getConfiguredLeaf() {
		return true;
	}

	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(ITasksService.class).getTasksTableData(filter));
	}

	@Override
	protected String getConfiguredIconId() {
		return FontIcons.Tasks;
	}

	@Override
	protected String getConfiguredOverviewIconId() {
		return FontIcons.Tasks;
	}

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("Tasks");
	}

	@Order(1000)
	public class AddMenu extends AbstractAddMenu {

		@Override
		protected void execAction() {
		}
	}

	public class Table extends AbstractTable {
		@Override
		protected boolean getConfiguredAutoResizeColumns() {
			return true;
		}

		public CreatedAtColumn getCreatedAtColumn() {
			return getColumnSet().getColumnByClass(CreatedAtColumn.class);
		}

		public StatusColumn getStatusColumn() {
			return getColumnSet().getColumnByClass(StatusColumn.class);
		}

		public PriorityColumn getPriorityColumn() {
			return getColumnSet().getColumnByClass(PriorityColumn.class);
		}

		public RelatedColumn getRelatedColumn() {
			return getColumnSet().getColumnByClass(RelatedColumn.class);
		}

		public DeadlineAtColumn getDeadlineAtColumn() {
			return getColumnSet().getColumnByClass(DeadlineAtColumn.class);
		}

		public NameColumn getNameColumn() {
			return getColumnSet().getColumnByClass(NameColumn.class);
		}

		public TaskColumn getTaskColumn() {
			return getColumnSet().getColumnByClass(TaskColumn.class);
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
		public class TaskColumn extends AbstractColumn<Task> {
			@Override
			protected boolean getConfiguredDisplayable() {
				return false;
			}
		}

		@Order(1500)
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

		@Order(1750)
		public class StatusColumn extends AbstractSmartColumn<Long> {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Status");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

		@Order(1812)
		public class RelatedColumn extends AbstractRelatedColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Related");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

		@Order(1875)
		public class PriorityColumn extends AbstractSmartColumn<Long> {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Priority");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

		@Order(1937)
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

		@Order(2000)
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
