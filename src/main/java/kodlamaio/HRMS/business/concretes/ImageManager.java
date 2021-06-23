package kodlamaio.HRMS.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.ImageService;
import kodlamaio.HRMS.core.configadapters.abstracts.ModelMapperService;
import kodlamaio.HRMS.core.untilities.result.DataResult;
import kodlamaio.HRMS.core.untilities.result.Result;
import kodlamaio.HRMS.core.untilities.result.SuccessDataResult;
import kodlamaio.HRMS.core.untilities.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.ImageDao;
import kodlamaio.HRMS.entities.concretes.Image;
import kodlamaio.HRMS.entities.dtos.ImageDto;

@Service
public class ImageManager implements ImageService {

	private ImageDao imageDao;
	private ModelMapperService modelMapperService;

	@Autowired
	public ImageManager(ImageDao imageDao, ModelMapperService modelMapperService) {
		super();
		this.imageDao = imageDao;
		this.modelMapperService = modelMapperService;
	}

	@Override
	public DataResult<List<ImageDto>> getAll() {
		return new SuccessDataResult<List<ImageDto>>(
				modelMapperService.entityToDto(imageDao.findAll(), ImageDto.class));
	}

	@Override
	public Result add(ImageDto image) {
		this.imageDao.save((Image) modelMapperService.dtoToEntity(image, Image.class));
		return new SuccessResult();
	}

}
