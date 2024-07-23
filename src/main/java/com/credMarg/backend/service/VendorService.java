package com.credMarg.backend.service;

import com.credMarg.backend.models.Vendor;

import java.util.List;

public interface VendorService {
	List<Vendor> getAllVendors();

	Vendor saveVendor(Vendor vendor);
}
