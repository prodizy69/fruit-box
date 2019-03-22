package com.fruitbox.online.web.rest.response;

import com.fruitbox.online.web.rest.resource.CustomerInfoResource;

public class LoginResponse {
  private String status;
  private CustomerInfoResource info;

  public LoginResponse() {
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public CustomerInfoResource getInfo() {
    return info;
  }

  public void setInfo(CustomerInfoResource info) {
    this.info = info;
  }

  @Override
  public String toString() {
    return "LoginResponse [status=" + status + ", info=" + info + "]";
  }

}
