package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.TechnologyService;
import kodlamaio.HRMS.core.configadapters.abstracts.ModelMapperService;
import kodlamaio.HRMS.core.untilities.result.DataResult;
import kodlamaio.HRMS.core.untilities.result.Result;
import kodlamaio.HRMS.core.untilities.result.SuccessDataResult;
import kodlamaio.HRMS.core.untilities.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.TechnologyDao;
import kodlamaio.HRMS.entities.concretes.Technology;
import kodlamaio.HRMS.entities.dtos.TechnologyDto;

@Service
public class TechnologyManager implements TechnologyService {

	private TechnologyDao technologyDao;
	private ModelMapperService modelMapperService;

	@Autowired
	public TechnologyManager(TechnologyDao technologyDao, ModelMapperService modelMapperService) {
		super();
		this.technologyDao = technologyDao;
		this.modelMapperService = modelMapperService;
	}

	@Override
	public DataResult<List<TechnologyDto>> getAll() {
		return new SuccessDataResult<List<TechnologyDto>>(
				modelMapperService.entityToDto(this.technologyDao.findAll(), TechnologyDto.class));
	}

	@Override
	public Result add(TechnologyDto technology) {
		this.technologyDao.save((Technology) modelMapperService.dtoToEntity(technology, Technology.class));
		return new SuccessResult();
	}

}
