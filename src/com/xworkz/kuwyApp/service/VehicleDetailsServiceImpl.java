package com.xworkz.kuwyApp.service;

import java.io.Serializable;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.kuwyApp.dao.VehicleDeatilsDAO;
import com.xworkz.kuwyApp.dto.LoanEligibilityDTO;
import com.xworkz.kuwyApp.entity.LoanEligibilityEntity;
import com.xworkz.kuwyApp.entity.VehicleDetailsEntity;

@Service
public class VehicleDetailsServiceImpl implements VehicleDetailsService{
	Logger logger = LoggerFactory.getLogger(VehicleDetailsServiceImpl.class);

	
	@Autowired
	private VehicleDeatilsDAO vehicleDeatilsDAO;
	
	@Override
	public List<Integer> getMfgYear() {
		return vehicleDeatilsDAO.getMfgYear();
	}

	@Override
	public List<String> getBrandByYear(Integer mfgYear) {
		
		return vehicleDeatilsDAO.getBrandByMfgYear(mfgYear);
	}

	@Override
	public List<String> getModelbyBrandAndYear(Integer mfgYear, String brand) {
		
		return vehicleDeatilsDAO.getModelbyBrandNMfgYear(mfgYear, brand);
	}

	@Override
	public List<String> getVariantByBrandNYearNModel(Integer mfgYear, String brand, String model) {
		return vehicleDeatilsDAO.getVariantByBrandNYearNModel(mfgYear, brand, model);
	}


	
	public Serializable saveData(LoanEligibilityDTO dto) {
		LoanEligibilityEntity entity = new LoanEligibilityEntity();
		BeanUtils.copyProperties(dto, entity);
		logger.info("entity is "+entity);
		
		return vehicleDeatilsDAO.saveVehicleData(entity);
	}



}
