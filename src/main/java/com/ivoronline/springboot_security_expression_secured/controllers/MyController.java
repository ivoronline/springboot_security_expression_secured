package com.ivoronline.springboot_security_expression_secured.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @ResponseBody
  @RequestMapping("/endPoint1")
  public String ep1() { return "endPoint1"; }

  @ResponseBody
  @RequestMapping("/endPoint2")
  public String ep2() { return "endPoint2"; }

  @Secured("ROLE_ADMIN")
  @ResponseBody
  @RequestMapping("/endPoint3")
  public String ep3() { return "endPoint3"; }

  @Secured({"ROLE_ADMIN", "ROLE_USER"})
  @ResponseBody
  @RequestMapping("/endPoint4")
  public String ep4() { return "endPoint4"; }

}
