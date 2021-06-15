package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.CompanyService;
import kodlamaio.HRMS.core.untilities.result.DataResult;
import kodlamaio.HRMS.core.untilities.result.Result;
import kodlamaio.HRMS.core.untilities.result.SuccessDataResult;
import kodlamaio.HRMS.core.untilities.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.CompanyDao;
import kodlamaio.HRMS.entities.concretes.Company;


@Service
public class CompanyManager implements CompanyService{
	private final CompanyDao companyDao;
	@Autowired
	public CompanyManager(CompanyDao companyDao) {
		super();
		this.companyDao = companyDao;
	}

	@Override
	public DataResult<List<Company>> getAll() {
		this.companyDao.findAll();
		return new SuccessDataResult<List<Company>>("İş verenler listelendi");
	}

	@Override
	public Result add(Company company) {
		this.companyDao.save(company);
		return new SuccessResult("iş veren eklendi");
	}

}
