package com.edimoto.spring4.controller;

import com.edimoto.spring4.exception.DuplicateSpittleException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by edicson on 6/2/17.
 */
@ControllerAdvice
public class AppControllerAdvicer {

    @ExceptionHandler(DuplicateSpittleException.class)
    public String handleDuplicateSpittle() {
        return "error/duplicate";
    }

}
