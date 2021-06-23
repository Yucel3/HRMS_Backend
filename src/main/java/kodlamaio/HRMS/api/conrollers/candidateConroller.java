package kodlamaio.HRMS.api.conrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.CandidateService;
import kodlamaio.HRMS.core.untilities.result.DataResult;
import kodlamaio.HRMS.core.untilities.result.Result;
import kodlamaio.HRMS.entities.dtos.CandidateAddDto;
import kodlamaio.HRMS.entities.dtos.CandidateDto;

@CrossOrigin
@RestController
@RequestMapping("/api/candidates")
public class candidateConroller {

	private CandidateService candidateService;

	@Autowired
	public candidateConroller(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
	}

	@GetMapping("/getall")
	public DataResult<List<CandidateDto>> getAll() {
		return this.candidateService.getAll();

	}

	@PostMapping("/add")
	public Result add(CandidateAddDto candidate) {
		return this.candidateService.add(candidate);
	}

}
