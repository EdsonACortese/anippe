package com.velebit.anippe.client.work.utility;

import com.velebit.anippe.shared.FontIcons;

import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithNodes;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.IPage;
import org.eclipse.scout.rt.platform.text.TEXTS;

import java.util.List;

public class UtilityNodePage extends AbstractPageWithNodes {
    @Override
    protected void execCreateChildPages(List<IPage<?>> pageList) {
        super.execCreateChildPages(pageList);

        pageList.add(new ActivityLogTablePage());
    }

    @Override
    protected boolean getConfiguredShowTileOverview() {
        return true;
    }

    @Override
    protected String getConfiguredOverviewIconId() {
        return FontIcons.Hammer;
    }

    @Override
    protected String getConfiguredIconId() {
        return FontIcons.Hammer;
    }

    @Override
    protected String getConfiguredTitle() {
        return TEXTS.get("Utility");
    }
}
