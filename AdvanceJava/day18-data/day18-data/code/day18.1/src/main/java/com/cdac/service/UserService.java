package com.cdac.service;

import com.cdac.dto.UserReqDTO;
import com.cdac.dto.UserRespDTO;
import com.cdac.entities.User;

public interface UserService {

	UserRespDTO registerUser(UserReqDTO dto);

	User authenticateUser(Object email, Object password);

}
