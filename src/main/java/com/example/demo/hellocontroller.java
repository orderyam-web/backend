package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView; 

@Controller
public class hellocontroller{

    @RequestMapping(value="/test", method=RequestMethod.GET)
    public ModelAndView hello() {
        final ModelAndView view = new ModelAndView();
        view.setViewName("INIStdPayRequest");
        return view;
    }
}
