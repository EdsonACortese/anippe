package com.velebit.anippe.client.settings.users;

import com.velebit.anippe.shared.FontIcons;

import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithNodes;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.IPage;
import org.eclipse.scout.rt.platform.text.TEXTS;

import java.util.List;

public class UsersNodePage extends AbstractPageWithNodes {
  @Override
  protected void execCreateChildPages(List<IPage<?>> pageList) {
    super.execCreateChildPages(pageList);

    pageList.add(new UsersTablePage());
  }

  @Override
  protected boolean getConfiguredShowTileOverview() {
    return true;
  }

  @Override
  protected String getConfiguredOverviewIconId() {
    return FontIcons.Users1;
  }

  @Override
  protected String getConfiguredIconId() {
    return FontIcons.Users1;
  }

  @Override
  protected String getConfiguredTitle() {
    return TEXTS.get("Users");
  }
}
