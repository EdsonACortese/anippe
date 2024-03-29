package com.velebit.anippe.shared.work.project;

import org.eclipse.scout.rt.platform.service.IService;
import org.eclipse.scout.rt.shared.TunnelToServer;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

@TunnelToServer
public interface IProjectsService extends IService {
    ProjectsTablePageData getProjectsTableData(SearchFilter filter);
}
