package com.velebit.anippe.server.admin.organisation;

import java.util.Arrays;
import java.util.List;

import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.holders.BeanArrayHolder;
import org.eclipse.scout.rt.platform.holders.NVPair;
import org.eclipse.scout.rt.server.jdbc.SQL;

import com.velebit.anippe.shared.admin.organisation.IOrganisationService;
import com.velebit.anippe.shared.admin.organisation.OrganisationFormData;
import com.velebit.anippe.shared.admin.organisation.OrganisationFormData.AdministratorsTable.AdministratorsTableRowData;

public class OrganisationService implements IOrganisationService {
	@Override
	public OrganisationFormData prepareCreate(OrganisationFormData formData) {
		return formData;
	}

	@Override
	public OrganisationFormData create(OrganisationFormData formData) {
		if (formData.getOrganisationId() != null) {
			return store(formData);
		}

		StringBuffer varname1 = new StringBuffer();
		varname1.append("INSERT INTO organisations ");
		varname1.append("            (NAME, ");
		varname1.append("             street, ");
		varname1.append("             city, ");
		varname1.append("             postal_code, ");
		varname1.append("             country_id, ");
		varname1.append("             website, ");
		varname1.append("             email, ");
		varname1.append("             phone, ");
		varname1.append("             created_at, ");
		varname1.append("             subdomain) ");
		varname1.append("VALUES      (:Name, ");
		varname1.append("             :Street, ");
		varname1.append("             :City, ");
		varname1.append("             :PostalCode, ");
		varname1.append("             :Country, ");
		varname1.append("             :Website, ");
		varname1.append("             :Email, ");
		varname1.append("             :Phone, ");
		varname1.append("             Now(), ");
		varname1.append("             :Subdomain) ");
		varname1.append("returning id INTO :organisationId");
		SQL.selectInto(varname1.toString(), formData);

		createOrganisationSettings(formData);

		BEANS.get(OrganisationCreator.class).create(formData, formData.getOrganisationId());

		return formData;
	}

	private void createOrganisationSettings(OrganisationFormData formData) {
		StringBuffer varname1 = new StringBuffer();
		varname1.append("INSERT INTO organisation_settings ");
		varname1.append("            (organisation_id) ");
		varname1.append("VALUES      (:organisationId)");
		SQL.insert(varname1.toString(), formData);
	}

	@Override
	public OrganisationFormData load(OrganisationFormData formData) {
		return formData;
	}

	@Override
	public OrganisationFormData store(OrganisationFormData formData) {
		return formData;
	}

	@Override
	public List<AdministratorsTableRowData> fetchAdministrators(Integer organisationId) {
		BeanArrayHolder<AdministratorsTableRowData> rowData = new BeanArrayHolder<>(AdministratorsTableRowData.class);

		StringBuffer varname1 = new StringBuffer();
		varname1.append("SELECT id, ");
		varname1.append("       username, ");
		varname1.append("       first_name, ");
		varname1.append("       last_name, ");
		varname1.append("       last_login_at ");
		varname1.append("FROM   users ");
		varname1.append("WHERE  organisation_id = :organisationId ");
		varname1.append("AND    administrator IS true ");
		varname1.append("AND    deleted_at IS NULL ");
		varname1.append("INTO   :{rowData.UserId}, ");
		varname1.append("       :{rowData.Username}, ");
		varname1.append("       :{rowData.FirstName}, ");
		varname1.append("       :{rowData.LastName},");
		varname1.append("       :{rowData.LastLoginAt}");
		SQL.selectInto(varname1.toString(), new NVPair("organisationId", organisationId), new NVPair("rowData", rowData));

		return Arrays.asList(rowData.getBeans());
	}
}
