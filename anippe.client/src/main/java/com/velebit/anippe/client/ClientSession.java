package com.velebit.anippe.client;

import org.eclipse.scout.rt.client.AbstractClientSession;
import org.eclipse.scout.rt.client.IClientSession;
import org.eclipse.scout.rt.client.session.ClientSessionProvider;
import org.eclipse.scout.rt.shared.services.common.code.CODES;

import com.velebit.anippe.shared.beans.Organisation;
import com.velebit.anippe.shared.beans.User;

/**
 * @author Luka
 */
public class ClientSession extends AbstractClientSession {

	public ClientSession() {
		super(true);
	}

	/**
	 * @return The {@link IClientSession} which is associated with the current
	 *         thread, or {@code null} if not found.
	 */
	public static ClientSession get() {
		return ClientSessionProvider.currentSession(ClientSession.class);
	}

	@Override
	protected void execLoadSession() {
		// pre-load all known code types
		CODES.getAllCodeTypes("com.velebit.anippe.shared");

		setDesktop(new Desktop());
	}

	public User getCurrentUser() {
		return getSharedContextVariable("CURRENT_USER", User.class);
	}

	public Organisation getCurrentOrganisation() {
		return getSharedContextVariable("CURRENT_ORGANISATION", Organisation.class);
	}
}
