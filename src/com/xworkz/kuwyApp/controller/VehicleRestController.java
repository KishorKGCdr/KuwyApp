package com.xworkz.kuwyApp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.kuwyApp.dto.LoanEligibilityDTO;
import com.xworkz.kuwyApp.service.VehicleDetailsService;

@RestController
@RequestMapping("/api/v1/vehicle")
@CrossOrigin
public class VehicleRestController {
	Logger logger = LoggerFactory.getLogger(VehicleRestController.class);


	@Autowired
	private VehicleDetailsService vehicleDetailsService;

	public VehicleRestController() {
		logger.info("Created "+this.getClass().getSimpleName());
	}
	
	@PostMapping( "/savingData.lef")
	public ResponseEntity<Object> saveVehicleLoanData(@RequestBody LoanEligibilityDTO dto) {
		logger.info("DTO IS "+ dto);
		dto.setPurchased(true);
		dto.setUsedVehicle(true);
		return   vehicleDetailsService.saveData(dto) != null ? new ResponseEntity<>(
				  HttpStatus.OK) :
				  new ResponseEntity<>( HttpStatus.NOT_FOUND);
	}

	@GetMapping("/getAllMfgYear.lef")
	public ResponseEntity<List<Integer>> getDistictYear() {
		List<Integer> list = vehicleDetailsService.getMfgYear();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}


	@GetMapping("/getBrandByMfgYear.lef")
	public ResponseEntity<List<String>> getAllDistBrandByYear(@RequestParam("mfgYear") Integer mfgYear) {
		List<String> list = vehicleDetailsService.getBrandByYear(mfgYear);
		return new ResponseEntity<>(list, HttpStatus.OK);

	}

	@GetMapping("/getModelByBrandAndYear.lef")
	public ResponseEntity<List<String>> getAllDistinctModelbyBrand(@RequestParam("mfgYear") Integer mfgYear,
			@RequestParam("brand") String brand) {
		List<String> list = vehicleDetailsService.getModelbyBrandAndYear(mfgYear, brand);
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	@GetMapping("/getVariantByBrandNYearNModel.lef")
	public ResponseEntity<List<String>> getAllDistinctVariantByBrandNYearNModel(
			@RequestParam("mfgYear") Integer mfgYear, @RequestParam("brand") String brand,
			@RequestParam("model") String model) {
		List<String> list = vehicleDetailsService.getVariantByBrandNYearNModel(mfgYear, brand, model);
		return new ResponseEntity<>(list, HttpStatus.OK);

	}

	

}
