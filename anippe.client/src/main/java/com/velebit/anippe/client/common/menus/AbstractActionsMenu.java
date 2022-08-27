package com.velebit.anippe.client.common.menus;

import java.util.Set;

import org.eclipse.scout.rt.client.ui.action.menu.AbstractMenu;
import org.eclipse.scout.rt.client.ui.action.menu.IMenuType;
import org.eclipse.scout.rt.client.ui.action.menu.TableMenuType;
import org.eclipse.scout.rt.platform.text.TEXTS;
import org.eclipse.scout.rt.platform.util.CollectionUtility;

import com.velebit.anippe.shared.Icons;

public class AbstractActionsMenu extends AbstractMenu {
	@Override
	protected String getConfiguredText() {
		return TEXTS.get("Actions");
	}

	@Override
	protected String getConfiguredIconId() {
		return Icons.Folder;
	}

	@Override
	protected Set<? extends IMenuType> getConfiguredMenuTypes() {
		return CollectionUtility.hashSet(TableMenuType.MultiSelection);
	}

	@Override
	protected void execAction() {
	}
}
