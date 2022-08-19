package com.velebit.anippe.client.settings.roles;

import com.velebit.anippe.client.settings.roles.RolesTablePage.Table;
import com.velebit.anippe.shared.settings.roles.IRolesService;
import com.velebit.anippe.shared.settings.roles.RolesTablePageData;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.text.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

@Data(RolesTablePageData.class)
public class RolesTablePage extends AbstractPageWithTable<Table> {
    @Override
    protected boolean getConfiguredLeaf() {
        return true;
    }

    @Override
    protected void execLoadData(SearchFilter filter) {
        importPageData(BEANS.get(IRolesService.class).getRolesTableData(filter));
    }

    @Override
    protected String getConfiguredTitle() {
// TODO [Luka] verify translation
        return TEXTS.get("RolesTablePage");
    }

    public class Table extends AbstractTable {

    }
}
