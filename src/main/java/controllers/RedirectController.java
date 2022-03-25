package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedirectController {

    @GetMapping("/first")
    public String zad2First() {
        return "first";

    }

    @GetMapping("/third")
    public String zad2Third() {
        return "third";

    }

    @GetMapping("/second")
    public String zad2Second() {
        return "redirect:third";

    }
}
