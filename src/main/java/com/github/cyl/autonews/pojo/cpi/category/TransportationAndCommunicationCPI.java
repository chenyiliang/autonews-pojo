package com.github.cyl.autonews.pojo.cpi.category;

import com.github.cyl.autonews.pojo.cpi.indicator.Indicator;

//认证
public class TransportationAndCommunicationCPI extends Indicator {
	private Indicator transportationFacilityIndicator;//认证
	private Indicator fuelsAndPartsIndicator;//认证
	private Indicator feesForVehicleUseAndMaintenanceIndicator;//认证
	private Indicator communicationFacilityIndicator;//认证
	private Indicator communicationServiceIndicator;//认证

	public Indicator getTransportationFacilityIndicator() {
		return transportationFacilityIndicator;
	}

	public void setTransportationFacilityIndicator(
			Indicator transportationFacilityIndicator) {
		this.transportationFacilityIndicator = transportationFacilityIndicator;
	}

	public Indicator getFuelsAndPartsIndicator() {
		return fuelsAndPartsIndicator;
	}

	public void setFuelsAndPartsIndicator(Indicator fuelsAndPartsIndicator) {
		this.fuelsAndPartsIndicator = fuelsAndPartsIndicator;
	}

	public Indicator getFeesForVehicleUseAndMaintenanceIndicator() {
		return feesForVehicleUseAndMaintenanceIndicator;
	}

	public void setFeesForVehicleUseAndMaintenanceIndicator(
			Indicator feesForVehicleUseAndMaintenanceIndicator) {
		this.feesForVehicleUseAndMaintenanceIndicator = feesForVehicleUseAndMaintenanceIndicator;
	}

	public Indicator getCommunicationFacilityIndicator() {
		return communicationFacilityIndicator;
	}

	public void setCommunicationFacilityIndicator(
			Indicator communicationFacilityIndicator) {
		this.communicationFacilityIndicator = communicationFacilityIndicator;
	}

	public Indicator getCommunicationServiceIndicator() {
		return communicationServiceIndicator;
	}

	public void setCommunicationServiceIndicator(
			Indicator communicationServiceIndicator) {
		this.communicationServiceIndicator = communicationServiceIndicator;
	}

}
