package com.example.blog;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ErrorController.class)
public class ErrorPageTest {

  @Autowired private MockMvc mockMvc;

  @Test
  public void shouldReturnNotFoundError() throws Exception {
    this.mockMvc.perform(get("/greeting")).andExpect(status().isNotFound());
  }

  @Test
  public void shouldDisplayErrorMessage() throws Exception {
    this.mockMvc.perform(get("/error")).andExpect(content().string(containsString("Error")));
  }
}
