package com.camp.carRental.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import com.camp.carRental.entities.concretes.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer> {

}
