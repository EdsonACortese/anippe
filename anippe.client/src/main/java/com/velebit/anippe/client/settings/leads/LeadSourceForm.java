package com.velebit.anippe.client.settings.leads;

import org.eclipse.scout.rt.client.dto.FormData;
import org.eclipse.scout.rt.client.ui.form.AbstractForm;
import org.eclipse.scout.rt.client.ui.form.AbstractFormHandler;
import org.eclipse.scout.rt.client.ui.form.fields.button.AbstractCancelButton;
import org.eclipse.scout.rt.client.ui.form.fields.button.AbstractOkButton;
import org.eclipse.scout.rt.client.ui.form.fields.groupbox.AbstractGroupBox;
import org.eclipse.scout.rt.client.ui.form.fields.stringfield.AbstractStringField;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.text.TEXTS;

import com.velebit.anippe.client.settings.leads.LeadSourceForm.MainBox.CancelButton;
import com.velebit.anippe.client.settings.leads.LeadSourceForm.MainBox.GroupBox;
import com.velebit.anippe.client.settings.leads.LeadSourceForm.MainBox.GroupBox.CodeField;
import com.velebit.anippe.client.settings.leads.LeadSourceForm.MainBox.GroupBox.ColorField;
import com.velebit.anippe.client.settings.leads.LeadSourceForm.MainBox.GroupBox.NameField;
import com.velebit.anippe.client.settings.leads.LeadSourceForm.MainBox.OkButton;
import com.velebit.anippe.shared.FontIcons;
import com.velebit.anippe.shared.settings.leads.ILeadSourceService;
import com.velebit.anippe.shared.settings.leads.LeadSourceFormData;

@FormData(value = LeadSourceFormData.class, sdkCommand = FormData.SdkCommand.CREATE)
public class LeadSourceForm extends AbstractForm {

	private Integer leadSourceId;

	@FormData
	public Integer getLeadSourceId() {
		return leadSourceId;
	}

	@Override
	protected String getConfiguredIconId() {
		return FontIcons.Draver;
	}

	@FormData
	public void setLeadSourceId(Integer leadSourceId) {
		this.leadSourceId = leadSourceId;
	}

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("Source");
	}

	public MainBox getMainBox() {
		return getFieldByClass(MainBox.class);
	}

	public GroupBox getGroupBox() {
		return getFieldByClass(GroupBox.class);
	}

	public ColorField getColorField() {
		return getFieldByClass(ColorField.class);
	}

	public CodeField getCodeField() {
		return getFieldByClass(CodeField.class);
	}

	public NameField getNameField() {
		return getFieldByClass(NameField.class);
	}

	public OkButton getOkButton() {
		return getFieldByClass(OkButton.class);
	}

	public CancelButton getCancelButton() {
		return getFieldByClass(CancelButton.class);
	}

	@Order(1000)
	public class MainBox extends AbstractGroupBox {

		@Override
		protected int getConfiguredWidthInPixel() {
			return 600;
		}

		@Order(1000)
		public class GroupBox extends AbstractGroupBox {
			@Override
			protected int getConfiguredGridColumnCount() {
				return 1;
			}

			@Order(-1000)
			public class CodeField extends AbstractStringField {
				@Override
				protected String getConfiguredLabel() {
					return TEXTS.get("Code");
				}

				@Override
				protected int getConfiguredLabelWidthInPixel() {
					return 80;
				}

				@Override
				protected int getConfiguredMaxLength() {
					return 128;
				}
			}

			@Order(0)
			public class ColorField extends AbstractStringField {
				@Override
				protected String getConfiguredLabel() {
					return TEXTS.get("Color");
				}

				@Override
				protected int getConfiguredLabelWidthInPixel() {
					return 80;
				}

				@Override
				protected int getConfiguredMaxLength() {
					return 128;
				}
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
				protected int getConfiguredLabelWidthInPixel() {
					return 80;
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

	public void startModify() {
		startInternalExclusive(new ModifyHandler());
	}

	public void startNew() {
		startInternal(new NewHandler());
	}

	public class NewHandler extends AbstractFormHandler {
		@Override
		protected void execLoad() {
			LeadSourceFormData formData = new LeadSourceFormData();
			exportFormData(formData);
			formData = BEANS.get(ILeadSourceService.class).prepareCreate(formData);
			importFormData(formData);
		}

		@Override
		protected void execStore() {
			LeadSourceFormData formData = new LeadSourceFormData();
			exportFormData(formData);
			formData = BEANS.get(ILeadSourceService.class).create(formData);
			importFormData(formData);
		}
	}

	public class ModifyHandler extends AbstractFormHandler {
		@Override
		protected void execLoad() {
			LeadSourceFormData formData = new LeadSourceFormData();
			exportFormData(formData);
			formData = BEANS.get(ILeadSourceService.class).load(formData);
			importFormData(formData);
		}

		@Override
		protected void execStore() {
			LeadSourceFormData formData = new LeadSourceFormData();
			exportFormData(formData);
			formData = BEANS.get(ILeadSourceService.class).store(formData);
			importFormData(formData);
		}
	}
}
