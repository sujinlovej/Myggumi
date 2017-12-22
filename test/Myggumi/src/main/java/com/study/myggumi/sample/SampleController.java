package com.study.myggumi.sample;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

  private final SampleService sampleService;

  @Autowired
  public SampleController(SampleService sampleService) {
    this.sampleService = sampleService;
  }

  @GetMapping("/")
  public String home() {
    return "index";
  }
  
  @GetMapping("/sample")
  public String sample(Model model) {

    List<Map<String, String>> dbVersion = sampleService.getDBVersion();
    model.addAttribute("message", dbVersion.toString());
    
    return "sample";
  }
}