package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.PositionService;
import kodlamaio.HRMS.core.configadapters.abstracts.ModelMapperService;
import kodlamaio.HRMS.core.untilities.result.DataResult;
import kodlamaio.HRMS.core.untilities.result.Result;
import kodlamaio.HRMS.core.untilities.result.SuccessDataResult;
import kodlamaio.HRMS.core.untilities.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.PositionDao;
import kodlamaio.HRMS.entities.concretes.Position;
import kodlamaio.HRMS.entities.dtos.PositionDto;

@Service
public class PositionManager implements PositionService {
	private PositionDao positionDao;
	private ModelMapperService modelMapperService;

	@Autowired
	public PositionManager(PositionDao positionDao, ModelMapperService modelMapperService) {
		super();
		this.positionDao = positionDao;
	}

	@Override
	public DataResult<List<PositionDto>> getAll() {
		return new SuccessDataResult<List<PositionDto>>(
				modelMapperService.entityToDto(positionDao.findAll(), PositionDto.class), "İş pozisyonları listelendi");
	}

	@Override
	public Result add(PositionDto jobPosition) {
		this.positionDao.save((Position) modelMapperService.dtoToEntity(jobPosition, Position.class));
		return new SuccessResult("pozisyon kayedildi");
	}

}
