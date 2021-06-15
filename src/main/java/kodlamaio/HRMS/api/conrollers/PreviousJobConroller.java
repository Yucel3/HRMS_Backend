package kodlamaio.HRMS.api.conrollers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.PreviousJobService;
import kodlamaio.HRMS.core.untilities.result.DataResult;
import kodlamaio.HRMS.core.untilities.result.Result;
import kodlamaio.HRMS.entities.concretes.PreviousJob;

@RestController
@RequestMapping("api/previousjob")
public class PreviousJobConroller {
	
	private PreviousJobService previousJobService;
	
	@Autowired
	public PreviousJobConroller(PreviousJobService previousJobService) {
		super();
		this.previousJobService = previousJobService;
	}
	@GetMapping("/getall")
	public DataResult<List<PreviousJob>> getAll(){
	return this.previousJobService.getAll();
	}
	
	@PostMapping("/add")
	
	public Result add(@RequestBody PreviousJob previousJob) {
		return this.add(previousJob);
	}
}
