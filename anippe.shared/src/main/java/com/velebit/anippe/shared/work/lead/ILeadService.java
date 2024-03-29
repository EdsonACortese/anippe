package com.velebit.anippe.shared.work.lead;

import org.eclipse.scout.rt.platform.service.IService;
import org.eclipse.scout.rt.shared.TunnelToServer;

@TunnelToServer
public interface ILeadService extends IService {
	LeadFormData prepareCreate(LeadFormData formData);

	LeadFormData create(LeadFormData formData);

	LeadFormData load(LeadFormData formData);

	LeadFormData store(LeadFormData formData);
}
