package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.LinkService;
import kodlamaio.HRMS.core.configadapters.abstracts.ModelMapperService;
import kodlamaio.HRMS.core.untilities.result.DataResult;
import kodlamaio.HRMS.core.untilities.result.Result;
import kodlamaio.HRMS.core.untilities.result.SuccessDataResult;
import kodlamaio.HRMS.core.untilities.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.LinkDao;
import kodlamaio.HRMS.entities.concretes.Link;
import kodlamaio.HRMS.entities.dtos.LinkDto;
@Service
public class LinkManager implements LinkService {
	
	private LinkDao linkDao;
	private ModelMapperService modelMapperService;
	

	
	@Autowired
	public LinkManager(LinkDao linkDao, ModelMapperService modelMapperService) {
		super();
		this.linkDao = linkDao;
		this.modelMapperService = modelMapperService;
	}

	@Override
	public DataResult<List<LinkDto>> getAll() {
		
		return new SuccessDataResult<List<LinkDto>>(modelMapperService.entityToDto(linkDao.findAll(), LinkDto.class));
	}

	@Override
	public Result add(LinkDto link) {
		this.linkDao.save((Link)modelMapperService.dtoToEntity(link, Link.class));
		return new SuccessResult();
	}

}
