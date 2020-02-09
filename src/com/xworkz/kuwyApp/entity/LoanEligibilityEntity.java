package com.xworkz.kuwyApp.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "vehicle_loan_detail")

@NoArgsConstructor
@AllArgsConstructor
public class LoanEligibilityEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GenericGenerator(name = "key", strategy = "increment")
	@GeneratedValue(generator = "key")
	private int vehicleLoanId;

	private Boolean usedVehicle;
	private int vehicleType;
	private Boolean purchased;
	private String location;
	private int ownerShip;
	private int vehicleCondition;
	private long vehiclePrice;
	private int personAge;
	private String customerProfile;
	private int monthlyIncome;
	private long loanAmount;
	private String maxDownPayment;
	private int existEmi;
	private int affordability;
	private int customerHouseType;
	private int guarantor;
	private String cusLocationName;

	@PrePersist()
	public void prepersist() {
		if (getUsedVehicle() == null)
			setUsedVehicle(true);
		if (getPurchased() == null)
			setPurchased(true);
	}

	@Override
	public String toString() {
		return "LoanEligibilityEntity [vehicleLoanId=" + vehicleLoanId + ", usedVehicle=" + usedVehicle
				+ ", vehicleType=" + vehicleType + ", purchased=" + purchased + ", location=" + location
				+ ", ownerShip=" + ownerShip + ", vehicleCondition=" + vehicleCondition + ", vehiclePrice="
				+ vehiclePrice + ", personAge=" + personAge + ", customerProfile=" + customerProfile
				+ ", monthlyIncome=" + monthlyIncome + ", loanAmount=" + loanAmount + ", maxDownPayment="
				+ maxDownPayment + ", existEmi=" + existEmi + ", affordability=" + affordability
				+ ", customerHouseType=" + customerHouseType + ", guarantor=" + guarantor + ", cusLocationName="
				+ cusLocationName + "]";
	}

	public int getVehicleLoanId() {
		return vehicleLoanId;
	}

	public void setVehicleLoanId(int vehicleLoanId) {
		this.vehicleLoanId = vehicleLoanId;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getCustomerProfile() {
		return customerProfile;
	}

	public void setCustomerProfile(String customerProfile) {
		this.customerProfile = customerProfile;
	}

}
