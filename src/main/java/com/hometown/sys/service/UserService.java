package com.hometown.sys.service;


import com.hometown.dto.UserDto;
import com.hometown.sys.entity.SysUser;

public interface UserService {

	SysUser saveUser(UserDto userDto);

	SysUser updateUser(UserDto userDto);

	SysUser getUser(String username);

	void changePassword(String username, String oldPassword, String newPassword);

}
