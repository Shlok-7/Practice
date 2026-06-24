//You describe what operations are allowed
//Spring provides implementation automatically
package com.shlok.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shlok.demo.data.Books;

public interface IBookRepository extends JpaRepository<Books,Integer> {
	

}
