package com.bdk.controller;

import com.bdk.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
public class HelloController {

    private static List<Person> persons = new ArrayList<Person>();

    static {
        persons.add(new Person("Bill", "Gates"));
        persons.add(new Person("Steve", "Jobs"));
    }

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String index(Model model) {

        String message = "Hello Spring Boot + JSP";

        model.addAttribute("message", message);

        return "index";
    }

    @RequestMapping(value = {"/personList"}, method = RequestMethod.GET)
    public String viewPersonList(Model model) {

        model.addAttribute("persons", persons);

        return "personList";
    }

}