package com.sj.springbootforbeginners.repository;

import com.sj.springbootforbeginners.model.ecommerce.vendor.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

// @Repository is a Spring annotation that
// indicates that the decorated class is a repository.
@Repository
public interface VendorRepository extends JpaRepository<Vendor, Long>{
    @Query(value ="SELECT * FROM firstDatabase.vendor v WHERE vendor_id = ?1" ,nativeQuery = true)
    Vendor findAllByVendorId (int vendorId);
}
