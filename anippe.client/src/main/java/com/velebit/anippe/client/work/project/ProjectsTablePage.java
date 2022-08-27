package com.velebit.anippe.client.work.project;

import com.velebit.anippe.client.common.menus.AbstractAddMenu;
import com.velebit.anippe.client.common.menus.AbstractDeleteMenu;
import com.velebit.anippe.client.common.menus.AbstractEditMenu;
import com.velebit.anippe.client.work.project.ProjectsTablePage.Table;
import com.velebit.anippe.shared.FontIcons;
import com.velebit.anippe.shared.work.project.IProjectsService;
import com.velebit.anippe.shared.work.project.ProjectsTablePageData;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.text.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

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
