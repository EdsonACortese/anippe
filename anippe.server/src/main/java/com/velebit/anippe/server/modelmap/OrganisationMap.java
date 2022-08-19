package com.velebit.anippe.server.modelmap;

import com.velebit.anippe.server.dto.OrganisationDto;
import com.velebit.anippe.shared.beans.Organisation;

import org.modelmapper.PropertyMap;

public class OrganisationMap extends PropertyMap<OrganisationDto, Organisation> {

    @Override
    protected void configure() {
        map().setId(source.getId());
        map().setName(source.getName());
        map().setSubdomain(source.getSubdomain());
        map().getCountry().setId(source.getCountryId());
        map().getCountry().setName(source.getCountryName());
        map().setEmail(source.getEmail());
        map().setPhone(source.getPhone());
        map().setWebsite(source.getWebsite());
        map().setCity(source.getCity());
        map().setPostalCode(source.getPostalCode());
        map().setStreet(source.getStreet());
        map().setCreatedAt(source.getCreatedAt());
    }

}
