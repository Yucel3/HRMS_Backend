package kodlamaio.HRMS.api.conrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.ImageService;
import kodlamaio.HRMS.core.untilities.result.DataResult;
import kodlamaio.HRMS.core.untilities.result.Result;
import kodlamaio.HRMS.entities.dtos.ImageDto;

@RestController
@RequestMapping("api/images")
public class imageController {
	
	private ImageService imageService;
	@Autowired
	public imageController(ImageService imageService) {
		super();
		this.imageService = imageService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<ImageDto>> getall(){
		return this.imageService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(ImageDto image) {
		return this.imageService.add(image);
	}

}
