package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.CompanyService;
import kodlamaio.HRMS.core.configadapters.abstracts.ModelMapperService;
import kodlamaio.HRMS.core.untilities.result.DataResult;
import kodlamaio.HRMS.core.untilities.result.Result;
import kodlamaio.HRMS.core.untilities.result.SuccessDataResult;
import kodlamaio.HRMS.core.untilities.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.CompanyDao;
import kodlamaio.HRMS.entities.concretes.Company;
import kodlamaio.HRMS.entities.dtos.CompanyAddDto;
import kodlamaio.HRMS.entities.dtos.CompanyDto;

@Service
public class CompanyManager implements CompanyService {
	private CompanyDao companyDao;
	private ModelMapperService modelMapperService;

	@Autowired
	public CompanyManager(CompanyDao companyDao, ModelMapperService modelMapperService) {
		super();
		this.companyDao = companyDao;
		this.modelMapperService = modelMapperService;
	}

	@Override
	public DataResult<List<CompanyDto>> getAll() {
		return new SuccessDataResult<List<CompanyDto>>(
				modelMapperService.entityToDto(companyDao.findAll(), CompanyDto.class), "İş verenler listelendi");
	}

	@Override
	public Result add(CompanyAddDto company) {
		this.companyDao.save((Company) modelMapperService.dtoToEntity(company, Company.class));
		return new SuccessResult("iş veren eklendi");
	}

}
