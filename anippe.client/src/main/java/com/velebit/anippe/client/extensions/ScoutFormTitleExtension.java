package com.velebit.anippe.client.extensions;

import org.eclipse.scout.rt.client.extension.ui.form.AbstractFormExtension;
import org.eclipse.scout.rt.client.extension.ui.form.FormChains.FormInitFormChain;
import org.eclipse.scout.rt.client.ui.form.AbstractForm;
import org.eclipse.scout.rt.platform.text.TEXTS;
import org.eclipse.scout.rt.platform.util.StringUtility;

public class ScoutFormTitleExtension extends AbstractFormExtension<AbstractForm> {
    public ScoutFormTitleExtension(AbstractForm ownerField) {
        super(ownerField);
    }

    @Override
    public void execInitForm(FormInitFormChain chain) {
        super.execInitForm(chain);

        //Set subtitle globally if not set
        if (getOwner().getSubTitle() == null) {
            getOwner().setSubTitle(TEXTS.get("NewEntry"));
        }

        if (StringUtility.containsStringIgnoreCase(getOwner().getHandler().getHandlerId(), "ModifyHandler")) {
            if (getOwner().getSubTitle() != null) {
                getOwner().setSubTitle(TEXTS.get("ViewEntry"));
            }
        }
    }

}
