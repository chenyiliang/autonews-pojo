package com.github.cyl.autonews.pojo.cpi.category;

import com.github.cyl.autonews.pojo.cpi.indicator.Indicator;

//认证
public class FoodCPI extends Indicator {
	private Indicator grainIndicator;// 认证
	private Indicator oilOrFatIndicator;// 认证
	private MeatPoultryAndProcessedProductsCPI meatPoultryAndProcessedProductsCPI;// 认证
	private Indicator eggsIndicator;// 认证
	private Indicator aquaticProductsIndicator;// 认证
	private Indicator freshVegetablesIndicator;// 认证
	private Indicator freshFruitsIndicator;// 认证
	private Indicator milkAndIsProductsIndicator;// 认证

	public Indicator getGrainIndicator() {
		return grainIndicator;
	}

	public void setGrainIndicator(Indicator grainIndicator) {
		this.grainIndicator = grainIndicator;
	}

	public Indicator getOilOrFatIndicator() {
		return oilOrFatIndicator;
	}

	public void setOilOrFatIndicator(Indicator oilOrFatIndicator) {
		this.oilOrFatIndicator = oilOrFatIndicator;
	}

	public MeatPoultryAndProcessedProductsCPI getMeatPoultryAndProcessedProductsCPI() {
		return meatPoultryAndProcessedProductsCPI;
	}

	public void setMeatPoultryAndProcessedProductsCPI(
			MeatPoultryAndProcessedProductsCPI meatPoultryAndProcessedProductsCPI) {
		this.meatPoultryAndProcessedProductsCPI = meatPoultryAndProcessedProductsCPI;
	}

	public Indicator getEggsIndicator() {
		return eggsIndicator;
	}

	public void setEggsIndicator(Indicator eggsIndicator) {
		this.eggsIndicator = eggsIndicator;
	}

	public Indicator getAquaticProductsIndicator() {
		return aquaticProductsIndicator;
	}

	public void setAquaticProductsIndicator(Indicator aquaticProductsIndicator) {
		this.aquaticProductsIndicator = aquaticProductsIndicator;
	}

	public Indicator getFreshVegetablesIndicator() {
		return freshVegetablesIndicator;
	}

	public void setFreshVegetablesIndicator(Indicator freshVegetablesIndicator) {
		this.freshVegetablesIndicator = freshVegetablesIndicator;
	}

	public Indicator getFreshFruitsIndicator() {
		return freshFruitsIndicator;
	}

	public void setFreshFruitsIndicator(Indicator freshFruitsIndicator) {
		this.freshFruitsIndicator = freshFruitsIndicator;
	}

	public Indicator getMilkAndIsProductsIndicator() {
		return milkAndIsProductsIndicator;
	}

	public void setMilkAndIsProductsIndicator(
			Indicator milkAndIsProductsIndicator) {
		this.milkAndIsProductsIndicator = milkAndIsProductsIndicator;
	}

}
