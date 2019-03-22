package com.fruitbox.online.web.rest.resource;

import org.springframework.stereotype.Component;

@Component
public class LoginResource {
  private String userName;
  private String passWord;

  public LoginResource() {
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassWord() {
    return passWord;
  }

  public void setPassWord(String passWord) {
    this.passWord = passWord;
  }

  @Override
  public String toString() {
    return "LoginResource [userName=" + userName + ", passWord=" + passWord + "]";
  }

}
