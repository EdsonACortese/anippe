package com.velebit.anippe.server.project;

import com.velebit.anippe.shared.project.IProjectCardService;
import com.velebit.anippe.shared.project.ProjectCardFormData;

public class ProjectCardService implements IProjectCardService {
	@Override
	public ProjectCardFormData load(ProjectCardFormData formData) {
		return formData;
	}

	@Override
	public ProjectCardFormData store(ProjectCardFormData formData) {
		return formData;
	}
}
