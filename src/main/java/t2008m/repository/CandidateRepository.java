package t2008m.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import t2008m.entity.Candidate;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate,Integer> {
}