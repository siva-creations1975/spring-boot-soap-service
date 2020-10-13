package com.example.howtodoinjava.springbootsoapservice;

import org.datacontract.schemas._2004._07.integrationservicelayer_services_entities.VehicleValuationRequest;
import org.datacontract.schemas._2004._07.integrationservicelayer_services_entities.VehicleValuationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
public class CazanaVehicleValuationServiceEndpoint {
	private static final String NAMESPACE_URI = "http://schemas.datacontract.org/2004/07/IntegrationServiceLayer.Services.Entities.CazanaVehicleValuationLookup";

	private CazanaVehicleValuationServiceRepository CazanaVehicleValuationServiceRepository;

	@Autowired
	public CazanaVehicleValuationServiceEndpoint(
			CazanaVehicleValuationServiceRepository CazanaVehicleValuationServiceRepository) {
		this.CazanaVehicleValuationServiceRepository = CazanaVehicleValuationServiceRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "VehicleValuationRequest")
	@ResponsePayload
	public VehicleValuationResponse getVehicleValuation(@RequestPayload VehicleValuationRequest request) {
		return CazanaVehicleValuationServiceRepository.findVehicleValuation(request.getVrm());
	}
}