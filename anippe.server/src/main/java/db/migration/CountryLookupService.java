package db.migration;

import org.eclipse.scout.rt.server.jdbc.lookup.AbstractSqlLookupService;

public class CountryLookupService extends AbstractSqlLookupService<Long> implements ICountryLookupService {
    @Override
    protected String getConfiguredSqlSelect() {

        StringBuffer varname1 = new StringBuffer();
        varname1.append(" SELECT id, name");
        varname1.append(" FROM countries ");
        varname1.append(" WHERE deleted_at IS NULL ");
        varname1.append(" <key>AND id = :key</key> ");
        varname1.append(" <text>AND upper(name) LIKE upper('%' || :text || '%') </text> ");
        varname1.append(" <all></all>");
        varname1.append(" ORDER BY name ");

        return varname1.toString();
    }
}
