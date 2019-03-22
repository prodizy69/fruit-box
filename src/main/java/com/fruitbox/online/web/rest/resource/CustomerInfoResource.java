package com.fruitbox.online.web.rest.resource;

public class CustomerInfoResource {
  private String firstName;
  private String lastName;
  private String emailId;
  private String mobileNumber;
  private String customerId;
  private Address address;

  public CustomerInfoResource() {
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
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

  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "CustomerInfoResource [firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
        + ", mobileNumber=" + mobileNumber + ", customerId=" + customerId + ", address=" + address + "]";
  }

  public static class Address {
    private String addressline1;
    private String addressline2;
    private String city;
    private String state;
    private String country;
    private String zipCode;

    public Address() {
    }

    public String getAddressline1() {
      return addressline1;
    }

    public void setAddressline1(String addressline1) {
      this.addressline1 = addressline1;
    }

    public String getAddressline2() {
      return addressline2;
    }

    public void setAddressline2(String addressline2) {
      this.addressline2 = addressline2;
    }

    public String getCity() {
      return city;
    }

    public void setCity(String city) {
      this.city = city;
    }

    public String getState() {
      return state;
    }

    public void setState(String state) {
      this.state = state;
    }

    public String getCountry() {
      return country;
    }

    public void setCountry(String country) {
      this.country = country;
    }

    public String getZipCode() {
      return zipCode;
    }

    public void setZipCode(String zipCode) {
      this.zipCode = zipCode;
    }

    @Override
    public String toString() {
      return "Address [addressline1=" + addressline1 + ", addressline2=" + addressline2 + ", city=" + city + ", state="
          + state + ", country=" + country + ", zipCode=" + zipCode + "]";
    }

  }
}
