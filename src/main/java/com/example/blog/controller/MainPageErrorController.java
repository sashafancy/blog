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
    Object obj = request.getAttribute("javax.servlet.error.status_code");
    int statusCode = 400;
    if (obj != null) {
      statusCode = (int) obj;
    }
    String errorMsg = "";

    if (statusCode == 400) {
      errorMsg = "Bad Request";
    } else if (statusCode == 401) {
      errorMsg = "Unauthorized";
    } else if (statusCode == 404) {
      errorMsg = "Resource not found";
    } else {
      errorMsg = "Internal Server Error";
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
