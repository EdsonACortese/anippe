package com.velebit.anippe.client.work.expense;

import com.velebit.anippe.client.work.expense.ExpensesTablePage.Table;
import com.velebit.anippe.shared.FontIcons;
import com.velebit.anippe.shared.work.expense.ExpensesTablePageData;
import com.velebit.anippe.shared.work.expense.IExpensesService;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.text.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

@Data(ExpensesTablePageData.class)
public class ExpensesTablePage extends AbstractPageWithTable<Table> {
    @Override
    protected boolean getConfiguredLeaf() {
        return true;
    }

    @Override
    protected void execLoadData(SearchFilter filter) {
        importPageData(BEANS.get(IExpensesService.class).getExpensesTableData(filter));
    }

    @Override
    protected String getConfiguredIconId() {
        return FontIcons.Money;
    }

    @Override
    protected String getConfiguredOverviewIconId() {
        return FontIcons.Money;
    }

    @Override
    protected String getConfiguredTitle() {
        return TEXTS.get("Expenses");
    }

    public class Table extends AbstractTable {

    }
}
