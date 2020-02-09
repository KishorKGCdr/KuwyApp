package com.xworkz.kuwyApp.service;

import java.io.Serializable;
import java.util.List;

import com.xworkz.kuwyApp.dto.LoanEligibilityDTO;

public interface VehicleDetailsService {
	Serializable saveData(LoanEligibilityDTO dto);

	List<Integer> getMfgYear();

	List<String> getBrandByYear(Integer mfgYear);

	List<String> getModelbyBrandAndYear(Integer mfgYear, String brand);

	List<String> getVariantByBrandNYearNModel(Integer mfgYear, String brand, String model);

}
