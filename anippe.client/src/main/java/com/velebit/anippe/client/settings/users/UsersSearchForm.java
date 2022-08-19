package com.velebit.anippe.client.settings.users;

import com.velebit.anippe.client.settings.users.UsersSearchForm.MainBox.CancelButton;
import com.velebit.anippe.client.settings.users.UsersSearchForm.MainBox.MainTabBox;
import com.velebit.anippe.client.settings.users.UsersSearchForm.MainBox.MainTabBox.SearchParametersBox;
import com.velebit.anippe.client.settings.users.UsersSearchForm.MainBox.MainTabBox.SearchParametersBox.FirstNameField;
import com.velebit.anippe.client.settings.users.UsersSearchForm.MainBox.MainTabBox.SearchParametersBox.LastNameField;
import com.velebit.anippe.client.settings.users.UsersSearchForm.MainBox.MainTabBox.SearchParametersBox.RolesBox;
import com.velebit.anippe.client.settings.users.UsersSearchForm.MainBox.MainTabBox.SearchParametersBox.UsernameField;
import com.velebit.anippe.client.settings.users.UsersSearchForm.MainBox.OkButton;
import com.velebit.anippe.shared.settings.users.UsersSearchFormData;

import org.eclipse.scout.rt.client.dto.FormData;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractSearchForm;
import org.eclipse.scout.rt.client.ui.form.AbstractFormHandler;
import org.eclipse.scout.rt.client.ui.form.fields.button.AbstractResetButton;
import org.eclipse.scout.rt.client.ui.form.fields.button.AbstractSearchButton;
import org.eclipse.scout.rt.client.ui.form.fields.groupbox.AbstractGroupBox;
import org.eclipse.scout.rt.client.ui.form.fields.groupbox.IGroupBoxBodyGrid;
import org.eclipse.scout.rt.client.ui.form.fields.groupbox.internal.HorizontalGroupBoxBodyGrid;
import org.eclipse.scout.rt.client.ui.form.fields.listbox.AbstractListBox;
import org.eclipse.scout.rt.client.ui.form.fields.stringfield.AbstractStringField;
import org.eclipse.scout.rt.client.ui.form.fields.tabbox.AbstractTabBox;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.text.TEXTS;

@FormData(value = UsersSearchFormData.class, sdkCommand = FormData.SdkCommand.CREATE)
public class UsersSearchForm extends AbstractSearchForm {
  @Override
  protected String getConfiguredTitle() {
    return TEXTS.get("Search");
  }

  public void startModify() {
    startInternalExclusive(new ModifyHandler());
  }

  public void startNew() {
    startInternal(new NewHandler());
  }

  public CancelButton getCancelButton() {
    return getFieldByClass(CancelButton.class);
  }

  public FirstNameField getFirstNameField() {
    return getFieldByClass(FirstNameField.class);
  }


  public LastNameField getLastNameField() {
    return getFieldByClass(LastNameField.class);
  }

  public MainBox getMainBox() {
    return getFieldByClass(MainBox.class);
  }

  public MainTabBox getMainTabBox() {
    return getFieldByClass(MainTabBox.class);
  }

  public OkButton getOkButton() {
    return getFieldByClass(OkButton.class);
  }


  public RolesBox getRolesBox() {
    return getFieldByClass(RolesBox.class);
  }

  public SearchParametersBox getSearchParametersBox() {
    return getFieldByClass(SearchParametersBox.class);
  }

  public UsernameField getUsernameField() {
    return getFieldByClass(UsernameField.class);
  }

  @Order(1000)
  public class MainBox extends AbstractGroupBox {

    @Order(1000)
    public class MainTabBox extends AbstractTabBox {

      @Order(1000)
      public class SearchParametersBox extends AbstractGroupBox {

        @Override
        protected Class<? extends IGroupBoxBodyGrid> getConfiguredBodyGrid() {
          return HorizontalGroupBoxBodyGrid.class;
        }

        @Override
        protected int getConfiguredGridColumnCount() {
          return 4;
        }

        @Override
        protected String getConfiguredLabel() {
          return TEXTS.get("SearchParameters");
        }

        @Order(1000)
        public class FirstNameField extends AbstractStringField {

          @Override
          protected String getConfiguredLabel() {
            return TEXTS.get("FirstName");
          }

          @Override
          protected int getConfiguredLabelWidthInPixel() {
            return 120;
          }

          @Override
          protected int getConfiguredMaxLength() {
            return 128;
          }
        }

        @Order(2000)
        public class LastNameField extends AbstractStringField {

          @Override
          protected String getConfiguredLabel() {
            return TEXTS.get("LastName");
          }

          @Override
          protected int getConfiguredLabelWidthInPixel() {
            return 120;
          }

          @Override
          protected int getConfiguredMaxLength() {
            return 128;
          }
        }

        @Order(3000)
        public class UsernameField extends AbstractStringField {

          @Override
          protected String getConfiguredLabel() {
            return TEXTS.get("Username");
          }

          @Override
          protected int getConfiguredLabelWidthInPixel() {
            return 120;
          }

          @Override
          protected int getConfiguredMaxLength() {
            return 128;
          }
        }


        @Order(5000)
        public class RolesBox extends AbstractListBox<Long> {

          @Override
          protected int getConfiguredGridH() {
            return 4;
          }

          @Override
          protected String getConfiguredLabel() {
            return TEXTS.get("Roles");
          }

          @Override
          protected int getConfiguredLabelWidthInPixel() {
            return 120;
          }


        }


      }
    }

    @Order(100000)
    public class OkButton extends AbstractSearchButton {
    }

    @Order(101000)
    public class CancelButton extends AbstractResetButton {
    }
  }

  public class ModifyHandler extends AbstractFormHandler {

    @Override
    protected void execLoad() {
    }

    @Override
    protected void execStore() {
    }
  }

  public class NewHandler extends AbstractFormHandler {

    @Override
    protected void execLoad() {
    }

    @Override
    protected void execStore() {
    }
  }
}
