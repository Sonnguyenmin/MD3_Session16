package com.ra.baitap2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class homeController {
    @RequestMapping(value = {"/", "/home"})
    public String home(@RequestParam(value = "searchQuery", required = false)
                           String searchQuery, Model model) {
        List<String> resultList = new ArrayList<>();
        resultList.add("home");
        if (searchQuery != null) {
            for(String result : resultList) {
                if(result.equals(searchQuery)) {
                    model.addAttribute("result","has found" + searchQuery);
                    return "home";
                }
            }

        }
        model.addAttribute("result","has not found" + searchQuery);
        return "home";
    }
}
