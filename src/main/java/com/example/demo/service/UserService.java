package com.example.demo.service;


import java.util.Optional;


import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import com.example.demo.model.Users;
import com.example.demo.model.UsersRepository;


import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service
public class UserService {
	
	private final PasswordEncoder passwordEncoder;
	
	private final UsersRepository usersRepo;
	
	public Users register(String username, String pwdInput) {
		Optional<Users> op = usersRepo.findByUsername(username);
		
		if(op.isPresent()) {
			return null;
		}
		
		Users users = new Users();
		users.setUsername(username);
		users.setPwd(passwordEncoder.encode(pwdInput));
		
		return usersRepo.save(users);
	}
	
	public boolean checkLogin(String username, String pwdInput) {
		Optional<Users> op = usersRepo.findByUsername(username);
		
		if(op.isPresent()) {
			Users users = op.get();
			return passwordEncoder.matches(pwdInput, users.getPwd());
		}
		
		return false;
		
	}
	


}
