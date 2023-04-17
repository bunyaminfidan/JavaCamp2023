package com.camp.carRental.business.abstracts;

import java.util.List;

import com.camp.carRental.business.requests.CreateBrandRequest;
import com.camp.carRental.business.requests.DeleteBrandRequest;
import com.camp.carRental.business.requests.UpdateBrandRequest;
import com.camp.carRental.business.responses.GetAllBrandsResponse;
import com.camp.carRental.business.responses.GetByIdBrandResponse;
import com.camp.carRental.entities.concretes.Brand;

public interface BrandService {

	List<GetAllBrandsResponse> getAll();

	GetByIdBrandResponse getById(int id);

	void add(CreateBrandRequest brandRequest);

	void update(UpdateBrandRequest brandRequest);

	void delete(DeleteBrandRequest brandRequest);

}
