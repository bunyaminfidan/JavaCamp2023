package com.camp.carRental.business.concretes;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.camp.carRental.business.abstracts.BrandService;
import com.camp.carRental.business.requests.CreateBrandRequest;
import com.camp.carRental.business.requests.DeleteBrandRequest;
import com.camp.carRental.business.requests.UpdateBrandRequest;
import com.camp.carRental.business.responses.GetAllBrandsResponse;
import com.camp.carRental.business.responses.GetByIdBrandResponse;
import com.camp.carRental.common.utilities.mapper.ModelMapperService;
import com.camp.carRental.dataAccess.abstracts.BrandRepository;
import com.camp.carRental.entities.concretes.Brand;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {

	private BrandRepository brandRepository;
	private ModelMapperService mapperService;

	@Override
	public List<GetAllBrandsResponse> getAll() {

		List<Brand> brands = brandRepository.findAll();

		List<GetAllBrandsResponse> brandsResponse = brands.stream()
				.map(brand -> this.mapperService.forResponse().map(brand, GetAllBrandsResponse.class))
				.collect(Collectors.toList());

		return brandsResponse;
	}

	@Override
	public void add(CreateBrandRequest brandRequest) {

		Brand brand = this.mapperService.forRequest().map(brandRequest, Brand.class);
		this.brandRepository.save(brand);

	}

	@Override
	public GetByIdBrandResponse getById(int id) {
		Optional<Brand> brand = this.brandRepository.findById(id);

		GetByIdBrandResponse brandResponse = null;
		if (brand.isPresent()) {
			brandResponse = this.mapperService.forResponse().map(brand, GetByIdBrandResponse.class);

		}

		return brandResponse;
	}

	@Override
	public void update(UpdateBrandRequest brandRequest) {
			Optional<Brand> request = this.brandRepository.findById(brandRequest.getId());

		if (request.isPresent()) {	
		
			Brand brand = this.mapperService.forRequest().map(brandRequest, Brand.class);

			brandRepository.save(brand);

		}
		
	}

	@Override
	public void delete(DeleteBrandRequest brandRequest) {

			Optional<Brand> request = this.brandRepository.findById(brandRequest.getId());

		if (request.isPresent()) {

			brandRepository.delete(request.get());

		}

	}

}
