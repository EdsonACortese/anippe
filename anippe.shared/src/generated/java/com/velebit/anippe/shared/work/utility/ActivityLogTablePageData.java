package com.velebit.anippe.shared.work.utility;

import java.util.Date;

import javax.annotation.Generated;

import org.eclipse.scout.rt.shared.data.basic.table.AbstractTableRowData;
import org.eclipse.scout.rt.shared.data.page.AbstractTablePageData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications
 * recommended.
 */
@Generated(value = "com.velebit.anippe.client.work.utility.ActivityLogTablePage", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class ActivityLogTablePageData extends AbstractTablePageData {
	private static final long serialVersionUID = 1L;

	@Override
	public ActivityLogTableRowData addRow() {
		return (ActivityLogTableRowData) super.addRow();
	}

	@Override
	public ActivityLogTableRowData addRow(int rowState) {
		return (ActivityLogTableRowData) super.addRow(rowState);
	}

	@Override
	public ActivityLogTableRowData createRow() {
		return new ActivityLogTableRowData();
	}

	@Override
	public Class<? extends AbstractTableRowData> getRowType() {
		return ActivityLogTableRowData.class;
	}

	@Override
	public ActivityLogTableRowData[] getRows() {
		return (ActivityLogTableRowData[]) super.getRows();
	}

	@Override
	public ActivityLogTableRowData rowAt(int index) {
		return (ActivityLogTableRowData) super.rowAt(index);
	}

	public void setRows(ActivityLogTableRowData[] rows) {
		super.setRows(rows);
	}

	public static class ActivityLogTableRowData extends AbstractTableRowData {
		private static final long serialVersionUID = 1L;
		public static final String logId = "logId";
		public static final String createdAt = "createdAt";
		public static final String user = "user";
		public static final String action = "action";
		public static final String relatedType = "relatedType";
		public static final String relatedId = "relatedId";
		public static final String relatedName = "relatedName";
		private Integer m_logId;
		private Date m_createdAt;
		private String m_user;
		private String m_action;
		private Integer m_relatedType;
		private Integer m_relatedId;
		private String m_relatedName;

		public Integer getLogId() {
			return m_logId;
		}

		public void setLogId(Integer newLogId) {
			m_logId = newLogId;
		}

		public Date getCreatedAt() {
			return m_createdAt;
		}

		public void setCreatedAt(Date newCreatedAt) {
			m_createdAt = newCreatedAt;
		}

		public String getUser() {
			return m_user;
		}

		public void setUser(String newUser) {
			m_user = newUser;
		}

		public String getAction() {
			return m_action;
		}

		public void setAction(String newAction) {
			m_action = newAction;
		}

		public Integer getRelatedType() {
			return m_relatedType;
		}

		public void setRelatedType(Integer newRelatedType) {
			m_relatedType = newRelatedType;
		}

		public Integer getRelatedId() {
			return m_relatedId;
		}

		public void setRelatedId(Integer newRelatedId) {
			m_relatedId = newRelatedId;
		}

		public String getRelatedName() {
			return m_relatedName;
		}

		public void setRelatedName(String newRelatedName) {
			m_relatedName = newRelatedName;
		}
	}
}
