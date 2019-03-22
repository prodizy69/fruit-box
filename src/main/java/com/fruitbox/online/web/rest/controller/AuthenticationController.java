package com.fruitbox.online.web.rest.controller;

import com.fruitbox.online.util.CommonConstants;
import com.fruitbox.online.web.rest.resource.CustomerInfoResource;
import com.fruitbox.online.web.rest.resource.CustomerSignupResource;
import com.fruitbox.online.web.rest.resource.LoginResource;
import com.fruitbox.online.web.rest.response.CustomerSignupResponse;
import com.fruitbox.online.web.rest.response.LoginResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("fruitbox/v1")
public class AuthenticationController {

  private final static Logger logger = LoggerFactory.getLogger(AuthenticationController.class);

  @RequestMapping(value = "/register", method = RequestMethod.POST, produces = CommonConstants.CONTENT_TYPE)
  @ApiOperation(value = "Registration for customer")
  @ApiResponses(value = {@ApiResponse(code = 404, message = "Not Found")})
  public ResponseEntity<CustomerSignupResponse> registerUser(
      @RequestBody final CustomerSignupResource customerSignupResource) {
    logger.info("Create customer request {}", customerSignupResource);
    CustomerSignupResponse customerSignupResponse = new CustomerSignupResponse();
    customerSignupResponse.setPassWord("test");
    customerSignupResponse.setStatus("Created");
    customerSignupResponse.setUserName("test");
    return new ResponseEntity<>(customerSignupResponse, HttpStatus.OK);
  }

  @RequestMapping(value = "/login", method = RequestMethod.POST, produces = CommonConstants.CONTENT_TYPE)
  @ApiOperation(value = "Registration for customer")
  @ApiResponses(value = {@ApiResponse(code = 404, message = "Not Found")})
  public ResponseEntity<LoginResponse> loginUser(@RequestBody final LoginResource loginResource) {
    logger.info("Login Request for userName {} and Password {}", loginResource.getUserName(), loginResource.getPassWord());
    LoginResponse loginResponse = new LoginResponse();
    loginResponse.setStatus("success");
    loginResponse.setInfo(new CustomerInfoResource());
    return new ResponseEntity<>(loginResponse, HttpStatus.OK);
  }

}
