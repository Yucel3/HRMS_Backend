package kodlamaio.HRMS.api.conrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.CvService;
import kodlamaio.HRMS.core.untilities.result.DataResult;
import kodlamaio.HRMS.core.untilities.result.Result;
import kodlamaio.HRMS.entities.concretes.Cv;
import kodlamaio.HRMS.entities.dtos.CvDto;
@RestController
@RequestMapping("api/cvs")
public class cvController {

	private CvService cvService;

	@Autowired
	public cvController(CvService cvService) {
		super();
		this.cvService = cvService;
	}

	@GetMapping("/getall")
	public DataResult<List<Cv>> getAll() {
		return this.cvService.getAll();
	}

	@PostMapping("/add")
	private Result add(@RequestBody Cv cv) {
		return this.cvService.add(cv);
	}

}
