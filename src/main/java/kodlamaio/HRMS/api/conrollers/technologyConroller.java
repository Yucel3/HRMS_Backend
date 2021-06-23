package kodlamaio.HRMS.api.conrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.TechnologyService;
import kodlamaio.HRMS.core.untilities.result.DataResult;
import kodlamaio.HRMS.core.untilities.result.Result;
import kodlamaio.HRMS.entities.dtos.TechnologyDto;

@RestController
@RequestMapping("api/technologies")
public class technologyConroller {
	
	private TechnologyService technologyService;
	
	@Autowired
	public technologyConroller(TechnologyService technologyService) {
		super();
		this.technologyService = technologyService;
	}
	
	@PostMapping("/add")
	public Result add(TechnologyDto technology) {
		return this.technologyService.add(technology);
	}
	
	@GetMapping("/getall")
	public DataResult<List<TechnologyDto>> getAll(){
		return this.technologyService.getAll();
	}
	

}
