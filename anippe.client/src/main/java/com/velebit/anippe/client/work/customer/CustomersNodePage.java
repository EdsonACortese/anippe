package com.velebit.anippe.client.work.customer;

import java.util.List;

import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithNodes;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.IPage;
import org.eclipse.scout.rt.platform.text.TEXTS;

import com.velebit.anippe.shared.FontIcons;

public class CustomersNodePage extends AbstractPageWithNodes {
	@Override
	protected void execCreateChildPages(List<IPage<?>> pageList) {
		super.execCreateChildPages(pageList);

		pageList.add(new AccountsTablePage());
		pageList.add(new ContactsTablePage());
	}

	@Override
	protected String getConfiguredIconId() {
		return FontIcons.Users1;
	}

	@Override
	protected String getConfiguredOverviewIconId() {
		return FontIcons.Users1;
	}

	@Override
	protected boolean getConfiguredShowTileOverview() {
		return true;
	}

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("Customers");
	}
}
