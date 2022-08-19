package com.velebit.anippe.server.work.ticket;

import com.velebit.anippe.shared.work.ticket.ITicketsService;
import com.velebit.anippe.shared.work.ticket.TicketsTablePageData;

import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

public class TicketsService implements ITicketsService {
    @Override
    public TicketsTablePageData getTicketsTableData(SearchFilter filter) {
        TicketsTablePageData pageData = new TicketsTablePageData();
// TODO [Luka] fill pageData.
        return pageData;
    }
}
