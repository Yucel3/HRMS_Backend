package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.untilities.result.DataResult;
import kodlamaio.HRMS.core.untilities.result.Result;
import kodlamaio.HRMS.entities.dtos.CityDto;

public interface CityService {
	
	DataResult<List<CityDto>> getAll();
	
	Result add(CityDto city);
}
