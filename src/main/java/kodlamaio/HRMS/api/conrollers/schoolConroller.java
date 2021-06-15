package kodlamaio.HRMS.api.conrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.SchoolService;
import kodlamaio.HRMS.core.untilities.result.DataResult;
import kodlamaio.HRMS.core.untilities.result.Result;
import kodlamaio.HRMS.entities.concretes.School;
@RestController
@RequestMapping("api/school")
public class schoolConroller {
	private SchoolService schoolService;
	
	@Autowired
	public schoolConroller(SchoolService schoolService) {
		super();
		this.schoolService = schoolService;
	}

	@GetMapping("/getall")
	public DataResult<List<School>> getAll(){
		return this.schoolService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody School school) {
		return this.schoolService.add(school);
		
	}

}
