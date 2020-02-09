package com.xworkz.kuwyApp.dao;

import java.io.Serializable;
import java.util.List;

import com.xworkz.kuwyApp.entity.LoanEligibilityEntity;
import com.xworkz.kuwyApp.entity.VehicleDetailsEntity;

public interface VehicleDeatilsDAO {
	Serializable saveVehicleData(LoanEligibilityEntity entity);

	List<Integer> getMfgYear();

	List<String> getBrandByMfgYear(Integer mfgYear);

	List<String> getModelbyBrandNMfgYear(Integer mfgYear, String brand);

	List<String> getVariantByBrandNYearNModel(Integer mfgYear, String brand, String model);

	VehicleDetailsEntity getVehicleByMFGModelBrandNVariant(String brand, int mfgYear, String model, String variant);

}
