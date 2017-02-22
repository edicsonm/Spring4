package com.edimoto.spring4.controller;

import com.edimoto.spring4.model.User;
import com.edimoto.spring4.repository.JpaUserRepository;
import com.edimoto.spring4.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

/**
 * Created by edicson on 26/1/17.
 */
@Controller
public class HomeController {

    @Autowired
    JpaUserRepository jpaUserRepository;

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String home() {
        return "home";
    }

    @RequestMapping(value = {"signup"}, method = RequestMethod.GET)
    public String registerUserGet(Model model) {
        User user = new User("Pepito", "Perez", "pepito.perez@gmail.com", "bigfoot69");
        model.addAttribute(user);
        return "signup";
    }

    @RequestMapping(value = {"signup"}, method = RequestMethod.POST)
//    public String registerUserPost(@RequestParam("profilePicture") MultipartFile profilePicture,
//            @Valid User user, RedirectAttributes model, Errors errors){
    public String registerUserPost(@Valid User user, Errors errors) {
//    public String registerUserPost(@ModelAttribute("user") @Valid User user, BindingResult result, ModelMap model){
//    public String registerUserPost(@RequestPart("profilePicture") MultipartFile profilePicture,
////                                   @Valid User user, RedirectAttributes model, Errors errors) {
        if (errors.hasErrors()) {
            return "signup";
        }



        jpaUserRepository.save(user);
//        jpaUserRepository.saveUser(new User("Pepito1", "Perez2", "pepito.perez@gmail.com", "bigfoot69"));
//        jpaUserRepository.save(new User("Pepito2", "Perez3", "pepito.perez@gmail.com", "bigfoot69"));

//        model.addAttribute("username", user.getUserName());
//        model.addFlashAttribute("user", user);
        return "redirect:/";
    }


}


