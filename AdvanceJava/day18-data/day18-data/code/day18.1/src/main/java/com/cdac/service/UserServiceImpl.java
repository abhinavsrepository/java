package com.cdac.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdac.custom_exceptions.ApiException;
import com.cdac.dao.UserDao;
import com.cdac.dto.UserReqDTO;
import com.cdac.dto.UserRespDTO;
import com.cdac.entities.User;

import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class UserServiceImpl implements UserService {
	// depcy
	private final UserDao userDao;
	private final ModelMapper modelMapper;

	@Override
	public UserRespDTO registerUser(UserReqDTO dto) {
		// validate if email is not dup
		if (userDao.existsByEmail(dto.getEmail()))
			throw new ApiException("Dup Email !!!!!!!!");
		// => email : distinct
		// map dto -> entity
		User entity = modelMapper.map(dto, User.class);
		return modelMapper.map
				(userDao.save(entity), UserRespDTO.class);
	}

	public User authenticateUser(String email, String password) {
	    Optional<User> userOpt = userRepository.findByEmail(email);
	    if (userOpt.isPresent()) {
	        User user = userOpt.get();
	        if (user.getPassword().equals(password)) { // In real apps, use password hashing!
	            return user;
	        }
	    }
	    throw new ApiException("Invalid email or password");
	}

	@Override
	public User authenticateUser(Object email, Object password) {
		// TODO Auto-generated method stub
		return null;
	}

}
