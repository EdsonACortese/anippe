package com.velebit.anippe.client.extensions;

import com.velebit.anippe.shared.FontIcons;

import org.eclipse.scout.rt.client.extension.ui.form.AbstractFormExtension;
import org.eclipse.scout.rt.client.extension.ui.form.FormChains.FormInitFormChain;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractSearchForm;
import org.eclipse.scout.rt.client.ui.form.AbstractForm;
import org.eclipse.scout.rt.platform.text.TEXTS;

public class ScoutSearchFormExtension extends AbstractFormExtension<AbstractForm> {
    public ScoutSearchFormExtension(AbstractForm ownerField) {
        super(ownerField);
    }

    @Override
    public void execInitForm(FormInitFormChain chain) {
        super.execInitForm(chain);

        if (getOwner() instanceof AbstractSearchForm) {
            getOwner().setTitle(TEXTS.get("Search"));
            getOwner().setIconId(FontIcons.Search);
        }
    }

}
