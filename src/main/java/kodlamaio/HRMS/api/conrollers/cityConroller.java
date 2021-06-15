package kodlamaio.HRMS.api.conrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.CityService;
import kodlamaio.HRMS.core.untilities.result.DataResult;
import kodlamaio.HRMS.core.untilities.result.Result;
import kodlamaio.HRMS.entities.dtos.CityDto;

@RestController
@RequestMapping("api/cities")
public class cityConroller {
	
	private CityService cityService;
	@Autowired
	public cityConroller(CityService cityService) {
		super();
		this.cityService = cityService;
	}

	@GetMapping("/getall")
	public DataResult<List<CityDto>> getAll() {
		return this.cityService.getAll();
	}

	@PostMapping("/add")
	public Result add(CityDto city) {
		return this.cityService.add(city);
	}

}
