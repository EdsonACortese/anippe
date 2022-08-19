package com.velebit.anippe.ui.html;

import java.io.IOException;
import java.util.concurrent.Callable;

import javax.security.auth.Subject;

import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.context.RunContext;
import org.eclipse.scout.rt.platform.context.RunContexts;
import org.eclipse.scout.rt.platform.security.Crypter;
import org.eclipse.scout.rt.platform.security.ICredentialVerifier;
import org.eclipse.scout.rt.platform.security.SimplePrincipal;
import org.eclipse.scout.rt.shared.TunnelToServer;

import com.velebit.anippe.shared.ILoginService;
import com.velebit.anippe.shared.beans.User;

@TunnelToServer
public class DataSourceCredentialVerifier extends Crypter implements ICredentialVerifier {

	@Override
	public int verify(String username, char[] password) throws IOException {

		Subject subject = new Subject();
		subject.getPrincipals().add(new SimplePrincipal(username));
		subject.setReadOnly();

		RunContext runContext = RunContexts.copyCurrent(true).withSubject(subject);
		Object result = null;

		result = findUser(username, password, runContext);

		User user = (User) result;

		if (user != null && user.getId() != null && user.getId() > 0) {
			return ICredentialVerifier.AUTH_OK;
		}

		return ICredentialVerifier.AUTH_FORBIDDEN;
	}

	private User findUser(String username, char[] password, RunContext runContext) {
		User result = runContext.call(new Callable<User>() {

			@Override
			public User call() throws Exception {
				return BEANS.get(ILoginService.class).getUser(username, new String(password));
			}

		});

		return result;
	}

}
