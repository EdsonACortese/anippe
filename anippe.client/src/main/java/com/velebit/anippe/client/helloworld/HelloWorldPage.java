package com.velebit.anippe.client.helloworld;

import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithNodes;
import org.eclipse.scout.rt.client.ui.form.IForm;
import org.eclipse.scout.rt.platform.text.TEXTS;

/**
 * @author Luka
 */
public class HelloWorldPage extends AbstractPageWithNodes {

  @Override
  protected boolean getConfiguredLeaf() {
    return true;
  }

  @Override
  protected boolean getConfiguredTableVisible() {
    return false;
  }

  @Override
  protected String getConfiguredTitle() {
    return TEXTS.get("HelloWorld");
  }

  @Override
  protected Class<? extends IForm> getConfiguredDetailForm() {
    return HelloWorldForm.class;
  }
}
