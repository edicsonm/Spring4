package com.edimoto.spring4.controller;

import com.edimoto.spring4.model.Spitter;
import com.edimoto.spring4.repository.SpitterRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

import static org.springframework.web.bind.annotation.RequestMethod.POST;


/**
 * Created by edicson on 31/1/17.
 */
@Controller
@RequestMapping(value = "/spitter")
public class SpitterController {

    @Autowired
    private SpitterRepository spitterRepository;

    public SpitterController() {
    }

    @Autowired
    public SpitterController(SpitterRepository spitterRepository) {
        this.spitterRepository = spitterRepository;
    }

    @RequestMapping(value = "/register")
    public String showRegistrationForm(Model model){
        Spitter spitter = new Spitter();
        spitter.setFirstName("Edicson");
        spitter.setLastName("Morales");
        model.addAttribute(spitter);
        return "registerForm";
    }

    @RequestMapping(value = "/register", method = POST)
    public String processRegistration(@RequestPart("profilePicture") MultipartFile profilePicture, @Valid Spitter spitter, RedirectAttributes model, Errors errors) {
        if (errors.hasErrors()) {
            return "registerForm";
        }
        spitterRepository.save(spitter);
        model.addAttribute("username", spitter.getUserName());
        model.addFlashAttribute("spitter", spitter);
        return "redirect:/spitter/{username}";
    }

    @RequestMapping(value = "/{userName}", method = RequestMethod.GET)
    public String showSpitterProfile(@PathVariable(value = "userName") String userName, Model model) {
        System.out.println(model.addAttribute("spitter"));
        if (!model.containsAttribute("spitter"))
            model.addAttribute(spitterRepository.findByUsername(userName));
        return "spitter";
    }

}
