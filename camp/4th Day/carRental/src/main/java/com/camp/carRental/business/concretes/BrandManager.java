package com.camp.carRental.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.camp.carRental.business.abstracts.BrandService;
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
	public List<Brand> getAll() {

		return brandRepository.getAll();
	}

}
