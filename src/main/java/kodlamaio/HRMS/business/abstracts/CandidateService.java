package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.untilities.result.DataResult;
import kodlamaio.HRMS.core.untilities.result.Result;
import kodlamaio.HRMS.entities.concretes.Candidate;
import kodlamaio.HRMS.entities.dtos.CandidateAddDto;
import kodlamaio.HRMS.entities.dtos.CandidateDto;

public interface CandidateService {
	
	DataResult<List<CandidateDto>> getAll();

	Result add(CandidateAddDto candidate);

}
