package com.velebit.anippe.client.settings.settings;

import com.velebit.anippe.client.common.interaction.NotificationHelper;
import com.velebit.anippe.client.settings.settings.OrganisationForm.MainBox.CancelButton;
import com.velebit.anippe.client.settings.settings.OrganisationForm.MainBox.OkButton;
import com.velebit.anippe.shared.FontIcons;
import com.velebit.anippe.shared.settings.settings.IOrganisationService;
import com.velebit.anippe.shared.settings.settings.OrganisationFormData;

import org.eclipse.scout.rt.client.dto.FormData;
import org.eclipse.scout.rt.client.ui.form.AbstractForm;
import org.eclipse.scout.rt.client.ui.form.AbstractFormHandler;
import org.eclipse.scout.rt.client.ui.form.IForm;
import org.eclipse.scout.rt.client.ui.form.fields.button.AbstractCancelButton;
import org.eclipse.scout.rt.client.ui.form.fields.button.AbstractOkButton;
import org.eclipse.scout.rt.client.ui.form.fields.button.AbstractSaveButton;
import org.eclipse.scout.rt.client.ui.form.fields.groupbox.AbstractGroupBox;
import org.eclipse.scout.rt.client.ui.form.fields.smartfield.AbstractSmartField;
import org.eclipse.scout.rt.client.ui.form.fields.stringfield.AbstractStringField;
import org.eclipse.scout.rt.client.ui.form.fields.tabbox.AbstractTabBox;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.text.TEXTS;
import org.eclipse.scout.rt.shared.services.lookup.ILookupCall;

import db.migration.CountryLookupCall;

@FormData(value = OrganisationFormData.class, sdkCommand = FormData.SdkCommand.CREATE)
public class OrganisationForm extends AbstractForm {
    protected Integer organisationId;

    @Override
    public Object computeExclusiveKey() {
        return organisationId;
    }

    @FormData
    public Integer getOrganisationId() {
        return organisationId;
    }

    @FormData
    public void setOrganisationId(Integer organisationId) {
        this.organisationId = organisationId;
    }

    @Override
    protected String getConfiguredTitle() {
        return TEXTS.get("Organisation");
    }

    @Override
    protected void execStored() {
        NotificationHelper.showSaveSuccessNotification();
    }

    public MainBox getMainBox() {
        return getFieldByClass(MainBox.class);
    }


    public OkButton getOkButton() {
        return getFieldByClass(OkButton.class);
    }

    public CancelButton getCancelButton() {
        return getFieldByClass(CancelButton.class);
    }

    public MainBox.MainTabBox.MainInformationsBox.CityField getCityField() {
        return getFieldByClass(MainBox.MainTabBox.MainInformationsBox.CityField.class);
    }

    public MainBox.MainTabBox.MainInformationsBox.CountryField getCountryField() {
        return getFieldByClass(MainBox.MainTabBox.MainInformationsBox.CountryField.class);
    }

    public MainBox.MainTabBox.MainInformationsBox getMainInformationsBox() {
        return getFieldByClass(MainBox.MainTabBox.MainInformationsBox.class);
    }

    public MainBox.MainTabBox getMainTabBox() {
        return getFieldByClass(MainBox.MainTabBox.class);
    }

    public MainBox.MainTabBox.MainInformationsBox.PostalCodeField getPostalCodeField() {
        return getFieldByClass(MainBox.MainTabBox.MainInformationsBox.PostalCodeField.class);
    }


    public MainBox.SaveButton getSaveButton() {
        return getFieldByClass(MainBox.SaveButton.class);
    }

    public MainBox.MainTabBox.MainInformationsBox.StreetField getStreetField() {
        return getFieldByClass(MainBox.MainTabBox.MainInformationsBox.StreetField.class);
    }

    @Override
    protected int getConfiguredDisplayHint() {
        return IForm.DISPLAY_HINT_VIEW;
    }

    @Override
    protected String getConfiguredIconId() {
        return FontIcons.Building;
    }

    @Order(1000)
    public class MainBox extends AbstractGroupBox {

        @Order(0)
        public class MainTabBox extends AbstractTabBox {
            @Order(1000)
            public class MainInformationsBox extends AbstractGroupBox {
                @Override
                protected String getConfiguredLabel() {
                    return TEXTS.get("MainInformations");
                }

                @Override
                protected int getConfiguredGridColumnCount() {
                    return 1;
                }

                @Order(1000)
                public class NameField extends AbstractStringField {
                    @Override
                    protected String getConfiguredLabel() {
                        return TEXTS.get("Name");
                    }

                    @Override
                    public boolean isMandatory() {
                        return true;
                    }

                    @Override
                    protected int getConfiguredMaxLength() {
                        return 128;
                    }
                }

                @Order(2000)
                public class StreetField extends AbstractStringField {
                    @Override
                    protected String getConfiguredLabel() {
                        return TEXTS.get("Street");
                    }

                    @Override
                    protected int getConfiguredMaxLength() {
                        return 128;
                    }
                }

                @Order(3000)
                public class CityField extends AbstractStringField {
                    @Override
                    protected String getConfiguredLabel() {
                        return TEXTS.get("City");
                    }

                    @Override
                    protected int getConfiguredMaxLength() {
                        return 128;
                    }
                }

                @Order(4000)
                public class PostalCodeField extends AbstractStringField {
                    @Override
                    protected String getConfiguredLabel() {
                        return TEXTS.get("PostalCode");
                    }

                    @Override
                    protected int getConfiguredMaxLength() {
                        return 128;
                    }
                }

                @Order(5000)
                public class CountryField extends AbstractSmartField<Long> {
                    @Override
                    protected String getConfiguredLabel() {
                        return TEXTS.get("Country");
                    }

                    @Override
                    protected Class<? extends ILookupCall<Long>> getConfiguredLookupCall() {
                        return CountryLookupCall.class;
                    }

                    @Override
                    public boolean isMandatory() {
                        return true;
                    }
                }


            }

        }


        @Order(2000)
        public class OkButton extends AbstractOkButton {
            @Override
            protected String getConfiguredLabel() {
                return TEXTS.get("SaveAndClose");
            }
        }

        @Order(2500)
        public class SaveButton extends AbstractSaveButton {
            @Override
            protected String getConfiguredLabel() {
                return TEXTS.get("Save");
            }

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
            OrganisationFormData formData = new OrganisationFormData();
            exportFormData(formData);
            formData = BEANS.get(IOrganisationService.class).prepareCreate(formData);
            importFormData(formData);
        }

        @Override
        protected void execStore() {
            OrganisationFormData formData = new OrganisationFormData();
            exportFormData(formData);
            formData = BEANS.get(IOrganisationService.class).create(formData);
            importFormData(formData);
        }
    }

    public class ModifyHandler extends AbstractFormHandler {
        @Override
        protected void execLoad() {
            OrganisationFormData formData = new OrganisationFormData();
            exportFormData(formData);
            formData = BEANS.get(IOrganisationService.class).load(formData);
            importFormData(formData);

        }

        @Override
        protected boolean getConfiguredOpenExclusive() {
            return true;
        }

        @Override
        protected void execStore() {
            OrganisationFormData formData = new OrganisationFormData();
            exportFormData(formData);
            formData = BEANS.get(IOrganisationService.class).store(formData);
            importFormData(formData);
        }
    }
}
