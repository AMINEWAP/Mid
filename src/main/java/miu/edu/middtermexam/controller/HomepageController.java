package miu.edu.middtermexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {""})
public class HomepageController {

    @GetMapping(value = {"/", "/home"})
    public String displayHomepage() {
        return "public/home/index";
    }


}
