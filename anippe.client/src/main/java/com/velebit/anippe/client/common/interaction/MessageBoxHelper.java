package com.velebit.anippe.client.common.interaction;

import com.velebit.anippe.shared.FontIcons;

import org.eclipse.scout.rt.client.ui.messagebox.MessageBoxes;
import org.eclipse.scout.rt.platform.text.TEXTS;

public class MessageBoxHelper {
    private static int showMessage(String header, String body) {
        return MessageBoxes.createOk().withIconId(FontIcons.Info).withHeader(header).withBody(body).withYesButtonText(TEXTS.get("Ok")).show();
    }

    public static int showWarningMessage(String body) {
        return showMessage(TEXTS.get("Warning"), body);
    }

    public static int showDeleteConfirmationMessage() {
        return MessageBoxes.createYesNoCancel().withIconId(FontIcons.RemoveBold).withHeader(TEXTS.get("ConfirmDeletion"))
                .withBody(TEXTS.get("DeleteConfirmationText")).show();
    }

    public static int showDeleteConfirmationMessage(String message) {
        return MessageBoxes.createYesNoCancel().withIconId(FontIcons.RemoveBold).withHeader(TEXTS.get("ConfirmDeletion"))
                .withBody(message).show();
    }

    public static int showYesNoConfirmationMessage(String message) {
        return MessageBoxes.createYesNoCancel().withIconId(FontIcons.Question).withHeader(TEXTS.get("AreYouSure")).withBody(message).show();
    }

    public static int showYesNoConfirmationMessage() {
        return MessageBoxes.createYesNoCancel().withIconId(FontIcons.Question).withHeader(TEXTS.get("AreYouSure")).withBody(TEXTS.get("AreYouSureYouWantToPerformThisAction")).show();
    }
}
