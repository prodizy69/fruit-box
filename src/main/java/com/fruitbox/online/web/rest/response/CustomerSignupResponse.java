package com.fruitbox.online.web.rest.response;

public class CustomerSignupResponse {

  private String status;
  private String userName;
  private String passWord;

  public CustomerSignupResponse() {
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
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
    return "CustomerSignupResponse [status=" + status + ", userName=" + userName + ", passWord=" + passWord + "]";
  }

}
