package com.velebit.anippe.server.settings.users;

import com.velebit.anippe.shared.settings.users.IUserService;
import com.velebit.anippe.shared.settings.users.UserFormData;

public class UserService implements IUserService {
  @Override
  public UserFormData prepareCreate(UserFormData formData) {
    return formData;
  }

  @Override
  public UserFormData create(UserFormData formData) {
    return formData;
  }

  @Override
  public UserFormData load(UserFormData formData) {
    return formData;
  }

  @Override
  public UserFormData store(UserFormData formData) {
    return formData;
  }
}
