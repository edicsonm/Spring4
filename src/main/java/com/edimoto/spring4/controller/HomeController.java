package com.edimoto.spring4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by edicson on 26/1/17.
 */
@Controller
@RequestMapping(value = {"/","/home","/index.jsp","/index.html"})
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String home() {
        System.out.println("Pasa por aca !!!");
        return "home";
    }


}
