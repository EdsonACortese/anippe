package com.velebit.anippe.server.work.lead;

import org.eclipse.scout.rt.platform.holders.NVPair;
import org.eclipse.scout.rt.server.jdbc.SQL;

import com.velebit.anippe.server.ServerSession;
import com.velebit.anippe.shared.work.lead.ILeadService;
import com.velebit.anippe.shared.work.lead.LeadFormData;

public class LeadService implements ILeadService {
	@Override
	public LeadFormData prepareCreate(LeadFormData formData) {
		return formData;
	}

	@Override
	public LeadFormData create(LeadFormData formData) {
		if (formData.getLeadId() != null) {
			return store(formData);
		}

		StringBuffer varname1 = new StringBuffer();
		varname1.append("INSERT INTO leads ");
		varname1.append("            (first_name, ");
		varname1.append("             last_name, ");
		varname1.append("             created_at, ");
		varname1.append("             country_id, ");
		varname1.append("             status_id, ");
		varname1.append("             source_id, ");
		varname1.append("             organisation_id) ");
		varname1.append("VALUES      (:FirstName, ");
		varname1.append("             :LastName, ");
		varname1.append("             now(), ");
		varname1.append("             :Country, ");
		varname1.append("             1, ");
		varname1.append("             1, ");
		varname1.append("             :organisationId) ");
		varname1.append("returning id INTO :leadId");
		SQL.selectInto(varname1.toString(), formData, new NVPair("organisationId", ServerSession.get().getCurrentOrganisation().getId()));

		return formData;
	}

	@Override
	public LeadFormData load(LeadFormData formData) {
		return formData;
	}

	@Override
	public LeadFormData store(LeadFormData formData) {
		return formData;
	}
}
