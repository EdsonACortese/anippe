package com.velebit.anippe.client.common.menus;

import com.velebit.anippe.shared.FontIcons;

import org.eclipse.scout.rt.client.ui.action.menu.AbstractMenu;
import org.eclipse.scout.rt.client.ui.action.menu.IMenuType;
import org.eclipse.scout.rt.client.ui.action.menu.TableMenuType;
import org.eclipse.scout.rt.platform.text.TEXTS;
import org.eclipse.scout.rt.platform.util.CollectionUtility;

import java.util.Set;

public class AbstractAddMenu extends AbstractMenu {
  @Override
  protected String getConfiguredIconId() {
    return FontIcons.Plus;
  }

  @Override
  protected String getConfiguredText() {
    return TEXTS.get("Add");
  }

  @Override
  protected Set<? extends IMenuType> getConfiguredMenuTypes() {
    return CollectionUtility.hashSet(TableMenuType.EmptySpace);
  }

  @Override
  protected byte getConfiguredHorizontalAlignment() {
    return 1;
  }
}
