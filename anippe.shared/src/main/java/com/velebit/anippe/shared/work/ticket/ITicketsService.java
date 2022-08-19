package com.velebit.anippe.shared.work.ticket;

import org.eclipse.scout.rt.platform.service.IService;
import org.eclipse.scout.rt.shared.TunnelToServer;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

@TunnelToServer
public interface ITicketsService extends IService {
    TicketsTablePageData getTicketsTableData(SearchFilter filter);
}
