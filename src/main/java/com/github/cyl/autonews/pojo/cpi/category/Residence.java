package com.github.cyl.autonews.pojo.cpi.category;

import com.github.cyl.autonews.pojo.indicator.Indicator;

//认证
public class Residence extends Indicator {
	private Indicator buildingAndBuildingDecorationMaterials;// 认证
	private Indicator renting;// 认证
	private Indicator waterElectricityAndFuels;// 认证

	public Indicator getBuildingAndBuildingDecorationMaterials() {
		return buildingAndBuildingDecorationMaterials;
	}

	public void setBuildingAndBuildingDecorationMaterials(
			Indicator buildingAndBuildingDecorationMaterials) {
		this.buildingAndBuildingDecorationMaterials = buildingAndBuildingDecorationMaterials;
	}

	public Indicator getRenting() {
		return renting;
	}

	public void setRenting(Indicator renting) {
		this.renting = renting;
	}

	public Indicator getWaterElectricityAndFuels() {
		return waterElectricityAndFuels;
	}

	public void setWaterElectricityAndFuels(Indicator waterElectricityAndFuels) {
		this.waterElectricityAndFuels = waterElectricityAndFuels;
	}

}
