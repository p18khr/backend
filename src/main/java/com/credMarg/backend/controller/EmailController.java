package com.credMarg.backend.controller;

import com.credMarg.backend.models.Email;
import com.credMarg.backend.models.Employee;
import com.credMarg.backend.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/email")
@CrossOrigin("http://localhost:3000/")
public class EmailController {

	@Autowired
	private EmailService service;

	@GetMapping
	public List<Email> getAllEmailLogs() {
		return service.getAllEmails();
	}

	@PostMapping
	public Email createEmail(@RequestBody Email email) {
		return service.saveEmail(email);
	}
}
