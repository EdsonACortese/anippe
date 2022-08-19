package com.velebit.anippe.server.work.project;

import com.velebit.anippe.shared.work.project.IProjectsService;
import com.velebit.anippe.shared.work.project.ProjectsTablePageData;

import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

public class ProjectsService implements IProjectsService {
    @Override
    public ProjectsTablePageData getProjectsTableData(SearchFilter filter) {
        ProjectsTablePageData pageData = new ProjectsTablePageData();
// TODO [Luka] fill pageData.
        return pageData;
    }
}
