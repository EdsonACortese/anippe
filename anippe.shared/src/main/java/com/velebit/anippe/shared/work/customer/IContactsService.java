package com.velebit.anippe.shared.work.customer;

import org.eclipse.scout.rt.platform.service.IService;
import org.eclipse.scout.rt.shared.TunnelToServer;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

@TunnelToServer
public interface IContactsService extends IService {
	ContactsTablePageData getContactsTableData(SearchFilter filter);
}
