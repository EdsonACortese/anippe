package com.velebit.anippe.server;

import com.velebit.anippe.shared.beans.Organisation;
import com.velebit.anippe.shared.beans.User;

import org.eclipse.scout.rt.platform.exception.VetoException;
import org.eclipse.scout.rt.platform.text.TEXTS;

public abstract class AbstractService {

    public AbstractService() {
        super();
    }

    protected User getCurrentUser() {
        return ServerSession.get().getCurrentUser();
    }

    protected Integer getCurrentUserId() {
        return ServerSession.get().getCurrentUser().getId();
    }

    protected Organisation getCurrentOrganisation() {
        return ServerSession.get().getCurrentOrganisation();
    }


    protected Integer getCurrentOrganisationId() {
        return ServerSession.get().getCurrentOrganisation().getId();
    }

    protected void error(String error) {
        error(error, null);
    }

    protected void accessDenied() {
        throw new VetoException(TEXTS.get("NoPermission"));
    }

    protected void error(String message, String title) {
        if (title == null) title = TEXTS.get("Error");

        throw new VetoException(message != null ? message : TEXTS.get("ErrorAndRetryTextDefault")).withTitle(title);
    }

}
