package com.edimoto.spring4.controller;

import com.edimoto.spring4.model.Spittle;
import com.edimoto.spring4.exception.DuplicateSpittleException;
import com.edimoto.spring4.exception.SpittleNotFoundException;
import com.edimoto.spring4.repository.SpittleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by edicson on 30/1/17.
 */
@Controller
@RequestMapping("/spittles")
public class SpittleController {
    private static final String MAX_LONG_AS_STRING = "50";
    private SpittleRepository spittleRepository;
//    private static final String MAX_LONG_AS_STRING = Long.toString(Long.MAX_VALUE);

    @Autowired
    public SpittleController(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String spittles(@RequestParam(value = "max", defaultValue = MAX_LONG_AS_STRING) long max,
                           @RequestParam(value = "count", defaultValue = "20") int count,
                           Model model) {
        model.addAttribute(spittleRepository.findSpittles(max, count));
        return "spittles";
    }

    @RequestMapping(value="/{spittleId}", method=RequestMethod.GET)
    public String showSpittle(@PathVariable(value = "spittleId") long spittleId, Model model) {
        Spittle spittle = spittleRepository.findOne(spittleId);
        if (spittle == null) {
            throw new SpittleNotFoundException();
        }
        model.addAttribute(spittle);
        return "spittle";
    }

//    @RequestMapping(method=RequestMethod.POST)
//    public String saveSpittle(SpittleForm form, Model model) {
//        try {
//            spittleRepository.save(new Spittle(null, form.getMessage(), new Date(), form.getLongitude(), form.getLatitude()));
//            return "redirect:/spittles";
//        } catch (DuplicateSpittleException e) {
//            return "error/duplicate";
//        }
//    }



}
