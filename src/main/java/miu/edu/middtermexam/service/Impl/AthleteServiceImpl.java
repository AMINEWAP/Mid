package miu.edu.middtermexam.service.Impl;

import miu.edu.middtermexam.model.Athlete;
import miu.edu.middtermexam.repository.AthleteRepository;
import miu.edu.middtermexam.service.AthleteService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AthleteServiceImpl implements AthleteService {

    private AthleteRepository athleteRepository;

    public AthleteServiceImpl(AthleteRepository athleteRepository) {
        this.athleteRepository = athleteRepository;
    }

    @Override
    public List<Athlete> getAllAthletes() {
        return athleteRepository.findAll(Sort.by(Sort.Direction.ASC, "fullName"));
    }
}
