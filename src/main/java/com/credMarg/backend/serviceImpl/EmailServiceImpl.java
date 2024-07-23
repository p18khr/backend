package com.credMarg.backend.serviceImpl;

import com.credMarg.backend.dao.EmailRepository;
import com.credMarg.backend.models.Email;
import com.credMarg.backend.service.EmailService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional
public class EmailServiceImpl implements EmailService {

	@Autowired
	private EmailRepository repo;

	@Override
	public List<Email> getAllEmails() {
		return repo.findAll();
	}

	@Override
	public Email saveEmail(Email email) {
		email.setEmailContent("Sending payments to vendor: " +email.getName()+" at upi: "+email.getUpi());repo.save(email);
		email.setSentAt(LocalDateTime.now());
		return email;
	}
}
