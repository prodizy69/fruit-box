package com.fruitbox.online.web.rest.resource;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;

@Component
public class CustomerSignupResource {
  @NotBlank
  private String userName;
  @NotBlank
  private String emailId;
  @NotBlank
  private String mobileNumber;
  @NotBlank
  private String passWord;

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getEmailId() {
    return emailId;
  }

  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public String getPassWord() {
    return passWord;
  }

  public void setPassWord(String passWord) {
    this.passWord = passWord;
  }

  public CustomerSignupResource() {
  }

  @Override
  public String toString() {
    return "CustomerSignupResource [userName=" + userName + ", emailId=" + emailId + ", mobileNumber=" + mobileNumber
        + ", passWord=" + passWord + "]";
  }

}
