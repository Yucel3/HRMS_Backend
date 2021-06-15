package kodlamaio.HRMS.core.configadapters.abstracts;

import java.util.List;

public interface ModelMapperService {
	<S,T>  List<T> entityToDto(List<S> listTypeentityClass, Class<T> targetDtoClass);
	<T> Object dtoToEntity(Object dtoClass, Class<T> targetEntityClass);
}
