package com.velebit.anippe.shared.project;

import org.eclipse.scout.rt.platform.service.IService;
import org.eclipse.scout.rt.shared.TunnelToServer;

@TunnelToServer
public interface IProjectCardService extends IService {
	ProjectCardFormData load(ProjectCardFormData formData);

	ProjectCardFormData store(ProjectCardFormData formData);
}
