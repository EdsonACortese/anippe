package com.velebit.anippe.shared.work.customer;

import org.eclipse.scout.rt.platform.service.IService;
import org.eclipse.scout.rt.shared.TunnelToServer;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

@TunnelToServer
public interface IAccountsService extends IService {
	AccountsTablePageData getAccountsTableData(SearchFilter filter);
}
