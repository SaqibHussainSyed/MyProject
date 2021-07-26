package com.lti;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Ngo;
import com.lti.service.NgoService;


@RestController
@CrossOrigin
@RequestMapping("/ngo")
public class NgoController {
	@Autowired
	private NgoService ngoService;
	
	@PostMapping(path ="/add", consumes = "application/json")
	public String addNgo(@RequestBody Ngo ngo) {
		System.out.println(ngo);
		String result = ngoService.addNgo(ngo);
		return result;
	}
	@GetMapping("/status/{ngoId}")
	public String checkStatus(@RequestBody @PathVariable("ngoId") int ngoId) {
		String status = ngoService.checkStatus(ngoId);
		return status;
	}

}
