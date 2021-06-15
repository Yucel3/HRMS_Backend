package kodlamaio.HRMS.api.conrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import kodlamaio.HRMS.business.abstracts.PositionService;
import kodlamaio.HRMS.core.untilities.result.DataResult;
import kodlamaio.HRMS.core.untilities.result.Result;
import kodlamaio.HRMS.entities.concretes.Position;
import kodlamaio.HRMS.entities.dtos.PositionDto;

@RestController
@RequestMapping("/api/jobposition")
public class jobPositionController {
	private PositionService positionService;
	@Autowired
	public jobPositionController(PositionService positionService) {
		super();
		this.positionService = positionService;
	}
	@GetMapping("/getall")
	public DataResult<List<PositionDto>> getAll(){
		return this.positionService.getAll();
		
	}
	@PostMapping("/add")
	public Result add(@RequestBody PositionDto jobPosition) {
		return this.positionService.add(jobPosition);
	}
}
