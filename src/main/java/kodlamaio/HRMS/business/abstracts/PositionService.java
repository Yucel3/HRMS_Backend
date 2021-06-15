package kodlamaio.HRMS.business.abstracts;

import java.util.List;


import kodlamaio.HRMS.core.untilities.result.DataResult;
import kodlamaio.HRMS.core.untilities.result.Result;
import kodlamaio.HRMS.entities.concretes.Position;
import kodlamaio.HRMS.entities.dtos.PositionDto;

public interface PositionService {
	DataResult<List<PositionDto>> getAll();
	Result add(PositionDto jobPosition);

}
