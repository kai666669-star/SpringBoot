package com.example.demo.model;


import java.util.List;
import java.util.Optional;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	List<Customer> findByName(String name);
	
	List<Customer> findByLevel(Integer level);
	
	List<Customer> findByNameAndLevel(String name, Integer level);
	
	List <Customer> findByNameContaining(String name);
	
	List <Customer> findByNameContainingOrderByIdDesc(String name);
	
	@Query("from Customer where name = ?1")
	List<Customer> findCustomerByName(String name);
	
	@Query("from Customer where name = :nnn")
	List<Customer> findCustomerByName2(@Param("nnn") String name);
	
	@Query("from Customer where name like %:nnn%")
	Page<Customer> findCustomerByNameLike2(@Param("nnn") String name, Pageable pgb);
	
	@Query("from Customer where name like %:nnn%")
	List<Customer> findCustomerByNameLike(@Param("nnn") String name);
	
	
	@Query(value=" select top(1) * from customer where name like %:n% order by id", nativeQuery = true)
	Optional<Customer> findCustomerByNameLikeTOP1(@Param("n") String name);
	
	@Transactional
	@Modifying
	@Query("update Customer  set level = :aftLevel where level = :befLevel ")
	Integer updateLevel(@Param("befLevel") Integer beforeLevel, @Param("aftLevel") Integer afterLevel);
	
}
