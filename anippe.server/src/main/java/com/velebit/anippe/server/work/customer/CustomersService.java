package com.velebit.anippe.server.work.customer;

import com.velebit.anippe.shared.work.customer.CustomersTablePageData;
import com.velebit.anippe.shared.work.customer.ICustomersService;

import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

public class CustomersService implements ICustomersService {
    @Override
    public CustomersTablePageData getCustomersTableData(SearchFilter filter) {
        CustomersTablePageData pageData = new CustomersTablePageData();
// TODO [Luka] fill pageData.
        return pageData;
    }
}
