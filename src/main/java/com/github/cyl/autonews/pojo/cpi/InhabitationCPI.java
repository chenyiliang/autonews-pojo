package com.github.cyl.autonews.pojo.cpi;

public class InhabitationCPI extends Indicator {
	private Indicator buildingAndDecorationMaterialsIndicator;
	private Indicator housingRentIndicator;
	private Indicator waterAndelectricityAndfuelIndicator;

	public Indicator getBuildingAndDecorationMaterialsIndicator() {
		return buildingAndDecorationMaterialsIndicator;
	}

	public void setBuildingAndDecorationMaterialsIndicator(
			Indicator buildingAndDecorationMaterialsIndicator) {
		this.buildingAndDecorationMaterialsIndicator = buildingAndDecorationMaterialsIndicator;
	}

	public Indicator getHousingRentIndicator() {
		return housingRentIndicator;
	}

	public void setHousingRentIndicator(Indicator housingRentIndicator) {
		this.housingRentIndicator = housingRentIndicator;
	}

	public Indicator getWaterAndelectricityAndfuelIndicator() {
		return waterAndelectricityAndfuelIndicator;
	}

	public void setWaterAndelectricityAndfuelIndicator(
			Indicator waterAndelectricityAndfuelIndicator) {
		this.waterAndelectricityAndfuelIndicator = waterAndelectricityAndfuelIndicator;
	}

}
