package com.cdac.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.custom_exceptions.ApiException;
import com.cdac.dto.AddressReqDTO;
import com.cdac.dto.LoginDto;
import com.cdac.dto.UserReqDTO;
import com.cdac.entities.User;
import com.cdac.service.AddressService;
import com.cdac.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController<userLogin> {
	private final UserService userService;
	private final AddressService addressService;
	private final UserLogin userLogin;
	 /*
	  *   User sign up
	 	 *  URL - http://host:port/users
	 	 * Method - POST 
	 	 * Payload - JSON representation of user req dto
	 	 * Response -  user resp dto
	 	 * 
	  */
	@PostMapping
	@Operation(description = "register the user address")
	public ResponseEntity<?> userRegistration(@RequestBody UserReqDTO dto) {
		System.out.println("in reg user "+dto);
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(userService.registerUser(dto));
	}
	
	 /*
	  *   Assign user address
	 	 *  URL - http://host:port/users/{userId}/address
	 	 * Method - POST 
	 	 * Payload - JSON representation of address req dto
	 	 * Response -  api resp 
	 	 * 
	  */
	@PostMapping("/{userId}/address")
	@Operation(description = "Assign User address")
	public ResponseEntity<?> assignUserAddress(@PathVariable Long userId,
			@RequestBody AddressReqDTO dto) {
		System.out.println("in add adr "+userId+" "+dto);
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(addressService.assignUserAddress(userId,dto));
	}
	
	@PostMapping("/{login}")
	@Operation(description = "User sign-in method")
	public ResponseEntity<?> signInUserAddress(@RequestBody LoginDto dto) {
	    System.out.println("Sign in request for user: " + dto);

	    try {
	        // Call service layer to authenticate
	        User authenticatedUser = userService.authenticateUser(dto.getEmail(), dto.getPassword());

	        // You could return a token or user details here
	        return ResponseEntity.ok(authenticatedUser); // OR create a response DTO if needed
	    } catch (ApiException e) {
	        // Custom exception for login failures
	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
	        		.body(userLogin.authenticateUser());
	    }
	}

}
