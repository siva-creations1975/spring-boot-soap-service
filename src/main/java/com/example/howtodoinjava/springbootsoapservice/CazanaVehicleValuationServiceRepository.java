package com.example.howtodoinjava.springbootsoapservice;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.datacontract.schemas._2004._07.integrationservicelayer_services_entities.Confidence;
import org.datacontract.schemas._2004._07.integrationservicelayer_services_entities.GrossProfit;
import org.datacontract.schemas._2004._07.integrationservicelayer_services_entities.Mileage;
import org.datacontract.schemas._2004._07.integrationservicelayer_services_entities.Valuation;
import org.datacontract.schemas._2004._07.integrationservicelayer_services_entities.VehicleValuationResponse;
import org.springframework.stereotype.Component;

@Component
public class CazanaVehicleValuationServiceRepository {
	private static final Map<Integer, VehicleValuationResponse> responses = new HashMap<>();

	@PostConstruct
	public void initData() {

		VehicleValuationResponse response = new VehicleValuationResponse();

		response.setCid(8628);
		response.setMake("Volkswagen");
		response.setModel("Polo Hatch");
		response.setOcn(12810);
		response.setDaysToSale(51);

		Mileage mileage = new Mileage();
		mileage.setMileage(85084);
		mileage.setEstimate(true);

		response.setMileage(mileage);
		response.setYoungUsed(10999);

		Valuation valuation = new Valuation();
		valuation.setRetail(4528);
		valuation.setTrade(3396);
		valuation.setSupermarket(4420);
		valuation.setIndependent(4387);
		valuation.setFranchise(4659);
		GrossProfit grossProfit = new GrossProfit();
		grossProfit.setProfit(1132);
		grossProfit.setPercentange(25);
		valuation.setGrossProfit(grossProfit);
		valuation.setPercentOfOcn(35.35);
		valuation.setValuationDate("2019-08-04T00:00:00.000Z");

		response.setValuation(valuation);
		response.setStockingDepreciation("-£20");
		Confidence confidence = new Confidence();
		confidence.setMarker("Very High");
		confidence.setLower(4012);
		confidence.setUpper(5031);
		response.setConfidence(confidence);

		responses.put(200, response);

	}

	public VehicleValuationResponse findVehicleValuation(Integer vrm) {
		// Assert.notNull(name, "The Student's name must not be null");
		return responses.get(vrm);
	}
}