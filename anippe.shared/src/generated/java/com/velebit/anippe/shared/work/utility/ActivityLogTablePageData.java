package com.velebit.anippe.shared.work.utility;

import org.eclipse.scout.rt.shared.data.basic.table.AbstractTableRowData;
import org.eclipse.scout.rt.shared.data.page.AbstractTablePageData;

import javax.annotation.Generated;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications recommended.
 */
@Generated(value = "com.velebit.anippe.client.work.utility.ActivityLogTablePage", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class ActivityLogTablePageData extends AbstractTablePageData {
    private static final long serialVersionUID = 1L;

    @Override
    public ActivityLogTableRowData addRow() {
        return (ActivityLogTableRowData) super.addRow();
    }

    @Override
    public ActivityLogTableRowData addRow(int rowState) {
        return (ActivityLogTableRowData) super.addRow(rowState);
    }

    @Override
    public ActivityLogTableRowData createRow() {
        return new ActivityLogTableRowData();
    }

    @Override
    public Class<? extends AbstractTableRowData> getRowType() {
        return ActivityLogTableRowData.class;
    }

    @Override
    public ActivityLogTableRowData[] getRows() {
        return (ActivityLogTableRowData[]) super.getRows();
    }

    @Override
    public ActivityLogTableRowData rowAt(int index) {
        return (ActivityLogTableRowData) super.rowAt(index);
    }

    public void setRows(ActivityLogTableRowData[] rows) {
        super.setRows(rows);
    }

    public static class ActivityLogTableRowData extends AbstractTableRowData {
        private static final long serialVersionUID = 1L;
    }
}