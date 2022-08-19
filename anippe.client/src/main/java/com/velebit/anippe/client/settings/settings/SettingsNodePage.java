package com.velebit.anippe.client.settings.settings;

import com.velebit.anippe.shared.FontIcons;

import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithNodes;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.IPage;
import org.eclipse.scout.rt.platform.text.TEXTS;

import java.util.List;

public class SettingsNodePage extends AbstractPageWithNodes {
    @Override
    protected void execCreateChildPages(List<IPage<?>> pageList) {

        pageList.add(new OrganisationNodePage());
        pageList.add(new EmailNodePage());
    }

    @Override
    protected boolean getConfiguredShowTileOverview() {
        return true;
    }

    @Override
    protected String getConfiguredOverviewIconId() {
        return FontIcons.Gear;
    }

    @Override
    protected String getConfiguredIconId() {
        return FontIcons.Gear;
    }

    @Override
    protected String getConfiguredTitle() {
        return TEXTS.get("Settings");
    }
}
