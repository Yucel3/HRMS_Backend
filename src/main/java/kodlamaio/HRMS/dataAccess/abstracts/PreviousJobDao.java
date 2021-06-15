package kodlamaio.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.concretes.PreviousJob;

public interface PreviousJobDao extends JpaRepository<PreviousJob, Integer> {

}
