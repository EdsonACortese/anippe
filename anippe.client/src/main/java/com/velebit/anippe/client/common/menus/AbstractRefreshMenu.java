package com.velebit.anippe.client.common.menus;

import java.util.Set;

import org.eclipse.scout.rt.client.ui.action.menu.AbstractMenu;
import org.eclipse.scout.rt.client.ui.action.menu.IMenuType;
import org.eclipse.scout.rt.client.ui.action.menu.TableMenuType;
import org.eclipse.scout.rt.platform.text.TEXTS;
import org.eclipse.scout.rt.platform.util.CollectionUtility;

import com.velebit.anippe.shared.FontIcons;

public class AbstractRefreshMenu extends AbstractMenu {
	public AbstractRefreshMenu() {
		this(true);
	}

	public AbstractRefreshMenu(boolean callInitializer) {
		super(callInitializer);
	}

	@Override
	protected String getConfiguredText() {
		return TEXTS.get("Refresh");
	}

	@Override
	protected String getConfiguredIconId() {
		return FontIcons.Spinner1;
	}

	@Override
	protected String getConfiguredKeyStroke() {
		return "R";
	}

	@Override
	protected Set<? extends IMenuType> getConfiguredMenuTypes() {
		return CollectionUtility.hashSet(TableMenuType.EmptySpace);
	}
}
