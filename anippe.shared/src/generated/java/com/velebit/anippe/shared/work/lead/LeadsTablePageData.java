package com.velebit.anippe.shared.work.lead;

import org.eclipse.scout.rt.shared.data.basic.table.AbstractTableRowData;
import org.eclipse.scout.rt.shared.data.page.AbstractTablePageData;

import javax.annotation.Generated;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications recommended.
 */
@Generated(value = "com.velebit.anippe.client.work.lead.LeadsTablePage", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class LeadsTablePageData extends AbstractTablePageData {
    private static final long serialVersionUID = 1L;

    @Override
    public LeadsTableRowData addRow() {
        return (LeadsTableRowData) super.addRow();
    }

    @Override
    public LeadsTableRowData addRow(int rowState) {
        return (LeadsTableRowData) super.addRow(rowState);
    }

    @Override
    public LeadsTableRowData createRow() {
        return new LeadsTableRowData();
    }

    @Override
    public Class<? extends AbstractTableRowData> getRowType() {
        return LeadsTableRowData.class;
    }

    @Override
    public LeadsTableRowData[] getRows() {
        return (LeadsTableRowData[]) super.getRows();
    }

    @Override
    public LeadsTableRowData rowAt(int index) {
        return (LeadsTableRowData) super.rowAt(index);
    }

    public void setRows(LeadsTableRowData[] rows) {
        super.setRows(rows);
    }

    public static class LeadsTableRowData extends AbstractTableRowData {
        private static final long serialVersionUID = 1L;
    }
}
