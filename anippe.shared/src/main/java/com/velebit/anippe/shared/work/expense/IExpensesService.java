package com.velebit.anippe.shared.work.expense;

import org.eclipse.scout.rt.platform.service.IService;
import org.eclipse.scout.rt.shared.TunnelToServer;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

@TunnelToServer
public interface IExpensesService extends IService {
    ExpensesTablePageData getExpensesTableData(SearchFilter filter);
}
