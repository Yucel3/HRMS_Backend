package kodlamaio.HRMS.api.conrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.CompanyService;
import kodlamaio.HRMS.core.untilities.result.DataResult;
import kodlamaio.HRMS.core.untilities.result.Result;
import kodlamaio.HRMS.entities.concretes.Company;

@RestController
@RequestMapping("/api/company")
public class companyController {
	private CompanyService companyService;
	
	@Autowired
	public companyController(CompanyService companyService) {
		super();
		this.companyService= companyService;
	}

	@GetMapping("/getall")
	public DataResult<List<Company>> getAll(){
		return this.companyService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody Company company) {
		return this.companyService.add(company);

	}

}
