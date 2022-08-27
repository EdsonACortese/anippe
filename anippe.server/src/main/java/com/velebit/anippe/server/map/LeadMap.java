package com.velebit.anippe.server.map;

import org.modelmapper.PropertyMap;

import com.velebit.anippe.shared.beans.Lead;
import com.velebit.anippe.shared.dto.LeadDTO;

public class LeadMap extends PropertyMap<LeadDTO, Lead> {

	@Override
	protected void configure() {
		map().setId(source.getId());
		map().setFirstName(source.getFirstName());
		map().setLastName(source.getLastName());
	}

}
