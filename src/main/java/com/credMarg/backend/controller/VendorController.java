package com.credMarg.backend.controller;

import com.credMarg.backend.models.Vendor;
import com.credMarg.backend.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendor")
@CrossOrigin("http://localhost:3000/")
public class VendorController {

	@Autowired
	private VendorService service;


	@GetMapping
	public List<Vendor> getAllVendors() {
		return service.getAllVendors();
	}

	@PostMapping
	public Vendor createVendor(@RequestBody Vendor vendor) {
		return service.saveVendor(vendor);
	}
}
