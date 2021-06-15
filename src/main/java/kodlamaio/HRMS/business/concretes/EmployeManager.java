package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.EmployeService;
import kodlamaio.HRMS.core.untilities.result.DataResult;
import kodlamaio.HRMS.core.untilities.result.Result;
import kodlamaio.HRMS.core.untilities.result.SuccessDataResult;
import kodlamaio.HRMS.core.untilities.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.EmployeDao;
import kodlamaio.HRMS.entities.concretes.Employe;

@Service
public class EmployeManager implements EmployeService {
	
	private final EmployeDao employeDao;
	@Override
	public DataResult<List<Employe>> getAll() {
		this.employeDao.findAll();	
		return new SuccessDataResult<List<Employe>>( "Çalışanlar listelendi");
	}

	@Override
	public Result add(Employe employe) {
		this.employeDao.save(employe);
		return new SuccessResult("Çalışan eklendi");
	}
	
	@Autowired
	public EmployeManager(EmployeDao employeDao) {
		super();
		this.employeDao = employeDao;
	}


}
