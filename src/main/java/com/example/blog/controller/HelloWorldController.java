package com.example.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/** Testing page. */
@Controller
public class HelloWorldController {

  @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
  public String greeting(Model theModel) {

    theModel.addAttribute("theDate", new java.util.Date());
    return "helloworld";
  }
}
