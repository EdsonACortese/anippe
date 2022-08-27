package com.velebit.anippe.client.work.lead;

import org.eclipse.scout.rt.client.dto.FormData;
import org.eclipse.scout.rt.client.ui.action.menu.AbstractMenu;
import org.eclipse.scout.rt.client.ui.action.menu.MenuUtility;
import org.eclipse.scout.rt.client.ui.form.AbstractForm;
import org.eclipse.scout.rt.client.ui.form.AbstractFormHandler;
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

import com.velebit.anippe.client.common.fields.AbstractTextAreaField;
import com.velebit.anippe.client.common.menus.AbstractActionsMenu;
import com.velebit.anippe.client.common.menus.AbstractDeleteMenu;
import com.velebit.anippe.client.common.menus.AbstractEditMenu;
import com.velebit.anippe.client.work.lead.LeadForm.MainBox.ActionsMenu;
import com.velebit.anippe.client.work.lead.LeadForm.MainBox.CancelButton;
import com.velebit.anippe.client.work.lead.LeadForm.MainBox.ConvertToCustomerMenu;
import com.velebit.anippe.client.work.lead.LeadForm.MainBox.MainTabBox;
import com.velebit.anippe.client.work.lead.LeadForm.MainBox.MainTabBox.DocumentsBox;
import com.velebit.anippe.client.work.lead.LeadForm.MainBox.MainTabBox.MainInformationsBox;
import com.velebit.anippe.client.work.lead.LeadForm.MainBox.MainTabBox.MainInformationsBox.AddressField;
import com.velebit.anippe.client.work.lead.LeadForm.MainBox.MainTabBox.MainInformationsBox.CityField;
import com.velebit.anippe.client.work.lead.LeadForm.MainBox.MainTabBox.MainInformationsBox.CompanyField;
import com.velebit.anippe.client.work.lead.LeadForm.MainBox.MainTabBox.MainInformationsBox.CountryField;
import com.velebit.anippe.client.work.lead.LeadForm.MainBox.MainTabBox.MainInformationsBox.DescriptionField;
import com.velebit.anippe.client.work.lead.LeadForm.MainBox.MainTabBox.MainInformationsBox.EmailField;
import com.velebit.anippe.client.work.lead.LeadForm.MainBox.MainTabBox.MainInformationsBox.FirstNameField;
import com.velebit.anippe.client.work.lead.LeadForm.MainBox.MainTabBox.MainInformationsBox.LastNameField;
import com.velebit.anippe.client.work.lead.LeadForm.MainBox.MainTabBox.MainInformationsBox.PhoneField;
import com.velebit.anippe.client.work.lead.LeadForm.MainBox.MainTabBox.MainInformationsBox.PositionField;
import com.velebit.anippe.client.work.lead.LeadForm.MainBox.MainTabBox.MainInformationsBox.PostalCodeField;
import com.velebit.anippe.client.work.lead.LeadForm.MainBox.MainTabBox.MainInformationsBox.WebsiteField;
import com.velebit.anippe.client.work.lead.LeadForm.MainBox.MainTabBox.TasksBox;
import com.velebit.anippe.client.work.lead.LeadForm.MainBox.OkButton;
import com.velebit.anippe.client.work.lead.LeadForm.MainBox.SaveButton;
import com.velebit.anippe.shared.FontIcons;
import com.velebit.anippe.shared.work.lead.ILeadService;
import com.velebit.anippe.shared.work.lead.LeadFormData;

import db.migration.CountryLookupCall;

@FormData(value = LeadFormData.class, sdkCommand = FormData.SdkCommand.CREATE)
public class LeadForm extends AbstractForm {

	private Integer leadId;

	@FormData
	public Integer getLeadId() {
		return leadId;
	}

	@FormData
	public void setLeadId(Integer leadId) {
		this.leadId = leadId;
	}

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("Lead");
	}

	public MainBox getMainBox() {
		return getFieldByClass(MainBox.class);
	}

	@Override
	protected String getConfiguredIconId() {
		return FontIcons.UserPlus;
	}

	public MainTabBox getMainTabBox() {
		return getFieldByClass(MainTabBox.class);
	}

	public MainInformationsBox getMainInformationsBox() {
		return getFieldByClass(MainInformationsBox.class);
	}

	public TasksBox getTasksBox() {
		return getFieldByClass(TasksBox.class);
	}

	public DocumentsBox getDocumentsBox() {
		return getFieldByClass(DocumentsBox.class);
	}

	public SaveButton getSaveButton() {
		return getFieldByClass(SaveButton.class);
	}

	public FirstNameField getFirstNameField() {
		return getFieldByClass(FirstNameField.class);
	}

	public LastNameField getLastNameField() {
		return getFieldByClass(LastNameField.class);
	}

	public PositionField getPositionField() {
		return getFieldByClass(PositionField.class);
	}

	public EmailField getEmailField() {
		return getFieldByClass(EmailField.class);
	}

	public PhoneField getPhoneField() {
		return getFieldByClass(PhoneField.class);
	}

	public WebsiteField getWebsiteField() {
		return getFieldByClass(WebsiteField.class);
	}

	public CompanyField getCompanyField() {
		return getFieldByClass(CompanyField.class);
	}

	public AddressField getAddressField() {
		return getFieldByClass(AddressField.class);
	}

	public CityField getCityField() {
		return getFieldByClass(CityField.class);
	}

	public CountryField getCountryField() {
		return getFieldByClass(CountryField.class);
	}

	public DescriptionField getDescriptionField() {
		return getFieldByClass(DescriptionField.class);
	}

	public PostalCodeField getPostalCodeField() {
		return getFieldByClass(PostalCodeField.class);
	}

	public OkButton getOkButton() {
		return getFieldByClass(OkButton.class);
	}

	public CancelButton getCancelButton() {
		return getFieldByClass(CancelButton.class);
	}

	@Override
	protected int getConfiguredDisplayHint() {
		return DISPLAY_HINT_VIEW;
	}

	@Order(1000)
	public class MainBox extends AbstractGroupBox {

		@Order(1000)
		public class ActionsMenu extends AbstractActionsMenu {

			@Order(1000)
			public class EditMenu extends AbstractEditMenu {

				@Override
				protected void execAction() {
				}
			}

			@Order(2000)
			public class DeleteMenu extends AbstractDeleteMenu {

				@Override
				protected void execAction() {
				}
			}

		}

		@Order(2000)
		public class ConvertToCustomerMenu extends AbstractMenu {
			@Override
			protected String getConfiguredText() {
				return TEXTS.get("ConvertToCustomer");
			}

			@Override
			protected boolean getConfiguredVisible() {
				return false;
			}

			@Override
			protected String getConfiguredIconId() {
				return FontIcons.UserCheck;
			}

			@Override
			protected void execAction() {
			}
		}

		@Order(1000)
		public class MainTabBox extends AbstractTabBox {

			@Order(1000)
			public class MainInformationsBox extends AbstractGroupBox {

				@Override
				protected String getConfiguredLabel() {
					return TEXTS.get("MainInformations");
				}

				@Override
				protected int getConfiguredGridColumnCount() {
					return 2;
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
					protected int getConfiguredMaxLength() {
						return 128;
					}
				}

				@Order(2500)
				public class CompanyField extends AbstractStringField {
					@Override
					protected String getConfiguredLabel() {
						return TEXTS.get("Company");
					}

					@Override
					protected int getConfiguredMaxLength() {
						return 128;
					}
				}

				@Order(3000)
				public class PositionField extends AbstractStringField {
					@Override
					protected String getConfiguredLabel() {
						return TEXTS.get("Position");
					}

					@Override
					protected int getConfiguredMaxLength() {
						return 128;
					}
				}

				@Order(4000)
				public class EmailField extends AbstractStringField {
					@Override
					protected String getConfiguredLabel() {
						return TEXTS.get("Email");
					}

					@Override
					protected int getConfiguredMaxLength() {
						return 128;
					}
				}

				@Order(5000)
				public class PhoneField extends AbstractStringField {
					@Override
					protected String getConfiguredLabel() {
						return TEXTS.get("Phone");
					}

					@Override
					protected int getConfiguredMaxLength() {
						return 128;
					}
				}

				@Order(6000)
				public class WebsiteField extends AbstractStringField {
					@Override
					protected String getConfiguredLabel() {
						return TEXTS.get("Website");
					}

					@Override
					protected int getConfiguredMaxLength() {
						return 128;
					}
				}

				@Order(7000)
				public class AddressField extends AbstractStringField {
					@Override
					protected String getConfiguredLabel() {
						return TEXTS.get("Address");
					}

					@Override
					protected int getConfiguredMaxLength() {
						return 128;
					}
				}

				@Order(8000)
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

				@Order(8500)
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

				@Order(9000)
				public class CountryField extends AbstractSmartField<Long> {
					@Override
					protected String getConfiguredLabel() {
						return TEXTS.get("Country");
					}

					@Override
					public boolean isMandatory() {
						return true;
					}

					@Override
					protected Class<? extends ILookupCall<Long>> getConfiguredLookupCall() {
						return CountryLookupCall.class;
					}
				}

				@Order(10000)
				public class DescriptionField extends AbstractTextAreaField {
					@Override
					protected String getConfiguredLabel() {
						return TEXTS.get("Description");
					}

					@Override
					protected int getConfiguredGridW() {
						return 2;
					}

					@Override
					protected int getConfiguredMaxLength() {
						return 128;
					}
				}

			}

			@Order(2000)
			public class TasksBox extends AbstractGroupBox {
				@Override
				protected String getConfiguredLabel() {
					return TEXTS.get("Tasks");
				}
			}

			@Order(3000)
			public class DocumentsBox extends AbstractGroupBox {
				@Override
				protected String getConfiguredLabel() {
					return TEXTS.get("Documents");
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
			LeadFormData formData = new LeadFormData();
			exportFormData(formData);
			formData = BEANS.get(ILeadService.class).prepareCreate(formData);
			importFormData(formData);
		}

		@Override
		protected void execStore() {
			LeadFormData formData = new LeadFormData();
			exportFormData(formData);
			formData = BEANS.get(ILeadService.class).create(formData);
			importFormData(formData);

			MenuUtility.getMenuByClass(getMainBox(), ActionsMenu.class).setVisible(true);
			MenuUtility.getMenuByClass(getMainBox(), ConvertToCustomerMenu.class).setVisible(true);
		}
	}

	public class ModifyHandler extends AbstractFormHandler {
		@Override
		protected void execLoad() {
			LeadFormData formData = new LeadFormData();
			exportFormData(formData);
			formData = BEANS.get(ILeadService.class).load(formData);
			importFormData(formData);
		}

		@Override
		protected void execPostLoad() {
			getMainInformationsBox().setEnabled(false);
			MenuUtility.getMenuByClass(getMainBox(), ActionsMenu.class).setVisible(true);
			MenuUtility.getMenuByClass(getMainBox(), ConvertToCustomerMenu.class).setVisible(true);
		}

		@Override
		protected void execStore() {
			LeadFormData formData = new LeadFormData();
			exportFormData(formData);
			formData = BEANS.get(ILeadService.class).store(formData);
			importFormData(formData);
		}
	}
}
