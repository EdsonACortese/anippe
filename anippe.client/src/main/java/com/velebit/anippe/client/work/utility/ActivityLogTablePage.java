package com.velebit.anippe.client.work.utility;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractDateTimeColumn;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractSmartColumn;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractStringColumn;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.ISearchForm;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.text.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;
import org.eclipse.scout.rt.shared.services.lookup.ILookupCall;

import com.velebit.anippe.client.common.columns.AbstractIDColumn;
import com.velebit.anippe.client.lookups.RelatedLookupCall;
import com.velebit.anippe.client.work.utility.ActivityLogTablePage.Table;
import com.velebit.anippe.shared.FontIcons;
import com.velebit.anippe.shared.work.utility.ActivityLogTablePageData;
import com.velebit.anippe.shared.work.utility.IActivityLogService;

@Data(ActivityLogTablePageData.class)
public class ActivityLogTablePage extends AbstractPageWithTable<Table> {
	@Override
	protected boolean getConfiguredLeaf() {
		return true;
	}

	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(IActivityLogService.class).getActivityLogTableData(filter));
	}

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("ActivityLog");
	}

	@Override
	protected String getConfiguredOverviewIconId() {
		return FontIcons.History;
	}

	@Override
	protected Class<? extends ISearchForm> getConfiguredSearchForm() {
		return ActivityLogSearchForm.class;
	}

	@Override
	protected String getConfiguredIconId() {
		return FontIcons.History;
	}

	public class Table extends AbstractTable {

		@Override
		protected boolean getConfiguredAutoResizeColumns() {
			return true;
		}

		public CreatedAtColumn getCreatedAtColumn() {
			return getColumnSet().getColumnByClass(CreatedAtColumn.class);
		}

		public ActionColumn getActionColumn() {
			return getColumnSet().getColumnByClass(ActionColumn.class);
		}

		public RelatedNameColumn getRelatedNameColumn() {
			return getColumnSet().getColumnByClass(RelatedNameColumn.class);
		}

		public RelatedIdColumn getRelatedIdColumn() {
			return getColumnSet().getColumnByClass(RelatedIdColumn.class);
		}

		public RelatedTypeColumn getRelatedTypeColumn() {
			return getColumnSet().getColumnByClass(RelatedTypeColumn.class);
		}

		public UserColumn getUserColumn() {
			return getColumnSet().getColumnByClass(UserColumn.class);
		}

		public LogIdColumn getLogIdColumn() {
			return getColumnSet().getColumnByClass(LogIdColumn.class);
		}

		@Order(1000)
		public class LogIdColumn extends AbstractIDColumn {

		}

		@Order(2000)
		public class CreatedAtColumn extends AbstractDateTimeColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("CreatedAt");
			}

			@Override
			protected int getConfiguredWidth() {
				return 120;
			}
		}

		@Order(3000)
		public class UserColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("User");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

		@Order(4000)
		public class ActionColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Action");
			}

			@Override
			protected int getConfiguredWidth() {
				return 150;
			}
		}

		@Order(5000)
		public class RelatedTypeColumn extends AbstractSmartColumn<Integer> {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Module");
			}

			@Override
			protected Class<? extends ILookupCall<Integer>> getConfiguredLookupCall() {
				return RelatedLookupCall.class;
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}

		}

		@Order(6000)
		public class RelatedIdColumn extends AbstractIDColumn {

		}

		@Order(7000)
		public class RelatedNameColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Entry");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}
	}
}
