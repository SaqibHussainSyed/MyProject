package com.lti;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Ngo;
import com.lti.entity.StepRegistration;
import com.lti.service.StepService;

@RestController
@RequestMapping("/step")
@CrossOrigin
public class StepController {

	@Autowired
	StepService stepService;
	
	
	
	@PostMapping(path = "/register",consumes="application/json")
	public String addstepuser(@RequestBody StepRegistration stepRegistration) {
		
		
		String result =stepService.addStepUser(stepRegistration);
		
	return result;

	
	}
	
		@GetMapping(path="/viewngo/{courseName}")
		public List<Ngo> viewNgo(@RequestBody @PathVariable("courseName") String courseName ){
			List<Ngo> result=stepService.viewNgo(courseName);
			
			return result;
		}


		@GetMapping(path="/status/{aadharNo}")
		public String checkStatus(@RequestBody @PathVariable("aadharNo")String aadharNo) {
			String status = stepService.checkStatus(aadharNo);
			return status;
		}
	

}
