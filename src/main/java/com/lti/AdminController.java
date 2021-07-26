package com.lti;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Ngo;
import com.lti.entity.StepRegistration;
import com.lti.service.AdminService;

@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdminController {

	@Autowired
	private AdminService adminService;

	@ResponseBody
	@GetMapping(path ="/login/{adminLoginId}/{adminPassword}", produces = {"text/plain"})
	public String checkPassword(@PathVariable("adminLoginId") int adminLoginId, @PathVariable("adminPassword") String adminPassword) {
		String result = adminService.checkPassword(adminLoginId, adminPassword);
		return result;
	}
	
	@RequestMapping(path = "/fetchuser", method = RequestMethod.GET)
	public List<StepRegistration> fetchUser() {
		List<StepRegistration> userlist = adminService.fetchUser();
		return userlist;
	}
	
	@RequestMapping(path = "/deleteuser/{registrationId}", method = RequestMethod.GET)
	public String deleteUser(@PathVariable ("registrationId") int registrationId){
		 adminService.deleteUser(registrationId);
		return "done";
	}
	
	@RequestMapping(path = "/adduser/{registrationId}", method = RequestMethod.GET)
	public String addUser(@PathVariable ("registrationId") int registrationId){
		 adminService.addUser(registrationId);
		return "done";
	}
	
	@RequestMapping(path = "/fetchngo", method = RequestMethod.GET)
	public List<Ngo> fetchNgo() {
		List<Ngo> userlist = adminService.fetchNgo();
		return userlist;
	}
	
	@RequestMapping(path = "/deletengo/{ngoId}", method = RequestMethod.GET)
	public String deleteNgo(@PathVariable ("ngoId") int ngoId){
		 adminService.deleteNgo(ngoId);
		return "done";
	}
	
	@RequestMapping(path = "/addngo/{ngoId}", method = RequestMethod.GET)
	public String addNgo(@PathVariable ("ngoId") int ngoId){
		 adminService.addNgo(ngoId);
		return "done";
	}

}
