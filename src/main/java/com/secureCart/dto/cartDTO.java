package com.secureCart.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class cartDTO {

	private Long id;
	private Long userId;
	private List<Long> productIds;
}
