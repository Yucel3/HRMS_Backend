package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.untilities.result.DataResult;
import kodlamaio.HRMS.core.untilities.result.Result;
import kodlamaio.HRMS.entities.dtos.TechnologyDto;

public interface TechnologyService {

	DataResult<List<TechnologyDto>> getAll();

	Result add(TechnologyDto technology);

}
