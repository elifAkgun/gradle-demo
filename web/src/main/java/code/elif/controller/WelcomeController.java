package code.elif.controller;

import code.elif.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class WelcomeController {

    private final DemoService demoService;

    @Autowired
    public WelcomeController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping("welcome")
    public String welcome(Model model){
        log.info("welcome function is called");
        model.addAttribute("message", demoService.getMessage());
        return "welcome";
    }
}
