package com.velebit.anippe.server.db;

import com.velebit.anippe.server.db.DatabaseProperties.PasswordProperty;
import com.velebit.anippe.server.db.DatabaseProperties.URLProperty;
import com.velebit.anippe.server.db.DatabaseProperties.UsernameProperty;

import org.eclipse.scout.rt.platform.config.CONFIG;
import org.eclipse.scout.rt.server.jdbc.postgresql.AbstractPostgreSqlService;
import org.eclipse.scout.rt.server.jdbc.postgresql.PostgreSqlStyle;
import org.eclipse.scout.rt.server.jdbc.style.ISqlStyle;

public class PostgreSqlService extends AbstractPostgreSqlService {
	@Override
	protected Class<? extends ISqlStyle> getConfiguredSqlStyle() {
		return PostgreSqlStyle.class;
	}

	@Override
	protected String getConfiguredJdbcMappingName() {
		return CONFIG.getPropertyValue(URLProperty.class);
	}

	@Override
	protected String getConfiguredPassword() {
		return CONFIG.getPropertyValue(PasswordProperty.class);
	}

	@Override
	protected String getConfiguredUsername() {
		return CONFIG.getPropertyValue(UsernameProperty.class);
	}
}
