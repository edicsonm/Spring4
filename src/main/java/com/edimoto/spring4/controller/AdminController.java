package com.edimoto.spring4.controller;

import com.edimoto.spring4.model.User;
import com.edimoto.spring4.repository.HibernateUserRepository;
import com.edimoto.spring4.repository.JpaUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by edicson on 8/2/17.
 */
@Controller
@RequestMapping(value = {"/admin"})
public class AdminController {

    @Autowired
    JpaUserRepository jpaUserRepository;

    @RequestMapping(value = {"/user/{userName:.+}"}, method = RequestMethod.GET)
    public String showSpitterProfile(@PathVariable(value = "userName") String userName, Model model) {
        if (!model.containsAttribute("user")) {
            model.addAttribute(jpaUserRepository.findBySSO(userName));
        }
        return "admin/user/viewForm";
    }
}
