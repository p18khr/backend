package com.credMarg.backend.dao;

import com.credMarg.backend.models.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor,Long> {
}
