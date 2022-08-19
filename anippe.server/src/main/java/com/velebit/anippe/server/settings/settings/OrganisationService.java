package com.velebit.anippe.server.settings.settings;

import com.velebit.anippe.shared.settings.settings.IOrganisationService;
import com.velebit.anippe.shared.settings.settings.OrganisationFormData;

public class OrganisationService implements IOrganisationService {
    @Override
    public OrganisationFormData prepareCreate(OrganisationFormData formData) {
        return formData;
    }

    @Override
    public OrganisationFormData create(OrganisationFormData formData) {
        return formData;
    }

    @Override
    public OrganisationFormData load(OrganisationFormData formData) {
        return formData;
    }

    @Override
    public OrganisationFormData store(OrganisationFormData formData) {
        return formData;
    }
}
