package kodlamaio.HRMS.api.conrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.HRMS.business.abstracts.EmployeService;
import kodlamaio.HRMS.core.untilities.result.DataResult;
import kodlamaio.HRMS.core.untilities.result.Result;
import kodlamaio.HRMS.entities.concretes.Employe;

@RestController
@RequestMapping("api/employes")
public class employeController {
	private EmployeService employeService;
	@Autowired
	public employeController(EmployeService employeService) {
		super();
		this.employeService= employeService;
	}

	@GetMapping("/getall")
	public DataResult<List<Employe>> getAll(){
		return this.employeService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody Employe employe) {
		return this.employeService.add(employe);

	}

}
