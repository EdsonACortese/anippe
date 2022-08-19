package com.velebit.anippe.server.work.utility;

import com.velebit.anippe.shared.work.utility.ActivityLogTablePageData;
import com.velebit.anippe.shared.work.utility.IActivityLogService;

import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

public class ActivityLogService implements IActivityLogService {
    @Override
    public ActivityLogTablePageData getActivityLogTableData(SearchFilter filter) {
        ActivityLogTablePageData pageData = new ActivityLogTablePageData();
// TODO [Luka] fill pageData.
        return pageData;
    }
}
