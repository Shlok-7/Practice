package com.shlok.demo.repository;

import java.util.Optional;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.shlok.demo.entity.Customer;

//@Repository specifically turns on database-exception translation, converting SQL errors into Spring errors.
@Repository // Extends JPA repo, giving us out-of-the-box methods like save(), findById(), findAll()
// <Customer, Integer> Specifies Customer as the entity and Integer as the data type of the primary key
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	Optional<Customer> findByEmail(String email);
	boolean existsByPhone(String phone);
    
   boolean existsByName(String name);

   boolean existsByEmail(String email);


   boolean existsByAddress(String address);    
  
   
   
//	Optional<Customer> findByEmail(String email);
//   List<Customer> findByKycStatus(Customer.KycStatus status);
}