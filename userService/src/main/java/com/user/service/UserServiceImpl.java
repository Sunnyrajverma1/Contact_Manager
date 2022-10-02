package com.user.service;
import java.util.List;

import org.springframework.stereotype.Service;

import java.util.*;
import com.user.entity.*;
@Service
public class UserServiceImpl implements UserService{
	
	//fake userlist
	
	List<User>list=List.of(
			new User( 1311L,"sunnny","9999999"),
			new User( 1312L,"Raj","888888"),
			new User( 1313L,"verma","777777")
			);

	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return  list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
	}

}
