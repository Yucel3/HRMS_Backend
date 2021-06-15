package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.untilities.result.DataResult;
import kodlamaio.HRMS.core.untilities.result.Result;
import kodlamaio.HRMS.entities.concretes.PreviousJob;

public interface PreviousJobService {

	DataResult<List<PreviousJob>> getAll();

	Result add(PreviousJob previousJob);
}
