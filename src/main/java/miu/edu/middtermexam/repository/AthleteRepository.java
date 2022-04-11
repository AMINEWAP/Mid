package miu.edu.middtermexam.repository;


import miu.edu.middtermexam.model.Athlete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AthleteRepository extends JpaRepository<Athlete,Long> {
}
