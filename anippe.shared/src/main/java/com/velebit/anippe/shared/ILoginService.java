package com.velebit.anippe.shared;

import com.velebit.anippe.shared.beans.Organisation;
import com.velebit.anippe.shared.beans.User;

import org.eclipse.scout.rt.platform.service.IService;
import org.eclipse.scout.rt.shared.TunnelToServer;

@TunnelToServer
public interface ILoginService extends IService {

    User getUserByUsername(String userId);

    Organisation getCurrentOrganisation(Integer organisationId);

    User getUser(String username, String password);

}
