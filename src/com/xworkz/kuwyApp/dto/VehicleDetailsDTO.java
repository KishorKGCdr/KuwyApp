package com.xworkz.kuwyApp.dto;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.Getter;
import lombok.Setter;


public class VehicleDetailsDTO {
	Logger logger = LoggerFactory.getLogger(VehicleDetailsDTO.class);

	public VehicleDetailsDTO() {
		logger.info("created " + this.getClass().getSimpleName());
	}

	private int mfgYear;
	private String brand;
	private String model;
	private String variant;

	private List<LoanEligibilityDTO> loanEligibility;
	
	

	public Logger getLogger() {
		return logger;
	}



	public void setLogger(Logger logger) {
		this.logger = logger;
	}



	public int getMfgYear() {
		return mfgYear;
	}



	public void setMfgYear(int mfgYear) {
		this.mfgYear = mfgYear;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public String getVariant() {
		return variant;
	}



	public void setVariant(String variant) {
		this.variant = variant;
	}



	public List<LoanEligibilityDTO> getLoanEligibility() {
		return loanEligibility;
	}



	public void setLoanEligibility(List<LoanEligibilityDTO> loanEligibility) {
		this.loanEligibility = loanEligibility;
	}



	@Override
	public String toString() {
		return "VehicleDTO [mfgYear=" + mfgYear + ", brand=" + brand + ", model=" + model + ", variant=" + variant
				+ "]";
	}

}
