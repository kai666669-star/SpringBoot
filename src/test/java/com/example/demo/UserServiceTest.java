package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.model.Users;
import com.example.demo.service.UserService;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional // @Transactional 寫在測試，測完之後會 ROLLBACK
//@Commit  // 若真的要進資料庫，要寫@Commit ，看情況寫 正式的測試不會有commit

public class UserServiceTest {
	
	@Autowired
	private UserService userService;
	
	@Test
	public void testRegister() {
		Users users = userService.register("jerry2", "abc666");
		
		assertNotNull(users);
	}
	@Test
	public void checkLogin() {
		userService.register("jerry3", "abc666");
		
		boolean result = userService.checkLogin("jerry3", "abc666");
		
		assertTrue(result);
	}



	
	
	
}
