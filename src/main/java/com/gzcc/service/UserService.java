package com.gzcc.service;

import com.gzcc.pojo.User;

public interface UserService {

	User getUser(Integer id);
	void addScore(Integer id, Integer score);

}
