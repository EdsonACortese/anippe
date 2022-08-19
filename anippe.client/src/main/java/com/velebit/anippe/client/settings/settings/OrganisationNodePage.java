package com.velebit.anippe.client.settings.settings;

import com.velebit.anippe.shared.FontIcons;

import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithNodes;
import org.eclipse.scout.rt.client.ui.form.IForm;
import org.eclipse.scout.rt.platform.text.TEXTS;

public class OrganisationNodePage extends AbstractPageWithNodes {

    @Override
    protected boolean getConfiguredLeaf() {
        return true;
    }

    @Override
    protected String getConfiguredOverviewIconId() {
        return FontIcons.Building;
    }

    @Override
    protected String getConfiguredIconId() {
        return FontIcons.Building;
    }

    @Override
    protected String getConfiguredTitle() {
        return TEXTS.get("Organisation");
    }

    @Override
    protected boolean getConfiguredTableVisible() {
        return false;
    }

    @Override
    protected void execInitDetailForm() {
        OrganisationForm form = (OrganisationForm) getDetailForm();

        if (form == null)
            return;
        form.startModify();
    }

    @Override
    protected Class<? extends IForm> getConfiguredDetailForm() {
        return OrganisationForm.class;
    }

    ;
}
