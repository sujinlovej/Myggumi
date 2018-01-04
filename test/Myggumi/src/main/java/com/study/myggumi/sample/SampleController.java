package com.study.myggumi.sample;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

  private final SampleService sampleService;

  @Autowired
  public SampleController(SampleService sampleService) {
    this.sampleService = sampleService;
  }

 @GetMapping("/1")
  public String home() {
    return "index";
  }
  
  @GetMapping("/sample")
  public String sample(Model model) {

    List<Map<String, String>> dbVersion = sampleService.getDBVersion();
    model.addAttribute("message", dbVersion.toString());
    
    return "sample";
  }
  
  /*@RequestMapping("main")
  public ModelAndView mainpage() {
	  ModelAndView modelAndView = new ModelAndView();
	  modelAndView.setViewName("sample1");
	  
	  return modelAndView;
  }*/
  
}