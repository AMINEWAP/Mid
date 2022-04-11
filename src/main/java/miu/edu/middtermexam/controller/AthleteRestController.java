package miu.edu.middtermexam.controller;

import miu.edu.middtermexam.model.Athlete;
import miu.edu.middtermexam.service.AthleteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value= "/athlete/api")
public class AthleteRestController {

    private AthleteService athleteService;


    public AthleteRestController(AthleteService athleteService) {
        this.athleteService = athleteService;
    }

    @GetMapping(value = "/list")
    public List<Athlete> getAllAthletes() {
        return athleteService.getAllAthletes();
    }
}


