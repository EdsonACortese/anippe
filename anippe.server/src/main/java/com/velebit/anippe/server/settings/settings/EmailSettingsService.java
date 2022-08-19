package com.velebit.anippe.server.settings.settings;

import com.velebit.anippe.shared.settings.settings.EmailSettingsFormData;
import com.velebit.anippe.shared.settings.settings.IEmailSettingsService;

public class EmailSettingsService implements IEmailSettingsService {
    @Override
    public EmailSettingsFormData prepareCreate(EmailSettingsFormData formData) {
        return formData;
    }

    @Override
    public EmailSettingsFormData create(EmailSettingsFormData formData) {
        return formData;
    }

    @Override
    public EmailSettingsFormData load(EmailSettingsFormData formData) {
        return formData;
    }

    @Override
    public EmailSettingsFormData store(EmailSettingsFormData formData) {
        return formData;
    }
}
