package com.example.demo.action;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;


import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;


import com.example.demo.model.Customer;
import com.example.demo.model.CustomerRepository;


import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
//@Component
public class Ex5TestJpaRepositoryCustomer implements CommandLineRunner {


	private final CustomerRepository customerRepository;


	@Override
	public void run(String... args) throws Exception {


//		List<Customer> resultList = customerRepository.findByName("阿文3");
		
//		List<Customer> resultList = customerRepository.findByNameAndLevel("阿文3", 4);
		
		List<Customer> resultList = customerRepository.findByNameContaining("文");
		
//		List<Customer> resultList = customerRepository.findByNameContainingOrderByIdDesc("文");


		if (resultList.isEmpty()) {
			System.out.println("沒有這個條件的資料");
		} else {
			for (Customer oneCus : resultList) {
				System.out.println(oneCus);
			}
		}


		// query 分頁
//		Pageable pgb = PageRequest.of(0, 3, Sort.Direction.DESC, "id");
//		Page<Customer> page = customerRepository.findCustomerByNameLike2("文", pgb);
//
//		List<Customer> resultList = page.getContent();
//
//		if (resultList.isEmpty()) {
//			System.out.println("沒有這個條件的資料");
//		} else {
//			for (Customer oneCus : resultList) {
//				System.out.println(oneCus);
//			}
//		}


		// update query
//		Integer count = customerRepository.updateLevel(3, 5);
//		System.out.println("幾筆資料被修改: " + count );


		// Query
//		List<Customer> result = customerRepository.findCustomerByName("mary");
//		List<Customer> result = customerRepository.findCustomerByName2("mary");
//		List<Customer> result = customerRepository.findCustomerByNameLike("a");
//				
//		if(result.isEmpty()) {
//			System.out.println("沒有這個條件的資料");
//		}else {
//			for(Customer oneCus  :result) {
//				System.out.println(oneCus);
//			}
//		}


		// 原生 SQL
//		Optional<Customer> result = customerRepository.findCustomerByNameLikeTOP1("a");
//		if(result.isEmpty()) {
//			System.out.println("沒有這個條件的資料");
//		}else {
//			System.out.println(result.get());
//		}


		// insert
//		Customer cus1 = new Customer();
//		cus1.setName("Tina");
//		cus1.setLevel(4);
//		
//		Customer resCustomer = customerRepository.save(cus1);
//		
//		System.out.println(resCustomer);
//		


		// 一次新增多筆
//		Customer c1 = new Customer();
//		c1.setName("阿文3");
//		c1.setLevel(4);
//		
//		Customer c2 = new Customer();
//		c2.setName("大蛇玩3");
//		c2.setLevel(2);
//		
//		Customer c3 = new Customer();
//		c3.setName("洋蔥3");
//		c3.setLevel(3);
//		
//		List<Customer> dataList = Arrays.asList(c1, c2,c3);		
//		
//		customerRepository.saveAll(dataList);


		// test findById
//		Optional<Customer> op = customerRepository.findById(999L);
//		
//		if(op.isPresent()) {
//			Customer result = op.get();
//			System.out.println(result);
//		}else {
//			System.out.println("沒有這筆資料");
//		}


		// 找一筆以上
//		List<Long> dataIds = Arrays.asList(3L,5L);
//		
//		List<Customer> result = customerRepository.findAllById(Arrays.asList(3L,5L));


//		
//		for(Customer oneCustomer  : result) {
//			System.out.println(oneCustomer);
//		}


		// 一次刪除多筆
//		customerRepository.deleteAllById(Arrays.asList(3L,5L));
//		
//		
//		List<Customer> findAll = customerRepository.findAll();


		// 分頁
//		Pageable pgb = PageRequest.of(1, 2, Sort.Direction.ASC, "id");
//		
//		Page<Customer> page = customerRepository.findAll(pgb);
//		
//		List<Customer> resultList = page.getContent();
//		
//		for(Customer oneCustomer :resultList) {
//			System.out.println(oneCustomer);
//		}
//		
//		int totalPages = page.getTotalPages();
//		System.out.println("總共幾頁: " + totalPages);
//		
//		int nowPage = page.getNumber();
//		System.out.println("現在在第幾頁:");
//		System.out.println(nowPage+1);
//		
//		Long count = page.getTotalElements();
//		System.out.println("總共幾筆: " + count);


	}


}
