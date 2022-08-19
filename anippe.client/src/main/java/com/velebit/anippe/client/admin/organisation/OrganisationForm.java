package com.velebit.anippe.client.admin.organisation;

import java.util.List;

import org.eclipse.scout.rt.client.dto.FormData;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractDateTimeColumn;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractStringColumn;
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
import org.eclipse.scout.rt.client.ui.form.fields.tablefield.AbstractTableField;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.text.TEXTS;
import org.eclipse.scout.rt.shared.services.lookup.ILookupCall;

import com.velebit.anippe.client.admin.organisation.OrganisationForm.MainBox.CancelButton;
import com.velebit.anippe.client.admin.organisation.OrganisationForm.MainBox.MainTabBox.AdministratorsBox;
import com.velebit.anippe.client.admin.organisation.OrganisationForm.MainBox.MainTabBox.AdministratorsBox.AdministratorsTableField;
import com.velebit.anippe.client.admin.organisation.OrganisationForm.MainBox.OkButton;
import com.velebit.anippe.client.common.columns.AbstractIDColumn;
import com.velebit.anippe.client.common.interaction.NotificationHelper;
import com.velebit.anippe.client.common.menus.AbstractAddMenu;
import com.velebit.anippe.client.common.menus.AbstractDeleteMenu;
import com.velebit.anippe.client.common.menus.AbstractEditMenu;
import com.velebit.anippe.shared.FontIcons;
import com.velebit.anippe.shared.admin.organisation.IOrganisationService;
import com.velebit.anippe.shared.admin.organisation.OrganisationFormData;
import com.velebit.anippe.shared.admin.organisation.OrganisationFormData.AdministratorsTable.AdministratorsTableRowData;

import db.migration.CountryLookupCall;
import com.velebit.anippe.client.admin.organisation.OrganisationForm.MainBox.MainTabBox.MainInformationsBox.SubdomainField;
import com.velebit.anippe.client.admin.organisation.OrganisationForm.MainBox.MainTabBox.MainInformationsBox.WebsiteField;
import com.velebit.anippe.client.admin.organisation.OrganisationForm.MainBox.MainTabBox.MainInformationsBox.EmailField;
import com.velebit.anippe.client.admin.organisation.OrganisationForm.MainBox.MainTabBox.MainInformationsBox.PhoneField;

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

	public AdministratorsBox getAdministratorsBox() {
		return getFieldByClass(AdministratorsBox.class);
	}

	public AdministratorsTableField getAdministratorsTableField() {
		return getFieldByClass(AdministratorsTableField.class);
	}

	public SubdomainField getSubdomainField() {
		return getFieldByClass(SubdomainField.class);
	}

	public WebsiteField getWebsiteField() {
		return getFieldByClass(WebsiteField.class);
	}

	public EmailField getEmailField() {
		return getFieldByClass(EmailField.class);
	}

	public PhoneField getPhoneField() {
		return getFieldByClass(PhoneField.class);
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

				@Order(1500)
				public class SubdomainField extends AbstractStringField {
					@Override
					protected String getConfiguredLabel() {
						return TEXTS.get("Subdomain");
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

				@Order(8000)
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

			}

			@Order(2000)
			public class AdministratorsBox extends AbstractGroupBox {
				@Override
				protected String getConfiguredLabel() {
					return TEXTS.get("Administrators");
				}

				@Override
				protected boolean getConfiguredVisible() {
					return false;
				}

				@Order(1000)
				public class AdministratorsTableField extends AbstractTableField<AdministratorsTableField.Table> {
					@Override
					protected boolean getConfiguredLabelVisible() {
						return false;
					}

					@Override
					protected int getConfiguredGridH() {
						return 6;
					}

					public class Table extends AbstractTable {
						@Override
						protected boolean getConfiguredAutoResizeColumns() {
							return true;
						}

						public UserIdColumn getUserIdColumn() {
							return getColumnSet().getColumnByClass(UserIdColumn.class);
						}

						public UsernameColumn getUsernameColumn() {
							return getColumnSet().getColumnByClass(UsernameColumn.class);
						}

						public FirstNameColumn getFirstNameColumn() {
							return getColumnSet().getColumnByClass(FirstNameColumn.class);
						}

						public LastNameColumn getLastNameColumn() {
							return getColumnSet().getColumnByClass(LastNameColumn.class);
						}

						public LastLoginAtColumn getLastLoginAtColumn() {
							return getColumnSet().getColumnByClass(LastLoginAtColumn.class);
						}

						@Order(1000)
						public class AddMenu extends AbstractAddMenu {

							@Override
							protected void execAction() {

								if (getOrganisationId() == null) {
									NotificationHelper.showErrorNotification(TEXTS.get("SaveChangesBeforeAction"));
									return;
								}

								AdministratorForm form = new AdministratorForm();
								form.setOrganisationId(getOrganisationId());
								form.startNew();
								form.waitFor();
								if (form.isFormStored()) {
									fetchAdministrators();
								}
							}
						}

						@Order(1000)
						public class EditMenu extends AbstractEditMenu {

							@Override
							protected void execAction() {
								AdministratorForm form = new AdministratorForm();
								form.setUserId(getUserIdColumn().getSelectedValue());
								form.startModify();
								form.waitFor();
								if (form.isFormStored()) {
									fetchAdministrators();
								}
							}
						}

						@Order(2000)
						public class DeleteMenu extends AbstractDeleteMenu {

							@Override
							protected void execAction() {
							}
						}

						@Order(1000)
						public class UserIdColumn extends AbstractIDColumn {

						}

						@Order(3000)
						public class FirstNameColumn extends AbstractStringColumn {
							@Override
							protected String getConfiguredHeaderText() {
								return TEXTS.get("FirstName");
							}

							@Override
							protected int getConfiguredWidth() {
								return 100;
							}
						}

						@Order(4000)
						public class LastNameColumn extends AbstractStringColumn {
							@Override
							protected String getConfiguredHeaderText() {
								return TEXTS.get("LastName");
							}

							@Override
							protected int getConfiguredWidth() {
								return 100;
							}
						}

						@Order(5000)
						public class UsernameColumn extends AbstractStringColumn {
							@Override
							protected String getConfiguredHeaderText() {
								return TEXTS.get("Username");
							}

							@Override
							protected int getConfiguredWidth() {
								return 100;
							}
						}

						@Order(6000)
						public class LastLoginAtColumn extends AbstractDateTimeColumn {
							@Override
							protected String getConfiguredHeaderText() {
								return TEXTS.get("LastLoginAt");
							}

							@Override
							protected int getConfiguredWidth() {
								return 120;
							}
						}

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

			fetchAdministrators();
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
		protected void execPostLoad() {
			getAdministratorsBox().setVisible(true);

			setLabels();
		}

		@Override
		protected void execStore() {
			OrganisationFormData formData = new OrganisationFormData();
			exportFormData(formData);
			formData = BEANS.get(IOrganisationService.class).store(formData);
			importFormData(formData);
		}
	}

	public void fetchAdministrators() {
		getAdministratorsBox().setVisible(true);

		List<AdministratorsTableRowData> rows = BEANS.get(IOrganisationService.class).fetchAdministrators(getOrganisationId());
		getAdministratorsTableField().getTable().importFromTableRowBeanData(rows, AdministratorsTableRowData.class);
	}

	public void setLabels() {
		Integer adminsCount = getAdministratorsTableField().getTable().getRowCount();
		getAdministratorsBox().setLabel(getAdministratorsBox().getConfiguredLabel() + " (" + adminsCount + ")");
	}
}
