package com.velebit.anippe.server.admin.organisation;

import org.eclipse.scout.rt.platform.holders.NVPair;
import org.eclipse.scout.rt.server.jdbc.SQL;

import com.velebit.anippe.shared.admin.organisation.AdministratorFormData;
import com.velebit.anippe.shared.admin.organisation.IAdministratorService;
import com.velebit.anippe.shared.utility.PasswordUtility;

public class AdministratorService implements IAdministratorService {
	@Override
	public AdministratorFormData prepareCreate(AdministratorFormData formData) {
		return formData;
	}

	@Override
	public AdministratorFormData create(AdministratorFormData formData) {
		StringBuffer varname1 = new StringBuffer();
		varname1.append("INSERT INTO users ");
		varname1.append("            (first_name, ");
		varname1.append("             last_name, ");
		varname1.append("             password, ");
		varname1.append("             administrator, ");
		varname1.append("             username, ");
		varname1.append("             password, ");
		varname1.append("             created_at, ");
		varname1.append("             organisation_id) ");
		varname1.append("VALUES      (:FirstName, ");
		varname1.append("             :LastName, ");
		varname1.append("             :password, ");
		varname1.append("             true, ");
		varname1.append("             :Username, ");
		varname1.append("             :hashedPassword, ");
		varname1.append("             Now(), ");
		varname1.append("             :organisationId)");
		SQL.insert(varname1.toString(), formData, new NVPair("hashedPassword", PasswordUtility.calculateEncodedPassword(formData.getPassword().getValue())));

		return formData;
	}

	@Override
	public AdministratorFormData load(AdministratorFormData formData) {
		StringBuffer varname1 = new StringBuffer();
		varname1.append("SELECT first_name, ");
		varname1.append("       last_name, ");
		varname1.append("       username ");
		varname1.append("FROM   users ");
		varname1.append("WHERE  id = :userId ");
		varname1.append("INTO   :FirstName, :LastName, :Username");
		SQL.selectInto(varname1.toString(), formData, new NVPair("userId", formData.getUserId()));

		return formData;
	}

	@Override
	public AdministratorFormData store(AdministratorFormData formData) {
		StringBuffer varname1 = new StringBuffer();
		varname1.append("UPDATE users ");
		varname1.append("SET    first_name = :FirstName, ");
		varname1.append("       last_name = :LastName, ");
		varname1.append("       username = :Username ");
		varname1.append("WHERE  id = :userId");
		SQL.update(varname1.toString(), formData, new NVPair("userId", formData.getUserId()));

		return formData;
	}

}
