package kodlamaio.HRMS.api.conrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.JobTitleService;
import kodlamaio.HRMS.core.untilities.result.DataResult;
import kodlamaio.HRMS.core.untilities.result.Result;

import kodlamaio.HRMS.entities.dtos.JobTitleAddDto;
import kodlamaio.HRMS.entities.dtos.JobTitleDto;

@RestController
@RequestMapping("/api/jobtitle")
public class jobTitleController {

	private JobTitleService jobTitleService;

	@Autowired
	public jobTitleController(JobTitleService jobTitleService) {
		super();
		this.jobTitleService = jobTitleService;
	}

	@GetMapping("/getall")
	public DataResult<List<JobTitleDto>> getAll() {
		return this.jobTitleService.getAll();

	}

	@PostMapping("/add")
	public Result add(JobTitleAddDto jobTitle) {
		return this.jobTitleService.add(jobTitle);
	}

	@GetMapping("/getactive")
	public DataResult<List<JobTitleDto>> getbyIsActive(boolean isActive) {
		return this.jobTitleService.getByIsActive(isActive);
	}

	@GetMapping("/getbysorteddesc")
	public DataResult<List<JobTitleDto>> gedAllSorted() {
		return this.jobTitleService.getAllSorted();
	}

	@GetMapping("/getbysortedasc")
	public DataResult<List<JobTitleDto>> getAllSortedAsc() {
		return this.jobTitleService.getAllSortedAsc();
	}

	@GetMapping("/getbycityasc")
	public DataResult<List<JobTitleDto>> getAllByCityAsc() {
		return this.jobTitleService.getAllByCityAsc();
	}

	@GetMapping("/getbycitydesc")
	public DataResult<List<JobTitleDto>> getAllByCityDesc() {
		return this.jobTitleService.getAllByCityDesc();
	}

	@GetMapping("/getbycompanyasc")
	public DataResult<List<JobTitleDto>> getAllByCompanyAsc() {
		return this.jobTitleService.getAllByCompanyAsc();
	}

	@GetMapping("/getbycompanydesc")
	public DataResult<List<JobTitleDto>> getAllByCompanyDesc() {
		return this.jobTitleService.getAllByCompanyDesc();
	}

	@GetMapping("/getbypositionasc")
	public DataResult<List<JobTitleDto>> getAllByPositionAsc() {
		return this.jobTitleService.getAllByPositionAsc();
	}

	@GetMapping("/getbypositiondesc")
	public DataResult<List<JobTitleDto>> getAllByPositionDesc() {
		return this.jobTitleService.getAllByPositionDesc();
	}

}
