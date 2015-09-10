package com.github.cyl.autonews.pojo.cpi;

public class TransportAndCommunicationsCPI extends Indicator {
	private Indicator transportationIndicator;
	private Indicator vehicleFuelAndSparePartsIndicator;
	private Indicator vehiclesAndMaintenanceIndicator;
	private Indicator communicationToolsIndicator;
	private Indicator communicationServicesIndicator;

	public Indicator getTransportationIndicator() {
		return transportationIndicator;
	}

	public void setTransportationIndicator(Indicator transportationIndicator) {
		this.transportationIndicator = transportationIndicator;
	}

	public Indicator getVehicleFuelAndSparePartsIndicator() {
		return vehicleFuelAndSparePartsIndicator;
	}

	public void setVehicleFuelAndSparePartsIndicator(
			Indicator vehicleFuelAndSparePartsIndicator) {
		this.vehicleFuelAndSparePartsIndicator = vehicleFuelAndSparePartsIndicator;
	}

	public Indicator getVehiclesAndMaintenanceIndicator() {
		return vehiclesAndMaintenanceIndicator;
	}

	public void setVehiclesAndMaintenanceIndicator(
			Indicator vehiclesAndMaintenanceIndicator) {
		this.vehiclesAndMaintenanceIndicator = vehiclesAndMaintenanceIndicator;
	}

	public Indicator getCommunicationToolsIndicator() {
		return communicationToolsIndicator;
	}

	public void setCommunicationToolsIndicator(
			Indicator communicationToolsIndicator) {
		this.communicationToolsIndicator = communicationToolsIndicator;
	}

	public Indicator getCommunicationServicesIndicator() {
		return communicationServicesIndicator;
	}

	public void setCommunicationServicesIndicator(
			Indicator communicationServicesIndicator) {
		this.communicationServicesIndicator = communicationServicesIndicator;
	}

}
