package miu.edu.middtermexam.controller;


import miu.edu.middtermexam.service.AthleteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping(value="/athlete")
public class AthleteController {
    private AthleteService athleteService;

    public AthleteController(AthleteService athleteService) {
        this.athleteService = athleteService;
    }

    @GetMapping(value = {"/list"})
    public ModelAndView listStudents() {
        var modelAndView = new ModelAndView();
        var athletes = athleteService.getAllAthletes();
        modelAndView.addObject("athletes", athletes);
        modelAndView.addObject("athletesCount", ((List)athletes).size());
        modelAndView.setViewName("secured/athlete/list");
        return modelAndView;

    }
}
