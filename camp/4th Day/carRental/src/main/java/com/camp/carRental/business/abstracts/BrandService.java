package com.camp.carRental.business.abstracts;

import java.util.List;

import com.camp.carRental.business.requests.CreateBrandRequest;
import com.camp.carRental.business.responses.GetAllBrandsResponse;
import com.camp.carRental.entities.concretes.Brand;

public interface BrandService {
	
	List<GetAllBrandsResponse> getAll();
	void add(CreateBrandRequest brandRequest);
	
	
	

}
