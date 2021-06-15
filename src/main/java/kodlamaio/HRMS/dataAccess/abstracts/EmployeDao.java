package kodlamaio.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.concretes.Employe;

public interface EmployeDao extends JpaRepository<Employe, Integer> {

}
