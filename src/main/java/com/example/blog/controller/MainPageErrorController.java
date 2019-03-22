package com.example.blog.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainPageErrorController implements ErrorController {

  @RequestMapping("/error")
  public String handleError(HttpServletRequest request, Model theModel) {

    int statusCode = (int) request.getAttribute("javax.servlet.error.status_code");
    String errorMsg = "";

    if (statusCode == 400) {
      errorMsg = "Bad Request";
    } else if (statusCode == 401){
      errorMsg = "Unauthorized";
    } else if (statusCode == 404) {
      errorMsg = "Resource not found";
    } else {
      errorMsg = "Http Error Code: 500. Internal Server Error";
    }

    theModel.addAttribute("errorCode", statusCode);
    theModel.addAttribute("errorMsg", errorMsg);
    return "error";
  }

  @Override
  public String getErrorPath() {
    return "/error";
  }
}
