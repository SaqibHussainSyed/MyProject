package com.lti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.UserRegistration;
import com.lti.service.MailService;
import com.lti.service.MailServiceImpl;
import com.lti.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private MailService mailService;

	@PostMapping(consumes = { "application/json" }, produces = { "text/plain" }, path = "/adduser")
	public String addUser(@RequestBody UserRegistration user) {
		String result = userService.addUser(user);
		return result;
	}

	@GetMapping(path = "/login/{email}/{password}", produces = { "text/plain" })
	public String checkPassword(@PathVariable("email") String email, @PathVariable("password") String password) {
		String result = userService.checkPassword(email, password);
		return result;
	}

	@RequestMapping(path = "/forgetpassword/{emailid}/", produces = "text/plain")
	public String forgetPassword(@PathVariable("emailid") String emailid) {

		String result = mailService.sendEmail(emailid);

		return result;
	}

}
