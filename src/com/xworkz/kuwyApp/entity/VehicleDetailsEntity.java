package com.xworkz.kuwyApp.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "vehicle_detail")

@NoArgsConstructor
@AllArgsConstructor
public class VehicleDetailsEntity implements Serializable {
	

	private static final long serialVersionUID = 1L;
	@Id
	private int vehicleId;
	private int mfgYear;
	private String brand;
	private String model;
	private String variant;
	
	@OneToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
	@JoinColumn(name="vehicle_id")
	private List<LoanEligibilityEntity> loanEligibility;
	

	@Override
	public String toString() {
		return "VehicleEntity [mfgYear=" + mfgYear + ", brand=" + brand + ", model=" + model + ", variant=" + variant
				+ "]";
	}


	public int getVehicleId() {
		return vehicleId;
	}


	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
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


	public List<LoanEligibilityEntity> getLoanEligibility() {
		return loanEligibility;
	}


	public void setLoanEligibility(List<LoanEligibilityEntity> loanEligibility) {
		this.loanEligibility = loanEligibility;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
