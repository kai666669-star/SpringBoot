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

@Component
@RequiredArgsConstructor
public class Ex5TestJoaRepositoryCustomer implements CommandLineRunner {

	private final CustomerRepository customerRepository;

// 有@RequiredArgsConstructor即不用再寫下列建構子
//	public Ex5TestJoaRepositoryCustomer(CustomerRepository customerRepository) {
//		this.customerRepository = customerRepository;
//	}

	@Override
	public void run(String... args) throws Exception {
//		Customer cus1 = new Customer();
//		cus1.setName("Tina");
//		cus1.setLevel(4);
//		
////		customerRepository.save(cus1);
//		
//		Customer resCustomer = customerRepository.save(cus1);
//		
//		System.out.println(resCustomer);

//		Customer c1 = new Customer();
//		c1.setName("阿文");
//		c1.setLevel(4);
//		Customer c2 = new Customer();
//		c2.setName("大蛇丸");
//		c2.setLevel(5);
//		Customer c3 = new Customer();
//		c3.setName("洋蔥");
//		c3.setLevel(2);
//		
//		List<Customer> datalist = Arrays.asList(c1, c2, c3);
//		customerRepository.saveAll(datalist);
//	}
		// test findById - isPresent() 判斷是否友直
//		Optional<Customer> op = customerRepository.findById(999L);
////		if(op.isPresent()) {
////			Customer result = op.get();
////			System.out.println(result);
////			}else {
////				System.out.println("沒有這筆資料");
////			}
//
//		if (op.isEmpty()) {
//			System.out.println("沒有這筆資料");
//
//		} else {
//			Customer result = op.get();
//			System.out.println(result);
//
//		}

		// 找一筆以上 並刪除 
//		List<Long> dataIds = Arrays.asList(3L, 4L, 5L, 6L, 7L);
//		
//		// 先寫右邊
//		List<Customer> result = customerRepository.findAllById(dataIds);
//		
//		for(Customer oneCustomer : result) {
//			System.out.println(oneCustomer);
//		}
//		
		//一次刪除多筆
//		customerRepository.deleteAllById(Arrays.asList(3L, 4L, 5L, 6L, 7L));
		
		//分頁
		Pageable pgb = PageRequest.of(1, 2, Sort.Direction.ASC, "id");
		
		Page<Customer> page = customerRepository.findAll(pgb);
		
		List<Customer> resultList = page.getContent();
		
		for(Customer oneCustomer :resultList) {
			System.out.println(oneCustomer);
		}

		
		
	}

}
