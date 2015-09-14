package com.github.cyl.autonews.pojo.cpi.category;

import com.github.cyl.autonews.pojo.indicator.Indicator;

//认证
public class TransportationAndCommunication extends Indicator {
	private Indicator transportationFacility;// 认证
	private Indicator fuelsAndParts;// 认证
	private Indicator feesForVehicleUseAndMaintenance;// 认证
	private Indicator communicationFacility;// 认证
	private Indicator communicationService;// 认证

	public Indicator getTransportationFacility() {
		return transportationFacility;
	}

	public void setTransportationFacility(Indicator transportationFacility) {
		this.transportationFacility = transportationFacility;
	}

	public Indicator getFuelsAndParts() {
		return fuelsAndParts;
	}

	public void setFuelsAndParts(Indicator fuelsAndParts) {
		this.fuelsAndParts = fuelsAndParts;
	}

	public Indicator getFeesForVehicleUseAndMaintenance() {
		return feesForVehicleUseAndMaintenance;
	}

	public void setFeesForVehicleUseAndMaintenance(
			Indicator feesForVehicleUseAndMaintenance) {
		this.feesForVehicleUseAndMaintenance = feesForVehicleUseAndMaintenance;
	}

	public Indicator getCommunicationFacility() {
		return communicationFacility;
	}

	public void setCommunicationFacility(Indicator communicationFacility) {
		this.communicationFacility = communicationFacility;
	}

	public Indicator getCommunicationService() {
		return communicationService;
	}

	public void setCommunicationService(Indicator communicationService) {
		this.communicationService = communicationService;
	}

}
