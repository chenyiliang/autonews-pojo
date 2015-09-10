package com.github.cyl.autonews.pojo.cpi.category;

import com.github.cyl.autonews.pojo.cpi.indicator.Indicator;

//认证
public class ResidenceCPI extends Indicator {
	private Indicator buildingAndBuildingDecorationMaterialsIndicator;//认证
	private Indicator rentingIndicator;//认证
	private Indicator waterElectricityAndFuelsIndicator;//认证

	public Indicator getBuildingAndBuildingDecorationMaterialsIndicator() {
		return buildingAndBuildingDecorationMaterialsIndicator;
	}

	public void setBuildingAndBuildingDecorationMaterialsIndicator(
			Indicator buildingAndBuildingDecorationMaterialsIndicator) {
		this.buildingAndBuildingDecorationMaterialsIndicator = buildingAndBuildingDecorationMaterialsIndicator;
	}

	public Indicator getRentingIndicator() {
		return rentingIndicator;
	}

	public void setRentingIndicator(Indicator rentingIndicator) {
		this.rentingIndicator = rentingIndicator;
	}

	public Indicator getWaterElectricityAndFuelsIndicator() {
		return waterElectricityAndFuelsIndicator;
	}

	public void setWaterElectricityAndFuelsIndicator(
			Indicator waterElectricityAndFuelsIndicator) {
		this.waterElectricityAndFuelsIndicator = waterElectricityAndFuelsIndicator;
	}
}
