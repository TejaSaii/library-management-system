package com.springrest.lms_rest_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.lms_rest_api.entity.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, String> {

}
