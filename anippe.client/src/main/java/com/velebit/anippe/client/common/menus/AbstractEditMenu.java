package com.velebit.anippe.client.common.menus;

import com.velebit.anippe.shared.FontIcons;

import org.eclipse.scout.rt.client.ui.action.menu.AbstractMenu;
import org.eclipse.scout.rt.client.ui.action.menu.IMenuType;
import org.eclipse.scout.rt.client.ui.action.menu.TableMenuType;
import org.eclipse.scout.rt.platform.text.TEXTS;
import org.eclipse.scout.rt.platform.util.CollectionUtility;

import java.util.Set;

public class AbstractEditMenu extends AbstractMenu {
  public AbstractEditMenu() {
    this(true);
  }

  public AbstractEditMenu(boolean callInitializer) {
    super(callInitializer);
  }

  @Override
  protected String getConfiguredText() {
    return TEXTS.get("Edit");
  }

  @Override
  protected String getConfiguredIconId() {
    return FontIcons.Pencil;
  }

  @Override
  protected Set<? extends IMenuType> getConfiguredMenuTypes() {
    return CollectionUtility.hashSet(TableMenuType.SingleSelection);
  }
}
