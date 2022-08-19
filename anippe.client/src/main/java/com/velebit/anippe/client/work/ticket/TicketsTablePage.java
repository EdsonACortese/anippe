package com.velebit.anippe.client.work.ticket;

import com.velebit.anippe.client.work.ticket.TicketsTablePage.Table;
import com.velebit.anippe.shared.FontIcons;
import com.velebit.anippe.shared.work.ticket.ITicketsService;
import com.velebit.anippe.shared.work.ticket.TicketsTablePageData;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.text.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

@Data(TicketsTablePageData.class)
public class TicketsTablePage extends AbstractPageWithTable<Table> {
    @Override
    protected boolean getConfiguredLeaf() {
        return true;
    }

    @Override
    protected void execLoadData(SearchFilter filter) {
        importPageData(BEANS.get(ITicketsService.class).getTicketsTableData(filter));
    }

    @Override
    protected String getConfiguredOverviewIconId() {
        return FontIcons.Question;
    }

    @Override
    protected String getConfiguredIconId() {
        return FontIcons.Question;
    }

    @Override
    protected String getConfiguredTitle() {
        return TEXTS.get("Tickets");
    }

    public class Table extends AbstractTable {

    }
}
