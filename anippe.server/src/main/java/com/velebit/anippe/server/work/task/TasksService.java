package com.velebit.anippe.server.work.task;

import com.velebit.anippe.shared.work.task.ITasksService;
import com.velebit.anippe.shared.work.task.TasksTablePageData;

import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

public class TasksService implements ITasksService {
    @Override
    public TasksTablePageData getTasksTableData(SearchFilter filter) {
        TasksTablePageData pageData = new TasksTablePageData();
// TODO [Luka] fill pageData.
        return pageData;
    }
}
