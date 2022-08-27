package com.velebit.anippe.server.dao;

import java.util.Arrays;
import java.util.List;

import org.eclipse.scout.rt.platform.Bean;
import org.eclipse.scout.rt.platform.holders.BeanArrayHolder;
import org.eclipse.scout.rt.platform.holders.NVPair;
import org.eclipse.scout.rt.platform.util.CollectionUtility;
import org.eclipse.scout.rt.server.jdbc.SQL;
import org.modelmapper.ModelMapper;

import com.velebit.anippe.server.ServerSession;
import com.velebit.anippe.server.map.LeadMap;
import com.velebit.anippe.shared.beans.Lead;
import com.velebit.anippe.shared.dto.LeadDTO;
import com.velebit.anippe.shared.requests.LeadRequest;

@Bean
public class LeadDao {

	public List<Lead> findByRequest(LeadRequest request) {
		BeanArrayHolder<LeadDTO> holder = new BeanArrayHolder<>(LeadDTO.class);

		List<Lead> items = CollectionUtility.emptyArrayList();

		StringBuffer varname1 = new StringBuffer();
		varname1.append("SELECT l.id, ");
		varname1.append("       l.first_name, ");
		varname1.append("       l.last_name, ");
		varname1.append("       l.email, ");
		varname1.append("       l.phone, ");
		varname1.append("       l.website, ");
		varname1.append("       l.address, ");
		varname1.append("       l.city, ");
		varname1.append("       l.postal_code, ");
		varname1.append("       l.country_id, ");
		varname1.append("       c.NAME, ");
		varname1.append("       l.description, ");
		varname1.append("       l.status_id, ");
		varname1.append("       l.source_id, ");
		varname1.append("       ls.NAME, ");
		varname1.append("       st.NAME ");
		varname1.append("FROM   leads l, ");
		varname1.append("       countries c, ");
		varname1.append("       lead_statuses st, ");
		varname1.append("       lead_sources ls ");
		varname1.append("WHERE  l.status_id = st.id ");
		varname1.append("       AND l.source_id = ls.id ");
		varname1.append("       AND l.country_id = c.id ");
		varname1.append("       AND l.deleted_at IS NULL ");
		varname1.append("       AND l.organisation_id = :organisationId ");
		varname1.append("ORDER  BY l.first_name, ");
		varname1.append("          l.last_name ");
		varname1.append("INTO ");
		varname1.append(":{holder.id}, ");
		varname1.append(":{holder.firstName}, ");
		varname1.append(":{holder.lastName} ");
		SQL.selectInto(varname1.toString(), new NVPair("organisationId", ServerSession.get().getCurrentOrganisation().getId()), new NVPair("holder", holder));

		ModelMapper modelMapper = new ModelMapper();
		modelMapper.addMappings(new LeadMap());

		List<LeadDTO> dtos = Arrays.asList(holder.getBeans());

		dtos.forEach(item -> items.add(modelMapper.map(item, Lead.class)));

		return items;
	}

	public Lead find(Integer leadId) {
		return null;
	}

}
