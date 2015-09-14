package com.github.cyl.autonews.pojo.cpi.category;

import com.github.cyl.autonews.pojo.indicator.Indicator;

//认证
public class Clothing extends Indicator {
	private Indicator garments;// 认证
	private Indicator footgear;// 认证
	private Indicator clothingManufacturingServices;// 认证

	public Indicator getGarments() {
		return garments;
	}

	public void setGarments(Indicator garments) {
		this.garments = garments;
	}

	public Indicator getFootgear() {
		return footgear;
	}

	public void setFootgear(Indicator footgear) {
		this.footgear = footgear;
	}

	public Indicator getClothingManufacturingServices() {
		return clothingManufacturingServices;
	}

	public void setClothingManufacturingServices(
			Indicator clothingManufacturingServices) {
		this.clothingManufacturingServices = clothingManufacturingServices;
	}
}
