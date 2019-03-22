package com.fruitbox.online.web.rest.controller;

import com.fruitbox.online.util.CommonConstants;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "admin/fruitbox/v1", consumes = CommonConstants.CONTENT_TYPE)
public class AdminController {

  @RequestMapping(value = "register", method= RequestMethod.POST)
  @ApiOperation(value = "Create an admin")
  @ApiResponses(value = { @ApiResponse(code = 404, message = "Not Found") })
  public ResponseEntity<Object> createAdmin() {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

}
