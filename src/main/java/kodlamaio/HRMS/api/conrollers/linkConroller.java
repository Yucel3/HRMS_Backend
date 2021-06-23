package kodlamaio.HRMS.api.conrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.LinkService;
import kodlamaio.HRMS.core.untilities.result.DataResult;
import kodlamaio.HRMS.core.untilities.result.Result;
import kodlamaio.HRMS.entities.concretes.Link;
import kodlamaio.HRMS.entities.dtos.LinkDto;

@RestController
@RequestMapping("api/links")
public class linkConroller {
	
	private LinkService linkService;
	
	@Autowired
	public linkConroller(LinkService linkService) {
		super();
		this.linkService = linkService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<LinkDto>> getAll(){
		return this.linkService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(LinkDto link) {
		return this.linkService.add(link);
	}

}
