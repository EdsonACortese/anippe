package com.velebit.anippe.client.admin.organisation;

import com.velebit.anippe.client.admin.organisation.OrganisationsTablePage.Table;
import com.velebit.anippe.client.common.columns.AbstractIDColumn;
import com.velebit.anippe.client.common.menus.AbstractAddMenu;
import com.velebit.anippe.client.common.menus.AbstractDeleteMenu;
import com.velebit.anippe.client.common.menus.AbstractEditMenu;
import com.velebit.anippe.client.settings.settings.OrganisationForm;
import com.velebit.anippe.shared.FontIcons;
import com.velebit.anippe.shared.admin.organisation.IOrganisationsService;
import com.velebit.anippe.shared.admin.organisation.OrganisationsTablePageData;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractDateTimeColumn;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractStringColumn;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
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

    @Order(1000)
    public class AddMenu extends AbstractAddMenu {
        @Override
        protected void execAction() {
            OrganisationForm form = new OrganisationForm();
            form.startNew();
            form.waitFor();
            if (form.isFormStored()) {
                reloadPage();
            }
        }
    }

    public class Table extends AbstractTable {

        @Override
        protected boolean getConfiguredAutoResizeColumns() {
            return true;
        }

        public AddressColumn getAddressColumn() {
            return getColumnSet().getColumnByClass(AddressColumn.class);
        }

        public CreatedAtColumn getCreatedAtColumn() {
            return getColumnSet().getColumnByClass(CreatedAtColumn.class);
        }

        public NameColumn getNameColumn() {
            return getColumnSet().getColumnByClass(NameColumn.class);
        }

        public SubdomainColumn getSubdomainColumn() {
            return getColumnSet().getColumnByClass(SubdomainColumn.class);
        }


        @Order(1000)
        public class OrganisationIdColumn extends AbstractIDColumn {

        }

        @Order(2000)
        public class NameColumn extends AbstractStringColumn {
            @Override
            protected String getConfiguredHeaderText() {
                return TEXTS.get("Name");
            }

            @Override
            protected int getConfiguredWidth() {
                return 100;
            }
        }

        @Order(2500)
        public class SubdomainColumn extends AbstractStringColumn {
            @Override
            protected String getConfiguredHeaderText() {
                return TEXTS.get("Subdomain");
            }

            @Override
            protected int getConfiguredWidth() {
                return 100;
            }
        }

        @Order(3000)
        public class AddressColumn extends AbstractStringColumn {
            @Override
            protected String getConfiguredHeaderText() {
                return TEXTS.get("Address");
            }

            @Override
            protected int getConfiguredWidth() {
                return 100;
            }
        }

        @Order(4000)
        public class CreatedAtColumn extends AbstractDateTimeColumn {
            @Override
            protected String getConfiguredHeaderText() {
                return TEXTS.get("CreatedAt");
            }

            @Override
            protected int getConfiguredWidth() {
                return 130;
            }
        }

        @Order(1000)
        public class EditMenu extends AbstractEditMenu {


            @Override
            protected void execAction() {

            }
        }

        @Order(2000)
        public class DeleteMenu extends AbstractDeleteMenu {
            @Override
            protected void execAction() {

            }
        }
    }
}
