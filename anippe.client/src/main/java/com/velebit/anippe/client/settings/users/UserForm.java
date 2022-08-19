package com.velebit.anippe.client.settings.users;

import com.velebit.anippe.client.settings.users.UserForm.MainBox.CancelButton;
import com.velebit.anippe.client.settings.users.UserForm.MainBox.GroupBox;
import com.velebit.anippe.client.settings.users.UserForm.MainBox.OkButton;
import com.velebit.anippe.shared.settings.users.IUserService;
import com.velebit.anippe.shared.settings.users.UserFormData;

import org.eclipse.scout.rt.client.dto.FormData;
import org.eclipse.scout.rt.client.ui.form.AbstractForm;
import org.eclipse.scout.rt.client.ui.form.AbstractFormHandler;
import org.eclipse.scout.rt.client.ui.form.fields.button.AbstractCancelButton;
import org.eclipse.scout.rt.client.ui.form.fields.button.AbstractOkButton;
import org.eclipse.scout.rt.client.ui.form.fields.groupbox.AbstractGroupBox;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.text.TEXTS;

@FormData(value = UserFormData.class, sdkCommand = FormData.SdkCommand.CREATE)
public class UserForm extends AbstractForm {
  @Override
  protected String getConfiguredTitle() {
// TODO [Luka] verify translation
    return TEXTS.get("User");
  }

  public MainBox getMainBox() {
    return getFieldByClass(MainBox.class);
  }

  public GroupBox getGroupBox() {
    return getFieldByClass(GroupBox.class);
  }

  public OkButton getOkButton() {
    return getFieldByClass(OkButton.class);
  }

  public CancelButton getCancelButton() {
    return getFieldByClass(CancelButton.class);
  }

  @Order(1000)
  public class MainBox extends AbstractGroupBox {
    @Order(1000)
    public class GroupBox extends AbstractGroupBox {

    }

    @Order(2000)
    public class OkButton extends AbstractOkButton {

    }

    @Order(3000)
    public class CancelButton extends AbstractCancelButton {

    }
  }

  public void startModify() {
    startInternalExclusive(new ModifyHandler());
  }

  public void startNew() {
    startInternal(new NewHandler());
  }

  public class NewHandler extends AbstractFormHandler {
    @Override
    protected void execLoad() {
      UserFormData formData = new UserFormData();
      exportFormData(formData);
      formData = BEANS.get(IUserService.class).prepareCreate(formData);
      importFormData(formData);

    }

    @Override
    protected void execStore() {
      UserFormData formData = new UserFormData();
      exportFormData(formData);
      formData = BEANS.get(IUserService.class).create(formData);
      importFormData(formData);
    }
  }

  public class ModifyHandler extends AbstractFormHandler {
    @Override
    protected void execLoad() {
      UserFormData formData = new UserFormData();
      exportFormData(formData);
      formData = BEANS.get(IUserService.class).load(formData);
      importFormData(formData);

    }

    @Override
    protected void execStore() {
      UserFormData formData = new UserFormData();
      exportFormData(formData);
      formData = BEANS.get(IUserService.class).store(formData);
      importFormData(formData);
    }
  }
}
