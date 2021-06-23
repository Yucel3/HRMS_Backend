package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.tools.jdi.VoidValueImpl;

import kodlamaio.HRMS.adapter.MernisManager;
import kodlamaio.HRMS.adapter.MernisService;
import kodlamaio.HRMS.business.abstracts.CandidateService;
import kodlamaio.HRMS.core.configadapters.abstracts.ModelMapperService;
import kodlamaio.HRMS.core.untilities.result.DataResult;
import kodlamaio.HRMS.core.untilities.result.ErrorResult;
import kodlamaio.HRMS.core.untilities.result.Result;
import kodlamaio.HRMS.core.untilities.result.SuccessDataResult;
import kodlamaio.HRMS.core.untilities.result.SuccessResult;
import kodlamaio.HRMS.core.validator.Validator;
import kodlamaio.HRMS.core.validator.ValidatorService;
import kodlamaio.HRMS.dataAccess.abstracts.CandidateDao;
import kodlamaio.HRMS.entities.concretes.Candidate;
import kodlamaio.HRMS.entities.dtos.CandidateAddDto;
import kodlamaio.HRMS.entities.dtos.CandidateDto;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class CandidateManager implements CandidateService {
	private CandidateDao candidateDao;
	private MernisService mernisService;
	private ValidatorService validatorService;
	private ModelMapperService modelMapperService;

	@Autowired
	public CandidateManager(CandidateDao candidateDao, ModelMapperService modelMapperService,
			MernisService mernisService, ValidatorService validatorService) {
		super();
		this.candidateDao = candidateDao;
		this.mernisService = mernisService;
		this.validatorService = validatorService;
		this.modelMapperService = modelMapperService;
	}

	@Override
	public DataResult<List<CandidateDto>> getAll() {

		return new SuccessDataResult<List<CandidateDto>>(
				modelMapperService.entityToDto(candidateDao.findAll(), CandidateDto.class), "adaylar listelendi");
	}

	@Override
	public Result add(CandidateAddDto candidate) {
		this.candidateDao.save((Candidate) modelMapperService.dtoToEntity(candidate, Candidate.class));
		if(mernisService.ifRealCandidate(candidate) && validatorService.isRealUser(candidate.getPassword(), candidate.getPasswordRepead())) {
			
			return new SuccessResult("aday kaydedildi");
		}else {
			return new ErrorResult("Kimlik doğrulası veya şifre tekrarı yanlış");
		}
	}

}
