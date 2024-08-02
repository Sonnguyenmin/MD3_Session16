package com.ra.baitap1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping(value ={ "/", "/home"})
    public String home(@RequestParam(value = "money", required = false) Double money,
                       @RequestParam(value = "rateMoney", required = false) Double rate,
                       Model model) {
        if (money != null && rate != null) {
            double result = money / rate;
            model.addAttribute("money", money);
            model.addAttribute("rateMoney", rate);
            model.addAttribute("result", result);
            return "result";
        }
        return "home";
    }
}
