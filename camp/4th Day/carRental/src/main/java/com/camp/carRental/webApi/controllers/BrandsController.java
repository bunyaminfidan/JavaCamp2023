package com.camp.carRental.webApi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.camp.carRental.business.abstracts.BrandService;
import com.camp.carRental.business.requests.CreateBrandRequest;
import com.camp.carRental.business.requests.DeleteBrandRequest;
import com.camp.carRental.business.requests.UpdateBrandRequest;
import com.camp.carRental.business.responses.GetAllBrandsResponse;
import com.camp.carRental.business.responses.GetByIdBrandResponse;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsController {

	private BrandService brandService;

	@GetMapping()
	public List<GetAllBrandsResponse> getAll() {
		return brandService.getAll();
	}

	@GetMapping("{id}")
	public GetByIdBrandResponse getById(@PathVariable int id) {
		return brandService.getById(id);
	}

	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(CreateBrandRequest brandRequest) {

		this.brandService.add(brandRequest);

	}

	@PutMapping()
	public void update(UpdateBrandRequest brandRequest) {

		
		this.brandService.update(brandRequest);

	}

	@DeleteMapping()
	public void delete( DeleteBrandRequest brandRequest) {
		this.brandService.delete(brandRequest);

	}

}
