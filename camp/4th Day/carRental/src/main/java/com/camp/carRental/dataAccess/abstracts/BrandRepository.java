package com.camp.carRental.dataAccess.abstracts;

import java.util.List;

import com.camp.carRental.entities.concretes.Brand;


public interface BrandRepository {

	List<Brand> getAll();

}
