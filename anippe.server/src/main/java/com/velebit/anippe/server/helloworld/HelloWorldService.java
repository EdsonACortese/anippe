package com.velebit.anippe.server.helloworld;

import com.velebit.anippe.server.ServerSession;
import com.velebit.anippe.shared.helloworld.HelloWorldFormData;
import com.velebit.anippe.shared.helloworld.IHelloWorldService;

/**
 * @author Luka
 */
public class HelloWorldService implements IHelloWorldService {

  @Override
  public HelloWorldFormData load(HelloWorldFormData input) {
    StringBuilder msg = new StringBuilder();
    msg.append("Hello ").append(ServerSession.get().getUserId()).append('!');
    input.getMessage().setValue(msg.toString());
    return input;
  }
}
