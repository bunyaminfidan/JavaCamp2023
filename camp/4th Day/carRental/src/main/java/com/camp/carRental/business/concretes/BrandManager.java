package com.camp.carRental.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.camp.carRental.business.abstracts.BrandService;
import com.camp.carRental.business.requests.CreateBrandRequest;
import com.camp.carRental.business.responses.GetAllBrandsResponse;
import com.camp.carRental.dataAccess.abstracts.BrandRepository;
import com.camp.carRental.entities.concretes.Brand;

@Service
public class BrandManager implements BrandService {

	private BrandRepository brandRepository;

	@Autowired
	public BrandManager(BrandRepository brandRepository) {
		super();
		this.brandRepository = brandRepository;
	}

	@Override
	public List<GetAllBrandsResponse> getAll() {

		List<Brand> brands = brandRepository.findAll();
		List<GetAllBrandsResponse> brandsResponse = new ArrayList<GetAllBrandsResponse>();

		for (Brand brand : brands) {
			GetAllBrandsResponse responseItem = new GetAllBrandsResponse();

			responseItem.setId(brand.getId());
			responseItem.setName(brand.getName());

			brandsResponse.add(responseItem);

		}

		return brandsResponse;
	}

	@Override
	public void add(CreateBrandRequest brandRequest) {

		Brand brand = new Brand();
		brand.setName(brandRequest.getName());
		this.brandRepository.save(brand);

	}

}
