package com.camp.carRental.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.camp.carRental.business.abstracts.BrandService;
import com.camp.carRental.business.requests.CreateBrandRequest;
import com.camp.carRental.business.responses.GetAllBrandsResponse;
import com.camp.carRental.entities.concretes.Brand;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {

	private BrandService brandService;

	@Autowired
	public BrandsController(BrandService brandService) {
		super();
		this.brandService = brandService;
	}

	@GetMapping("/getall")
	public List<GetAllBrandsResponse> getAll() {
		return brandService.getAll();
	}

	@PostMapping("/add")
	public void add(CreateBrandRequest brandRequest) {

		this.brandService.add(brandRequest);

	}

}
