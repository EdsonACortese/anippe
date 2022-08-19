package com.velebit.anippe.client.work;

import com.velebit.anippe.client.work.customer.CustomersTablePage;
import com.velebit.anippe.client.work.lead.LeadsTablePage;
import com.velebit.anippe.client.work.project.ProjectsTablePage;
import com.velebit.anippe.client.work.task.TasksTablePage;
import com.velebit.anippe.client.work.ticket.TicketsTablePage;
import com.velebit.anippe.client.work.utility.UtilityNodePage;
import com.velebit.anippe.shared.Icons;

import org.eclipse.scout.rt.client.ui.desktop.outline.AbstractOutline;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.IPage;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.text.TEXTS;

import java.util.List;

/**
 * @author Luka
 */
@Order(1000)
public class WorkOutline extends AbstractOutline {

  @Override
  protected void execCreateChildPages(List<IPage<?>> pageList) {
    super.execCreateChildPages(pageList);

    pageList.add(new CustomersTablePage());
    pageList.add(new LeadsTablePage());
    pageList.add(new ProjectsTablePage());
    pageList.add(new TasksTablePage());
    pageList.add(new TicketsTablePage());
    pageList.add(new UtilityNodePage());
  }

  @Override
  protected String getConfiguredTitle() {
    return TEXTS.get("Work");
  }

  @Override
  protected String getConfiguredIconId() {
    return Icons.Pencil;
  }
}
