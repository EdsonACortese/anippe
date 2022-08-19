package com.velebit.anippe.client.common.columns;

import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractIntegerColumn;

public class AbstractIDColumn extends AbstractIntegerColumn {
  public AbstractIDColumn() {
    super(true);
  }

  @Override
  protected boolean getConfiguredDisplayable() {
    return false;
  }

}
