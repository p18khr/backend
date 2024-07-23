package com.credMarg.backend.dao;

import com.credMarg.backend.models.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<Email, Long> {

}
