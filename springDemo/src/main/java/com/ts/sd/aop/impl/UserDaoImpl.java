package com.ts.sd.aop.impl;

import org.springframework.stereotype.Repository;

import com.ts.sd.aop.User;
import com.ts.sd.aop.UserDao;
@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Override
	public void addUser(User user) {
		System.out.println("�����һ���û������ݿ⣡");
	}

}
