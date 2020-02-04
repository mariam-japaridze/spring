package com.ug.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

    @RequestMapping(path = {"/add"}, method = RequestMethod.GET)
    public ModelAndView add(@RequestParam("t1") int num1, @RequestParam("t2") int num2) {

        ModelAndView mv = new ModelAndView();
        long sum = num1 + num2;

        mv.addObject("result", sum);
        mv.setViewName("result");

        return mv;

    }
}
