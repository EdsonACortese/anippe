package com.velebit.anippe.server.admin.organisation;

import java.util.Locale;

import org.eclipse.scout.rt.platform.Bean;
import org.eclipse.scout.rt.platform.holders.IntegerHolder;
import org.eclipse.scout.rt.platform.holders.NVPair;
import org.eclipse.scout.rt.platform.util.StringUtility;
import org.eclipse.scout.rt.server.jdbc.SQL;

import com.velebit.anippe.shared.admin.organisation.OrganisationFormData;
import com.velebit.anippe.shared.constants.Constants;
import com.velebit.anippe.shared.utility.PasswordUtility;

@Bean
public class OrganisationCreator {

	public void create(OrganisationFormData formData, Integer organisationId) {
		createAdminUser(formData, organisationId);
	}

	private Integer createAdminUser(OrganisationFormData formData, Integer organisationId) {

		String subdomain = formData.getSubdomain().getValue().trim().toLowerCase(Locale.ROOT).replace(" ", "");
		String username = StringUtility.join("", "admin", subdomain); // admincompanyname

		IntegerHolder adminId = new IntegerHolder();
		StringBuffer varname1 = new StringBuffer();
		varname1.append("INSERT INTO users ");
		varname1.append("            (first_name, ");
		varname1.append("             last_name, ");
		varname1.append("             username, ");
		varname1.append("             password, ");
		varname1.append("             organisation_id, ");
		varname1.append("             created_at, ");
		varname1.append("             administrator, ");
		varname1.append("             active, ");
		varname1.append("             country_id) ");
		varname1.append("VALUES      ('Admin', ");
		varname1.append("             :Name, ");
		varname1.append("             :username, ");
		varname1.append("             :password, ");
		varname1.append("             :organisationId, ");
		varname1.append("             now(), ");
		varname1.append("             true, ");
		varname1.append("             true, ");
		varname1.append("             :Country) ");
		varname1.append("returning id INTO :adminId");
		SQL.selectInto(varname1.toString(), new NVPair("adminId", adminId), new NVPair("organisationId", organisationId),
				new NVPair("password", PasswordUtility.calculateEncodedPassword(Constants.DEFAULT_USER_PASSWORD)), new NVPair("username", username), formData);

		return adminId.getValue();
	}

}
