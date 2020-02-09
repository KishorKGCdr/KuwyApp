package com.xworkz.kuwyApp.dto;

import org.slf4j.Logger;

import lombok.Getter;
import lombok.Setter;

public class LoanEligibilityDTO {
	Logger logger = org.slf4j.LoggerFactory.getLogger(LoanEligibilityDTO.class);

	public LoanEligibilityDTO() {
		logger.info("created "+this.getClass().getSimpleName());
	}

	private Boolean usedVehicle;
	private int vehicleType;
	private Boolean purchased;
	private int mfgYear;
	private String brand;
	private String model;
	private String variant;
	private String location;
	private int ownerShip;
	private int vehicleCondition;
	private long vehiclePrice;
	private int personAge;
	private String customerProfile;
	public String getCustomerProfile() {
		return customerProfile;
	}

	private int monthlyIncome;
	private long loanAmount;
	private String maxDownPayment;
	private int existEmi;
	private int affordability;
	private int customerHouseType;
	private Boolean isHaveIncomeProof;
	private int guarantor;
	public void setCustomerProfile(String customerProfile) {
		this.customerProfile = customerProfile;
	}

	private String cusLocationName;
	private VehicleDetailsDTO vehicle;
	

	public Logger getLogger() {
		return logger;
	}


	public void setLogger(Logger logger) {
		this.logger = logger;
	}


	public Boolean getUsedVehicle() {
		return usedVehicle;
	}


	public void setUsedVehicle(Boolean usedVehicle) {
		this.usedVehicle = usedVehicle;
	}


	public int getVehicleType() {
		return vehicleType;
	}


	public void setVehicleType(int vehicleType) {
		this.vehicleType = vehicleType;
	}


	public Boolean getPurchased() {
		return purchased;
	}


	public void setPurchased(Boolean purchased) {
		this.purchased = purchased;
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


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public int getOwnerShip() {
		return ownerShip;
	}


	public void setOwnerShip(int ownerShip) {
		this.ownerShip = ownerShip;
	}


	public int getVehicleCondition() {
		return vehicleCondition;
	}


	public void setVehicleCondition(int vehicleCondition) {
		this.vehicleCondition = vehicleCondition;
	}


	public long getVehiclePrice() {
		return vehiclePrice;
	}


	public void setVehiclePrice(long vehiclePrice) {
		this.vehiclePrice = vehiclePrice;
	}


	public int getPersonAge() {
		return personAge;
	}


	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}


	


	public int getMonthlyIncome() {
		return monthlyIncome;
	}


	public void setMonthlyIncome(int monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}


	public long getLoanAmount() {
		return loanAmount;
	}


	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}


	public String getMaxDownPayment() {
		return maxDownPayment;
	}


	public void setMaxDownPayment(String maxDownPayment) {
		this.maxDownPayment = maxDownPayment;
	}


	public int getExistEmi() {
		return existEmi;
	}


	public void setExistEmi(int existEmi) {
		this.existEmi = existEmi;
	}


	public int getAffordability() {
		return affordability;
	}


	public void setAffordability(int affordability) {
		this.affordability = affordability;
	}


	public int getCustomerHouseType() {
		return customerHouseType;
	}


	public void setCustomerHouseType(int customerHouseType) {
		this.customerHouseType = customerHouseType;
	}


	public Boolean getIsHaveIncomeProof() {
		return isHaveIncomeProof;
	}


	public void setIsHaveIncomeProof(Boolean isHaveIncomeProof) {
		this.isHaveIncomeProof = isHaveIncomeProof;
	}


	public int getGuarantor() {
		return guarantor;
	}


	public void setGuarantor(int guarantor) {
		this.guarantor = guarantor;
	}


	public String getCusLocationName() {
		return cusLocationName;
	}


	public void setCusLocationName(String cusLocationName) {
		this.cusLocationName = cusLocationName;
	}


	public VehicleDetailsDTO getVehicle() {
		return vehicle;
	}


	public void setVehicle(VehicleDetailsDTO vehicle) {
		this.vehicle = vehicle;
	}


	@Override
	public String toString() {
		return "LoanEligibilityDTO [logger=" + logger + ", usedVehicle=" + usedVehicle + ", vehicleType=" + vehicleType
				+ ", purchased=" + purchased + ", mfgYear=" + mfgYear + ", brand=" + brand + ", model=" + model
				+ ", variant=" + variant + ", location=" + location + ", ownerShip=" + ownerShip + ", vehicleCondition="
				+ vehicleCondition + ", vehiclePrice=" + vehiclePrice + ", personAge=" + personAge
				+ ", customerProfile=" + customerProfile + ", monthlyIncome=" + monthlyIncome + ", loanAmount="
				+ loanAmount + ", maxDownPayment=" + maxDownPayment + ", existEmi=" + existEmi + ", affordability="
				+ affordability + ", customerHouseType=" + customerHouseType + ", isHaveIncomeProof="
				+ isHaveIncomeProof + ", guarantor=" + guarantor + ", cusLocationName=" + cusLocationName + ", vehicle="
				+ vehicle + "]";
	}

}
