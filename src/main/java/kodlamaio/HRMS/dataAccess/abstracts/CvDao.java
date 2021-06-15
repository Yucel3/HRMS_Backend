package kodlamaio.HRMS.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.concretes.Cv;

public interface CvDao extends JpaRepository<Cv, Integer>{
	
}
