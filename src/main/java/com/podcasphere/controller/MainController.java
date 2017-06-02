package com.podcasphere.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.podcasphere.services.ItunesService;
import com.podcasphere.services.ItunesServiceImpl;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MainController {

//    @RequestMapping("/error")
//    public String errorAction(Model model, @RequestParam(value = "name", required = false) String name) {
//        model.addAttribute("name", name);
//        return "toto";
//    }

    @RequestMapping("/")
    public String mainAction(Model model, @RequestParam(value = "name", required = false) String name) {
        model.addAttribute("name", name);
        return "main";
    }

    @RequestMapping(value = "/itunes")
    public String showItunesResult(Model model, @RequestParam(value = "blabla", required = false) String name) {
        model.addAttribute("name", name);

        Map<String, String> entry = new HashMap<>();
//        String response = itunesService.searchContents(entry);

        return "itunes";
    }
}