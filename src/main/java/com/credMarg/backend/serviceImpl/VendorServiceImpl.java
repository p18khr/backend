package com.credMarg.backend.serviceImpl;

import com.credMarg.backend.dao.VendorRepository;
import com.credMarg.backend.models.Vendor;
import com.credMarg.backend.service.VendorService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class VendorServiceImpl implements VendorService {

	@Autowired
	private VendorRepository repo;

	@Override
	public List<Vendor> getAllVendors() {
		return repo.findAll();
	}

	@Override
	public Vendor saveVendor(Vendor vendor) {
		repo.save(vendor);
		return vendor;
	}
}
