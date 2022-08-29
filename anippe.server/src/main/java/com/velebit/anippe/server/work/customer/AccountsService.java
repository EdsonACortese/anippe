package com.velebit.anippe.server.work.customer;

import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import com.velebit.anippe.shared.work.customer.AccountsTablePageData;
import com.velebit.anippe.shared.work.customer.IAccountsService;

public class AccountsService implements IAccountsService {
	@Override
	public AccountsTablePageData getAccountsTableData(SearchFilter filter) {
		AccountsTablePageData pageData = new AccountsTablePageData();
		// TODO [Luka] fill pageData.
		return pageData;
	}
}
