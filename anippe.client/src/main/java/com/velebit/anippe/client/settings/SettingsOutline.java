package com.velebit.anippe.client.settings;

import java.util.List;

import org.eclipse.scout.rt.client.ui.desktop.outline.AbstractOutline;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.IPage;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.text.TEXTS;

import com.velebit.anippe.client.settings.leads.LeadsNodePage;
import com.velebit.anippe.client.settings.settings.SettingsNodePage;
import com.velebit.anippe.client.settings.users.UsersNodePage;
import com.velebit.anippe.shared.Icons;

/**
 * @author Luka
 */
@Order(3000)
public class SettingsOutline extends AbstractOutline {

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("Settings");
	}

	@Override
	protected String getConfiguredIconId() {
		return Icons.Gear;
	}

	@Override
	protected void execCreateChildPages(List<IPage<?>> pageList) {
		super.execCreateChildPages(pageList);

		pageList.add(new UsersNodePage());
		pageList.add(new LeadsNodePage());
		pageList.add(new SettingsNodePage());
	}
}
