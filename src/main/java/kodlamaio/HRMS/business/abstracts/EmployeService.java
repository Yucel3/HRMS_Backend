package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.untilities.result.DataResult;
import kodlamaio.HRMS.core.untilities.result.Result;
import kodlamaio.HRMS.entities.concretes.Employe;


public interface EmployeService {
	
	DataResult<List<Employe>> getAll();
	Result add(Employe employe);
}
