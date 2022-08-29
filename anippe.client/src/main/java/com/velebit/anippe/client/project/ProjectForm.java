package com.velebit.anippe.client.project;

import org.eclipse.scout.rt.client.dto.FormData;
import org.eclipse.scout.rt.client.ui.form.AbstractForm;
import org.eclipse.scout.rt.client.ui.form.AbstractFormHandler;
import org.eclipse.scout.rt.client.ui.form.fields.button.AbstractCancelButton;
import org.eclipse.scout.rt.client.ui.form.fields.button.AbstractOkButton;
import org.eclipse.scout.rt.client.ui.form.fields.groupbox.AbstractGroupBox;
import org.eclipse.scout.rt.client.ui.form.fields.listbox.AbstractListBox;
import org.eclipse.scout.rt.client.ui.form.fields.stringfield.AbstractStringField;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.text.TEXTS;
import org.eclipse.scout.rt.shared.services.lookup.ILookupCall;

import com.velebit.anippe.client.common.fields.AbstractTextAreaField;
import com.velebit.anippe.client.project.ProjectForm.MainBox.CancelButton;
import com.velebit.anippe.client.project.ProjectForm.MainBox.GroupBox;
import com.velebit.anippe.client.project.ProjectForm.MainBox.OkButton;
import com.velebit.anippe.shared.FontIcons;
import com.velebit.anippe.shared.project.IProjectService;
import com.velebit.anippe.shared.project.ProjectFormData;
import com.velebit.anippe.shared.work.UserLookupCall;
import com.velebit.anippe.client.project.ProjectForm.MainBox.GroupBox.NameField;
import com.velebit.anippe.client.project.ProjectForm.MainBox.GroupBox.DescriptionField;
import com.velebit.anippe.client.project.ProjectForm.MainBox.GroupBox.UsersBox;

@FormData(value = ProjectFormData.class, sdkCommand = FormData.SdkCommand.CREATE)
public class ProjectForm extends AbstractForm {

	private Integer projectId;

	@FormData
	public Integer getProjectId() {
		return projectId;
	}

	@FormData
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("Project");
	}

	@Override
	protected String getConfiguredIconId() {
		return FontIcons.FolderOpen;
	}

	public MainBox getMainBox() {
		return getFieldByClass(MainBox.class);
	}

	public GroupBox getGroupBox() {
		return getFieldByClass(GroupBox.class);
	}

	public DescriptionField getDescriptionField() {
		return getFieldByClass(DescriptionField.class);
	}

	public UsersBox getUsersBox() {
		return getFieldByClass(UsersBox.class);
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
		@Order(1000)
		public class GroupBox extends AbstractGroupBox {

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
			public class DescriptionField extends AbstractTextAreaField {
				@Override
				protected String getConfiguredLabel() {
					return TEXTS.get("Description");
				}

				@Override
				protected int getConfiguredMaxLength() {
					return 128;
				}
			}

			@Order(3000)
			public class UsersBox extends AbstractListBox<Long> {
				@Override
				protected String getConfiguredLabel() {
					return TEXTS.get("Users");
				}

				@Override
				protected Class<? extends ILookupCall<Long>> getConfiguredLookupCall() {
					return UserLookupCall.class;
				}

				@Override
				protected int getConfiguredGridH() {
					return 6;
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
			ProjectFormData formData = new ProjectFormData();
			exportFormData(formData);
			formData = BEANS.get(IProjectService.class).prepareCreate(formData);
			importFormData(formData);
		}

		@Override
		protected void execStore() {
			ProjectFormData formData = new ProjectFormData();
			exportFormData(formData);
			formData = BEANS.get(IProjectService.class).create(formData);
			importFormData(formData);
		}
	}

	public class ModifyHandler extends AbstractFormHandler {
		@Override
		protected void execLoad() {
			ProjectFormData formData = new ProjectFormData();
			exportFormData(formData);
			formData = BEANS.get(IProjectService.class).load(formData);
			importFormData(formData);
		}

		@Override
		protected void execStore() {
			ProjectFormData formData = new ProjectFormData();
			exportFormData(formData);
			formData = BEANS.get(IProjectService.class).store(formData);
			importFormData(formData);
		}
	}
}
