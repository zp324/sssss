package com.ts.sd.aop.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ts.sd.aop.User;
import com.ts.sd.aop.UserDao;
import com.ts.sd.aop.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao ud;
	public UserServiceImpl() {}
	public UserServiceImpl(UserDao ud) {
		this.ud = ud;
	}
	
	public void setUd(UserDao ud) {
		this.ud = ud;
	}


	@Override
	public void addUser(User user) {
		//int c = 1/0;
		ud.addUser(user);
	}

}
