package com.ssamz.demosvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/users")
public class DemoController {

	@GetMapping
	public List<UserVO> getUsers() {
		List<UserVO> users = new ArrayList<UserVO>();
		users.add(new UserVO("gdhong", "홍길동", "010-1111-1111", "gdhong@test.com"));
		users.add(new UserVO("mrlee", "이몽룡", "010-1111-1112", "mrlee@test.com"));
		
		return users;
	}
}
