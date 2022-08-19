package com.velebit.anippe.client.work.utility;

import com.velebit.anippe.client.work.utility.ActivityLogTablePage.Table;
import com.velebit.anippe.shared.FontIcons;
import com.velebit.anippe.shared.work.utility.ActivityLogTablePageData;
import com.velebit.anippe.shared.work.utility.IActivityLogService;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.text.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

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
    protected String getConfiguredIconId() {
        return FontIcons.History;
    }

    public class Table extends AbstractTable {

    }
}
