package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.PreviousJobService;
import kodlamaio.HRMS.core.untilities.result.DataResult;
import kodlamaio.HRMS.core.untilities.result.Result;
import kodlamaio.HRMS.core.untilities.result.SuccessDataResult;
import kodlamaio.HRMS.core.untilities.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.PreviousJobDao;
import kodlamaio.HRMS.entities.concretes.PreviousJob;

@Service
public class PreviousJobManager implements PreviousJobService{
	private PreviousJobDao previousJobDao;
	
	
	@Autowired
	public PreviousJobManager(PreviousJobDao previousJobDao) {
		super();
		this.previousJobDao = previousJobDao;
	}

	@Override
	public DataResult<List<PreviousJob>> getAll() {
		this.previousJobDao.findAll();
		return new SuccessDataResult<List<PreviousJob>>("Eski işler be:)");
	}

	@Override
	public Result add(PreviousJob previousJob) {
		this.previousJobDao.save(previousJob);
		return new SuccessResult("eski iş kaydedildi");
	}

}
