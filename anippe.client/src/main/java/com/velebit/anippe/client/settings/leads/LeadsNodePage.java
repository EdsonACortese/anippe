package com.velebit.anippe.client.settings.leads;

import java.util.List;

import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithNodes;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.IPage;
import org.eclipse.scout.rt.platform.text.TEXTS;

import com.velebit.anippe.shared.FontIcons;

public class LeadsNodePage extends AbstractPageWithNodes {
	@Override
	protected void execCreateChildPages(List<IPage<?>> pageList) {
		super.execCreateChildPages(pageList);

		pageList.add(new LeadSourcesTablePage());
		pageList.add(new LeadStatusesTablePage());
	}

	@Override
	protected String getConfiguredOverviewIconId() {
		return FontIcons.UserPlus;
	}

	@Override
	protected String getConfiguredIconId() {
		return FontIcons.UserPlus;
	}

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("Leads");
	}
}
