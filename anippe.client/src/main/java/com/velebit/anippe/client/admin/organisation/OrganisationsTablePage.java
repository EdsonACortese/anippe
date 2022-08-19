package com.velebit.anippe.client.admin.organisation;

import com.velebit.anippe.client.admin.organisation.OrganisationsTablePage.Table;
import com.velebit.anippe.shared.FontIcons;
import com.velebit.anippe.shared.admin.organisation.IOrganisationsService;
import com.velebit.anippe.shared.admin.organisation.OrganisationsTablePageData;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.text.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

@Data(OrganisationsTablePageData.class)
public class OrganisationsTablePage extends AbstractPageWithTable<Table> {
    @Override
    protected boolean getConfiguredLeaf() {
        return true;
    }

    @Override
    protected void execLoadData(SearchFilter filter) {
        importPageData(BEANS.get(IOrganisationsService.class).getOrganisationsTableData(filter));
    }

    @Override
    protected String getConfiguredOverviewIconId() {
        return FontIcons.Building;
    }

    @Override
    protected String getConfiguredIconId() {
        return FontIcons.Building;
    }

    @Override
    protected String getConfiguredTitle() {
        return TEXTS.get("Organisations");
    }

    public class Table extends AbstractTable {

    }
}
