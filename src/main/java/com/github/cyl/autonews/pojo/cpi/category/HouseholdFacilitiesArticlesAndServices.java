package com.github.cyl.autonews.pojo.cpi.category;

import com.github.cyl.autonews.pojo.indicator.Indicator;

//认证
public class HouseholdFacilitiesArticlesAndServices extends Indicator {
	private Indicator durableConsumerGoods;// 认证
	private Indicator householdServicesAndMaintenanceAndRenovation;// 认证

	public Indicator getDurableConsumerGoods() {
		return durableConsumerGoods;
	}

	public void setDurableConsumerGoods(Indicator durableConsumerGoods) {
		this.durableConsumerGoods = durableConsumerGoods;
	}

	public Indicator getHouseholdServicesAndMaintenanceAndRenovation() {
		return householdServicesAndMaintenanceAndRenovation;
	}

	public void setHouseholdServicesAndMaintenanceAndRenovation(
			Indicator householdServicesAndMaintenanceAndRenovation) {
		this.householdServicesAndMaintenanceAndRenovation = householdServicesAndMaintenanceAndRenovation;
	}

}
