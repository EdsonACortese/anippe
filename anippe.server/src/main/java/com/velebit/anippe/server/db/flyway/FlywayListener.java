package com.velebit.anippe.server.db.flyway;

import com.velebit.anippe.server.db.DatabaseProperties.PasswordProperty;
import com.velebit.anippe.server.db.DatabaseProperties.URLProperty;
import com.velebit.anippe.server.db.DatabaseProperties.UsernameProperty;

import org.eclipse.scout.rt.platform.IPlatform.State;
import org.eclipse.scout.rt.platform.IPlatformListener;
import org.eclipse.scout.rt.platform.PlatformEvent;
import org.eclipse.scout.rt.platform.config.CONFIG;
import org.flywaydb.core.Flyway;

public class FlywayListener implements IPlatformListener {

  @Override
  public void stateChanged(PlatformEvent event) {
    if (event.getState() == State.PlatformStarted) {

      String dbUrl = CONFIG.getPropertyValue(URLProperty.class);
      String dbUsername = CONFIG.getPropertyValue(UsernameProperty.class);
      String dbPassword = CONFIG.getPropertyValue(PasswordProperty.class);

      Flyway flyway = Flyway.configure()
        .baselineOnMigrate(true)
        .baselineVersion("0")
        .dataSource(dbUrl, dbUsername, dbPassword)
        .load();

      flyway.migrate();
    }
  }
}
