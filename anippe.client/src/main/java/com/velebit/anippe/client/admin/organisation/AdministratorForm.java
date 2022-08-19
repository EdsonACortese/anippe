package com.velebit.anippe.client.admin.organisation;

import org.eclipse.scout.rt.client.dto.FormData;
import org.eclipse.scout.rt.client.ui.form.AbstractForm;
import org.eclipse.scout.rt.client.ui.form.AbstractFormHandler;
import org.eclipse.scout.rt.client.ui.form.fields.button.AbstractCancelButton;
import org.eclipse.scout.rt.client.ui.form.fields.button.AbstractOkButton;
import org.eclipse.scout.rt.client.ui.form.fields.groupbox.AbstractGroupBox;
import org.eclipse.scout.rt.client.ui.form.fields.stringfield.AbstractStringField;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.exception.VetoException;
import org.eclipse.scout.rt.platform.text.TEXTS;

import com.velebit.anippe.client.admin.organisation.AdministratorForm.MainBox.CancelButton;
import com.velebit.anippe.client.admin.organisation.AdministratorForm.MainBox.GroupBox;
import com.velebit.anippe.client.admin.organisation.AdministratorForm.MainBox.GroupBox.FirstNameField;
import com.velebit.anippe.client.admin.organisation.AdministratorForm.MainBox.GroupBox.LastNameField;
import com.velebit.anippe.client.admin.organisation.AdministratorForm.MainBox.GroupBox.UsernameField;
import com.velebit.anippe.client.admin.organisation.AdministratorForm.MainBox.OkButton;
import com.velebit.anippe.shared.FontIcons;
import com.velebit.anippe.shared.admin.organisation.AdministratorFormData;
import com.velebit.anippe.shared.admin.organisation.IAdministratorService;

@FormData(value = AdministratorFormData.class, sdkCommand = FormData.SdkCommand.CREATE)
public class AdministratorForm extends AbstractForm {

	protected Integer organisationId;
	protected Integer userId;

	@FormData
	public Integer getUserId() {
		return userId;
	}

	@FormData
	public void setUserId(Integer userId) {
		this.userId = userId;
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
		return TEXTS.get("Administrator");
	}

	@Override
	protected String getConfiguredIconId() {
		return FontIcons.PersonSolid;
	}

	public MainBox getMainBox() {
		return getFieldByClass(MainBox.class);
	}

	public GroupBox getGroupBox() {
		return getFieldByClass(GroupBox.class);
	}

	public FirstNameField getFirstNameField() {
		return getFieldByClass(FirstNameField.class);
	}

	public LastNameField getLastNameField() {
		return getFieldByClass(LastNameField.class);
	}

	public UsernameField getUsernameField() {
		return getFieldByClass(UsernameField.class);
	}

	public OkButton getOkButton() {
		return getFieldByClass(OkButton.class);
	}

	public CancelButton getCancelButton() {
		return getFieldByClass(CancelButton.class);
	}

	public GroupBox.PasswordField getPasswordField() {
		return getFieldByClass(GroupBox.PasswordField.class);
	}

	public void startModify() {
		startInternalExclusive(new ModifyHandler());
	}

	public void startNew() {
		startInternal(new NewHandler());
	}

	@Order(1000)
	public class MainBox extends AbstractGroupBox {

		@Override
		protected int getConfiguredWidthInPixel() {
			return 400;
		}

		@Order(1000)
		public class GroupBox extends AbstractGroupBox {
			@Override
			protected int getConfiguredGridColumnCount() {
				return 1;
			}

			@Order(1000)
			public class FirstNameField extends AbstractStringField {
				@Override
				protected String getConfiguredLabel() {
					return TEXTS.get("FirstName");
				}

				@Override
				protected boolean getConfiguredMandatory() {
					return true;
				}

				@Override
				protected int getConfiguredLabelWidthInPixel() {
					return 110;
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
				protected boolean getConfiguredMandatory() {
					return true;
				}

				@Override
				protected int getConfiguredLabelWidthInPixel() {
					return 110;
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
				protected String execValidateValue(String rawValue) {
					if (rawValue == null)
						return rawValue;

					if (rawValue.matches(".*\\s+.*")) {
						throw new VetoException(TEXTS.get("KorisnikoImeSadriRazmak"));
					}

					return rawValue;
				}

				@Override
				protected boolean getConfiguredMandatory() {
					return true;
				}

				@Override
				protected int getConfiguredLabelWidthInPixel() {
					return 110;
				}

				@Override
				protected int getConfiguredMaxLength() {
					return 128;
				}
			}

			@Order(4000)
			public class PasswordField extends AbstractStringField {
				@Override
				protected String getConfiguredLabel() {
					return TEXTS.get("Password");
				}

				@Override
				protected int getConfiguredLabelWidthInPixel() {
					return 110;
				}

				@Override
				protected boolean getConfiguredInputMasked() {
					return true;
				}

				@Override
				protected int getConfiguredMaxLength() {
					return 128;
				}
			}

		}

		@Order(2000)
		public class OkButton extends AbstractOkButton {

		}

		@Order(3000)
		public class CancelButton extends AbstractCancelButton {

		}
	}

	public class NewHandler extends AbstractFormHandler {
		@Override
		protected void execLoad() {
			AdministratorFormData formData = new AdministratorFormData();
			exportFormData(formData);
			formData = BEANS.get(IAdministratorService.class).prepareCreate(formData);
			importFormData(formData);
		}

		@Override
		protected void execStore() {
			AdministratorFormData formData = new AdministratorFormData();
			exportFormData(formData);
			formData = BEANS.get(IAdministratorService.class).create(formData);
			importFormData(formData);
		}
	}

	public class ModifyHandler extends AbstractFormHandler {
		@Override
		protected void execLoad() {
			AdministratorFormData formData = new AdministratorFormData();
			exportFormData(formData);
			formData = BEANS.get(IAdministratorService.class).load(formData);
			importFormData(formData);
		}

		@Override
		protected void execStore() {
			AdministratorFormData formData = new AdministratorFormData();
			exportFormData(formData);
			formData = BEANS.get(IAdministratorService.class).store(formData);
			importFormData(formData);
		}
	}
}
