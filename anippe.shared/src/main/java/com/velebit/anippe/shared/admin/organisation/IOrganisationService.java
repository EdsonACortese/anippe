package com.velebit.anippe.shared.admin.organisation;

import java.util.List;

import org.eclipse.scout.rt.platform.service.IService;
import org.eclipse.scout.rt.shared.TunnelToServer;

import com.velebit.anippe.shared.admin.organisation.OrganisationFormData.AdministratorsTable.AdministratorsTableRowData;

@TunnelToServer
public interface IOrganisationService extends IService {
    OrganisationFormData prepareCreate(OrganisationFormData formData);

    OrganisationFormData create(OrganisationFormData formData);

    OrganisationFormData load(OrganisationFormData formData);

    OrganisationFormData store(OrganisationFormData formData);

	List<AdministratorsTableRowData> fetchAdministrators(Integer organisationId);
}
