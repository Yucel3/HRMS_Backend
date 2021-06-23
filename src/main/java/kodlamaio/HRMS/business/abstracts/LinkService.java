package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.untilities.result.DataResult;
import kodlamaio.HRMS.core.untilities.result.Result;
import kodlamaio.HRMS.entities.dtos.LinkDto;

public interface LinkService {
	
	DataResult<List<LinkDto>> getAll();
	Result add(LinkDto link);

}
