package kodlamaio.HRMS.core.configadapters.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.core.configadapters.abstracts.ModelMapperService;
@Service
public class ModelMapperManger implements ModelMapperService {
	public ModelMapper modelMapper;
	
	@Autowired
	public ModelMapperManger(ModelMapper modelMapper) {
		super();
		this.modelMapper = modelMapper;
	}

	@Override
	public <S, T> List<T> entityToDto(List<S> listTypeentityClass, Class<T> targetDtoClass) {
		return listTypeentityClass.stream().map(element -> modelMapper.map(element, targetDtoClass)).collect(Collectors.toList());
	}

	@Override
	public <T> Object dtoToEntity(Object dtoClass, Class<T> targetEntityClass) {
		return modelMapper.map(dtoClass,targetEntityClass);
	}

}
