package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.JobTitleService;
import kodlamaio.HRMS.core.configadapters.abstracts.ModelMapperService;
import kodlamaio.HRMS.core.untilities.result.DataResult;
import kodlamaio.HRMS.core.untilities.result.Result;
import kodlamaio.HRMS.core.untilities.result.SuccessDataResult;
import kodlamaio.HRMS.core.untilities.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.JobTitleDao;
import kodlamaio.HRMS.entities.concretes.JobTitle;
import kodlamaio.HRMS.entities.dtos.JobTitleAddDto;
import kodlamaio.HRMS.entities.dtos.JobTitleDto;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class JobTitleManager implements JobTitleService {
	private JobTitleDao jobTitleDao;
	private ModelMapperService modelMapperService;

	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao, ModelMapperService modelMapperService) {
		super();
		this.jobTitleDao = jobTitleDao;
		this.modelMapperService = modelMapperService;
	}

	@Override
	public DataResult<List<JobTitleDto>> getAll() {
		return new SuccessDataResult<List<JobTitleDto>>(
				modelMapperService.entityToDto(jobTitleDao.findAll(), JobTitleDto.class), "ilanlar listelendi");
	}

	@Override
	public Result add(JobTitleAddDto jobTitle) {
		this.jobTitleDao.save((JobTitle) modelMapperService.dtoToEntity(jobTitle, JobTitle.class));
		return new SuccessResult("ilan kaydedildi");
	}

	@Override
	public DataResult<List<JobTitleDto>> getByIsActive(boolean isActive) {
		return new SuccessDataResult<List<JobTitleDto>>(
				modelMapperService.entityToDto(jobTitleDao.getByIsActive(true), JobTitleDto.class));
	}

	@Override
	public DataResult<List<JobTitleDto>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC, "applicationDate");
		return new SuccessDataResult<List<JobTitleDto>>(
				modelMapperService.entityToDto(jobTitleDao.findAll(sort), JobTitleDto.class));
	}

	@Override
	public DataResult<List<JobTitleDto>> getAllSortedAsc() {
		Sort sort = Sort.by(Sort.Direction.ASC, "applicationDate");
		return new SuccessDataResult<List<JobTitleDto>>(
				modelMapperService.entityToDto(jobTitleDao.findAll(sort), JobTitleDto.class));
	}

	@Override
	public DataResult<List<JobTitleDto>> getAllByCityAsc() {
		Sort sort = Sort.by(Sort.Direction.ASC, "cityId");
		return new SuccessDataResult<List<JobTitleDto>>(
				modelMapperService.entityToDto(jobTitleDao.findAll(sort), JobTitleDto.class));
	}

	@Override
	public DataResult<List<JobTitleDto>> getAllByCityDesc() {
		Sort sort = Sort.by(Sort.Direction.DESC, "cityId");
		return new SuccessDataResult<List<JobTitleDto>>(
				modelMapperService.entityToDto(jobTitleDao.findAll(sort), JobTitleDto.class));
	}

	@Override
	public DataResult<List<JobTitleDto>> getAllByCompanyAsc() {
		Sort sort = Sort.by(Sort.Direction.ASC, "companyId");
		return new SuccessDataResult<List<JobTitleDto>>(
				modelMapperService.entityToDto(jobTitleDao.findAll(sort), JobTitleDto.class));
	}

	@Override
	public DataResult<List<JobTitleDto>> getAllByCompanyDesc() {
		Sort sort = Sort.by(Sort.Direction.DESC, "companyId");
		return new SuccessDataResult<List<JobTitleDto>>(
				modelMapperService.entityToDto(jobTitleDao.findAll(sort), JobTitleDto.class));
	}

	@Override
	public DataResult<List<JobTitleDto>> getAllByPositionAsc() {
		Sort sort = Sort.by(Sort.Direction.ASC, "positionId");
		return new SuccessDataResult<List<JobTitleDto>>(
				modelMapperService.entityToDto(jobTitleDao.findAll(sort), JobTitleDto.class));

	}

	@Override
	public DataResult<List<JobTitleDto>> getAllByPositionDesc() {
		Sort sort = Sort.by(Sort.Direction.DESC, "positionId");
		return new SuccessDataResult<List<JobTitleDto>>(
				modelMapperService.entityToDto(jobTitleDao.findAll(sort), JobTitleDto.class));

	}

}
