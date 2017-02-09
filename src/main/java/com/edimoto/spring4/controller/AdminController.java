package com.edimoto.spring4.controller;

import com.edimoto.spring4.model.User;
import com.edimoto.spring4.repository.UserRepository;
import com.edimoto.spring4.repository.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

/**
 * Created by edicson on 8/2/17.
 */
@Controller
@RequestMapping(value = {"/admin"})
public class AdminController {

    @Autowired
    @Qualifier(value = "userRepository")
    UserRepository userRepository;

    @RequestMapping(value = {"user/register"}, method = RequestMethod.GET)
    public String registerUserGet(Model model) {
        model.addAttribute(new User());
        return "admin/user/registerForm";
    }

    @RequestMapping(value = {"user/register"}, method = RequestMethod.POST)
    public String registerUserPost(@RequestPart("profilePicture") MultipartFile profilePicture,
                                   @Valid User user, RedirectAttributes model, Errors errors) {
        if (errors.hasErrors()) {
            return "admin/user/registerForm";
        }
        userRepository.save(user);
        model.addAttribute("username", user.getUserName());
        model.addFlashAttribute("user", user);
        return "redirect:/admin/user/{username}";
    }

    @RequestMapping(value = {"/user/{userName:.+}"}, method = RequestMethod.GET)
    public String showSpitterProfile(@PathVariable(value = "userName") String userName, Model model) {
        if (!model.containsAttribute("user"))
            model.addAttribute(userRepository.findBySSO(userName));
        return "admin/user/viewForm";
    }
}
