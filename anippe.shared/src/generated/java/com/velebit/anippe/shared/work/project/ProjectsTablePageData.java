package com.velebit.anippe.shared.work.project;

import java.util.Date;

import javax.annotation.Generated;

import org.eclipse.scout.rt.shared.data.basic.table.AbstractTableRowData;
import org.eclipse.scout.rt.shared.data.page.AbstractTablePageData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications
 * recommended.
 */
@Generated(value = "com.velebit.anippe.client.work.project.ProjectsTablePage", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class ProjectsTablePageData extends AbstractTablePageData {
	private static final long serialVersionUID = 1L;

	@Override
	public ProjectsTableRowData addRow() {
		return (ProjectsTableRowData) super.addRow();
	}

	@Override
	public ProjectsTableRowData addRow(int rowState) {
		return (ProjectsTableRowData) super.addRow(rowState);
	}

	@Override
	public ProjectsTableRowData createRow() {
		return new ProjectsTableRowData();
	}

	@Override
	public Class<? extends AbstractTableRowData> getRowType() {
		return ProjectsTableRowData.class;
	}

	@Override
	public ProjectsTableRowData[] getRows() {
		return (ProjectsTableRowData[]) super.getRows();
	}

	@Override
	public ProjectsTableRowData rowAt(int index) {
		return (ProjectsTableRowData) super.rowAt(index);
	}

	public void setRows(ProjectsTableRowData[] rows) {
		super.setRows(rows);
	}

	public static class ProjectsTableRowData extends AbstractTableRowData {
		private static final long serialVersionUID = 1L;
		public static final String projectId = "projectId";
		public static final String name = "name";
		public static final String type = "type";
		public static final String customer = "customer";
		public static final String users = "users";
		public static final String deadlineAt = "deadlineAt";
		private Integer m_projectId;
		private String m_name;
		private String m_type;
		private String m_customer;
		private String m_users;
		private Date m_deadlineAt;

		public Integer getProjectId() {
			return m_projectId;
		}

		public void setProjectId(Integer newProjectId) {
			m_projectId = newProjectId;
		}

		public String getName() {
			return m_name;
		}

		public void setName(String newName) {
			m_name = newName;
		}

		public String getType() {
			return m_type;
		}

		public void setType(String newType) {
			m_type = newType;
		}

		public String getCustomer() {
			return m_customer;
		}

		public void setCustomer(String newCustomer) {
			m_customer = newCustomer;
		}

		public String getUsers() {
			return m_users;
		}

		public void setUsers(String newUsers) {
			m_users = newUsers;
		}

		public Date getDeadlineAt() {
			return m_deadlineAt;
		}

		public void setDeadlineAt(Date newDeadlineAt) {
			m_deadlineAt = newDeadlineAt;
		}
	}
}
