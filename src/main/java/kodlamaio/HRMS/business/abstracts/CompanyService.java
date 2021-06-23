package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.untilities.result.DataResult;
import kodlamaio.HRMS.core.untilities.result.Result;
import kodlamaio.HRMS.entities.dtos.CompanyAddDto;
import kodlamaio.HRMS.entities.dtos.CompanyDto;


public interface CompanyService {
	DataResult<List<CompanyDto>> getAll();
	Result add(CompanyAddDto company);
}
