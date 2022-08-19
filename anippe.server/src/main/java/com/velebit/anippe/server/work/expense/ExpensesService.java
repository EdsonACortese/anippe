package com.velebit.anippe.server.work.expense;

import com.velebit.anippe.shared.work.expense.ExpensesTablePageData;
import com.velebit.anippe.shared.work.expense.IExpensesService;

import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

public class ExpensesService implements IExpensesService {
    @Override
    public ExpensesTablePageData getExpensesTableData(SearchFilter filter) {
        ExpensesTablePageData pageData = new ExpensesTablePageData();
// TODO [Luka] fill pageData.
        return pageData;
    }
}
