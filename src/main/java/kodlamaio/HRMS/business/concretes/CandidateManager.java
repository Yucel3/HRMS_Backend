package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.adapter.MernisManager;
import kodlamaio.HRMS.business.abstracts.CandidateService;
import kodlamaio.HRMS.core.untilities.result.DataResult;
import kodlamaio.HRMS.core.untilities.result.ErrorResult;
import kodlamaio.HRMS.core.untilities.result.Result;
import kodlamaio.HRMS.core.untilities.result.SuccessDataResult;
import kodlamaio.HRMS.core.untilities.result.SuccessResult;
import kodlamaio.HRMS.core.validator.Validator;
import kodlamaio.HRMS.dataAccess.abstracts.CandidateDao;
import kodlamaio.HRMS.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService {
	private CandidateDao candidateDao;
	private MernisManager mernisManager;
	private Validator validator;
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		this.candidateDao.findAll();
		return new SuccessDataResult<List<Candidate>>( "adaylar listelendi");
	}

	@Override
	public Result add(Candidate candidate) {
		this.candidateDao.save(candidate);
		if (mernisManager.ifRealCandidate(candidate)
				&& validator.isRealUser(candidate.getPassword(), candidate.getPasswordRepeat())) {
			return new SuccessResult("aday kaydedildi");
		} else {
			return new ErrorResult("hata");
		}
	}

}
