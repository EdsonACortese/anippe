package com.velebit.anippe.client.extensions;

import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.IPlatform.State;
import org.eclipse.scout.rt.platform.IPlatformListener;
import org.eclipse.scout.rt.platform.PlatformEvent;
import org.eclipse.scout.rt.shared.extension.IExtensionRegistry;

public class RegisterExtensionsListener implements IPlatformListener {
    @Override
    public void stateChanged(PlatformEvent event) {
        if (event.getState() == State.PlatformStarted) {
            BEANS.get(IExtensionRegistry.class).register(ScoutButtonsExtension.class);
            BEANS.get(IExtensionRegistry.class).register(ScoutSearchFormExtension.class);
            BEANS.get(IExtensionRegistry.class).register(ScoutFormTitleExtension.class);
        }
    }
}
