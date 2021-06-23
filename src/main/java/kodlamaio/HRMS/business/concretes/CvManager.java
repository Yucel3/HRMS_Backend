package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.CvService;
import kodlamaio.HRMS.core.configadapters.abstracts.ModelMapperService;
import kodlamaio.HRMS.core.untilities.result.DataResult;
import kodlamaio.HRMS.core.untilities.result.Result;
import kodlamaio.HRMS.core.untilities.result.SuccessDataResult;
import kodlamaio.HRMS.core.untilities.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.CvDao;
import kodlamaio.HRMS.entities.concretes.Cv;
import kodlamaio.HRMS.entities.dtos.CvDto;

@Service
public class CvManager implements CvService {

	private CvDao cvDao;
	private ModelMapperService modelMapperService;

	@Autowired
	public CvManager(CvDao cvDao, ModelMapperService modelMapperService) {
		super();
		this.cvDao = cvDao;
		this.modelMapperService = modelMapperService;
	}

	@Override
	public DataResult<List<Cv>> getAll() {
		this.cvDao.findAll();
		return new SuccessDataResult<List<Cv>>("cvler listelendi");
	}

	@Override
	public Result add(Cv cv) {
		this.cvDao.save(cv);
		return new SuccessResult();
	}

	

}
