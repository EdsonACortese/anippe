package com.velebit.anippe.server.work.customer;

import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import com.velebit.anippe.shared.work.customer.ContactsTablePageData;
import com.velebit.anippe.shared.work.customer.IContactsService;

public class ContactsService implements IContactsService {
	@Override
	public ContactsTablePageData getContactsTableData(SearchFilter filter) {
		ContactsTablePageData pageData = new ContactsTablePageData();
		// TODO [Luka] fill pageData.
		return pageData;
	}
}
