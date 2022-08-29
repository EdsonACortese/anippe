package com.velebit.anippe.client.project;

import org.eclipse.scout.rt.client.dto.FormData;
import org.eclipse.scout.rt.client.ui.form.AbstractForm;
import org.eclipse.scout.rt.client.ui.form.AbstractFormHandler;
import org.eclipse.scout.rt.client.ui.form.fields.button.AbstractCancelButton;
import org.eclipse.scout.rt.client.ui.form.fields.button.AbstractOkButton;
import org.eclipse.scout.rt.client.ui.form.fields.groupbox.AbstractGroupBox;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.text.TEXTS;

import com.velebit.anippe.client.project.ProjectCardForm.MainBox.CancelButton;
import com.velebit.anippe.client.project.ProjectCardForm.MainBox.GroupBox;
import com.velebit.anippe.client.project.ProjectCardForm.MainBox.OkButton;
import com.velebit.anippe.shared.FontIcons;
import com.velebit.anippe.shared.project.IProjectCardService;
import com.velebit.anippe.shared.project.ProjectCardFormData;

@FormData(value = ProjectCardFormData.class, sdkCommand = FormData.SdkCommand.CREATE)
public class ProjectCardForm extends AbstractForm {
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

	public OkButton getOkButton() {
		return getFieldByClass(OkButton.class);
	}

	@Override
	protected int getConfiguredDisplayHint() {
		return DISPLAY_HINT_VIEW;
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

	public class ModifyHandler extends AbstractFormHandler {
		@Override
		protected void execLoad() {
			ProjectCardFormData formData = new ProjectCardFormData();
			exportFormData(formData);
			formData = BEANS.get(IProjectCardService.class).load(formData);
			importFormData(formData);
		}

		@Override
		protected void execStore() {
			ProjectCardFormData formData = new ProjectCardFormData();
			exportFormData(formData);
			formData = BEANS.get(IProjectCardService.class).store(formData);
			importFormData(formData);
		}
	}
}
