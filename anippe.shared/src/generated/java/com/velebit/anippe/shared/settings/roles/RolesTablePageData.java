package com.velebit.anippe.shared.settings.roles;

import org.eclipse.scout.rt.shared.data.basic.table.AbstractTableRowData;
import org.eclipse.scout.rt.shared.data.page.AbstractTablePageData;

import javax.annotation.Generated;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications recommended.
 */
@Generated(value = "com.velebit.anippe.client.settings.roles.RolesTablePage", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class RolesTablePageData extends AbstractTablePageData {
    private static final long serialVersionUID = 1L;

    @Override
    public RolesTableRowData addRow() {
        return (RolesTableRowData) super.addRow();
    }

    @Override
    public RolesTableRowData addRow(int rowState) {
        return (RolesTableRowData) super.addRow(rowState);
    }

    @Override
    public RolesTableRowData createRow() {
        return new RolesTableRowData();
    }

    @Override
    public Class<? extends AbstractTableRowData> getRowType() {
        return RolesTableRowData.class;
    }

    @Override
    public RolesTableRowData[] getRows() {
        return (RolesTableRowData[]) super.getRows();
    }

    @Override
    public RolesTableRowData rowAt(int index) {
        return (RolesTableRowData) super.rowAt(index);
    }

    public void setRows(RolesTableRowData[] rows) {
        super.setRows(rows);
    }

    public static class RolesTableRowData extends AbstractTableRowData {
        private static final long serialVersionUID = 1L;
        public static final String roleId = "roleId";
        public static final String code = "code";
        public static final String name = "name";
        public static final String totalUsers = "totalUsers";
        private Integer m_roleId;
        private String m_code;
        private String m_name;
        private Integer m_totalUsers;

        public Integer getRoleId() {
            return m_roleId;
        }

        public void setRoleId(Integer newRoleId) {
            m_roleId = newRoleId;
        }

        public String getCode() {
            return m_code;
        }

        public void setCode(String newCode) {
            m_code = newCode;
        }

        public String getName() {
            return m_name;
        }

        public void setName(String newName) {
            m_name = newName;
        }

        public Integer getTotalUsers() {
            return m_totalUsers;
        }

        public void setTotalUsers(Integer newTotalUsers) {
            m_totalUsers = newTotalUsers;
        }
    }
}
