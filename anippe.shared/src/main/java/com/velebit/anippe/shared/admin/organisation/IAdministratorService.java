package com.velebit.anippe.shared.admin.organisation;

import org.eclipse.scout.rt.platform.service.IService;
import org.eclipse.scout.rt.shared.TunnelToServer;

@TunnelToServer
public interface IAdministratorService extends IService {
	AdministratorFormData prepareCreate(AdministratorFormData formData);

	AdministratorFormData create(AdministratorFormData formData);

	AdministratorFormData load(AdministratorFormData formData);

	AdministratorFormData store(AdministratorFormData formData);
}
