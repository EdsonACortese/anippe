package com.velebit.anippe.shared.work.ticket;

import org.eclipse.scout.rt.shared.data.basic.table.AbstractTableRowData;
import org.eclipse.scout.rt.shared.data.page.AbstractTablePageData;

import javax.annotation.Generated;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications recommended.
 */
@Generated(value = "com.velebit.anippe.client.work.ticket.TicketsTablePage", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class TicketsTablePageData extends AbstractTablePageData {
    private static final long serialVersionUID = 1L;

    @Override
    public TicketsTableRowData addRow() {
        return (TicketsTableRowData) super.addRow();
    }

    @Override
    public TicketsTableRowData addRow(int rowState) {
        return (TicketsTableRowData) super.addRow(rowState);
    }

    @Override
    public TicketsTableRowData createRow() {
        return new TicketsTableRowData();
    }

    @Override
    public Class<? extends AbstractTableRowData> getRowType() {
        return TicketsTableRowData.class;
    }

    @Override
    public TicketsTableRowData[] getRows() {
        return (TicketsTableRowData[]) super.getRows();
    }

    @Override
    public TicketsTableRowData rowAt(int index) {
        return (TicketsTableRowData) super.rowAt(index);
    }

    public void setRows(TicketsTableRowData[] rows) {
        super.setRows(rows);
    }

    public static class TicketsTableRowData extends AbstractTableRowData {
        private static final long serialVersionUID = 1L;
    }
}