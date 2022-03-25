package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@Controller
public class HeaderController {

    @GetMapping("/showUserAgent")
    public String action(Model model, @RequestHeader("user-agent") String userAgent){
        model.addAttribute("agentResult", userAgent);
        return "userAgent";

    }
}
