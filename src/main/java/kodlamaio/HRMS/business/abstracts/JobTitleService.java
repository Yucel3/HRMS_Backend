package kodlamaio.HRMS.business.abstracts;

import java.util.List;


import kodlamaio.HRMS.core.untilities.result.DataResult;
import kodlamaio.HRMS.core.untilities.result.Result;
import kodlamaio.HRMS.entities.dtos.JobTitleAddDto;
import kodlamaio.HRMS.entities.dtos.JobTitleDto;

public interface JobTitleService {
	
	DataResult<List<JobTitleDto>> getAll();

	Result add(JobTitleAddDto jobTitle);
	
	DataResult<List<JobTitleDto>> getByIsActive(boolean isActive);
	
	DataResult<List<JobTitleDto>> getAllSorted();
	
	DataResult<List<JobTitleDto>> getAllSortedAsc();
	
	
	DataResult<List<JobTitleDto>> getAllByCityAsc();
	
	DataResult<List<JobTitleDto>> getAllByCityDesc();
	
	DataResult<List<JobTitleDto>> getAllByCompanyAsc();
	
	DataResult<List<JobTitleDto>> getAllByCompanyDesc();
	
	DataResult<List<JobTitleDto>> getAllByPositionAsc();
	
	DataResult<List<JobTitleDto>> getAllByPositionDesc();

		

}
