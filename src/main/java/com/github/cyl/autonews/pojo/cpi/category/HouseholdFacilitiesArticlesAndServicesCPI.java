package com.github.cyl.autonews.pojo.cpi.category;

import com.github.cyl.autonews.pojo.cpi.indicator.Indicator;

//认证
public class HouseholdFacilitiesArticlesAndServicesCPI extends Indicator {
	private Indicator durableConsumerIndicator;// 认证
	private Indicator householdServicesAndMaintenanceAndRenovationIndicator;// 认证

	public Indicator getDurableConsumerIndicator() {
		return durableConsumerIndicator;
	}

	public void setDurableConsumerIndicator(Indicator durableConsumerIndicator) {
		this.durableConsumerIndicator = durableConsumerIndicator;
	}

	public Indicator getHouseholdServicesAndMaintenanceAndRenovationIndicator() {
		return householdServicesAndMaintenanceAndRenovationIndicator;
	}

	public void setHouseholdServicesAndMaintenanceAndRenovationIndicator(
			Indicator householdServicesAndMaintenanceAndRenovationIndicator) {
		this.householdServicesAndMaintenanceAndRenovationIndicator = householdServicesAndMaintenanceAndRenovationIndicator;
	}

}
