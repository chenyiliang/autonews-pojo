package com.github.cyl.autonews.pojo.cpi;

public class HouseholdEquipmentAndMaintenanceServicesCPI extends Indicator {
	private Indicator consumerDurablesIndicator;
	private Indicator householdServicesAndMaintenanceServicesIndicator;

	public Indicator getConsumerDurablesIndicator() {
		return consumerDurablesIndicator;
	}

	public void setConsumerDurablesIndicator(Indicator consumerDurablesIndicator) {
		this.consumerDurablesIndicator = consumerDurablesIndicator;
	}

	public Indicator getHouseholdServicesAndMaintenanceServicesIndicator() {
		return householdServicesAndMaintenanceServicesIndicator;
	}

	public void setHouseholdServicesAndMaintenanceServicesIndicator(
			Indicator householdServicesAndMaintenanceServicesIndicator) {
		this.householdServicesAndMaintenanceServicesIndicator = householdServicesAndMaintenanceServicesIndicator;
	}

}
