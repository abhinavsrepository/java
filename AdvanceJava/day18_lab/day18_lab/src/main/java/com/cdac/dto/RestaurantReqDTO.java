package com.cdac.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
public class RestaurantReqDTO {
	@NotBlank(message = "first name required")
	private String name;
	@NotBlank(message = "address required")
	private String address;
	@NotBlank(message = "city required")
	private String city;
	private String description;
	
}
