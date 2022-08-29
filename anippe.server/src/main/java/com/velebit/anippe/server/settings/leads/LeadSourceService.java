package com.velebit.anippe.server.settings.leads;

import com.velebit.anippe.shared.settings.leads.ILeadSourceService;
import com.velebit.anippe.shared.settings.leads.LeadSourceFormData;

public class LeadSourceService implements ILeadSourceService {
	@Override
	public LeadSourceFormData prepareCreate(LeadSourceFormData formData) {
		return formData;
	}

	@Override
	public LeadSourceFormData create(LeadSourceFormData formData) {
		return formData;
	}

	@Override
	public LeadSourceFormData load(LeadSourceFormData formData) {
		return formData;
	}

	@Override
	public LeadSourceFormData store(LeadSourceFormData formData) {
		return formData;
	}
}
