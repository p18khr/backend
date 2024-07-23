package com.credMarg.backend.service;

import com.credMarg.backend.models.Email;

import java.util.List;

public interface EmailService {
	List<Email> getAllEmails();

	Email saveEmail(Email email);
}
