package com.github.cyl.autonews.pojo.cpi.category;

import com.github.cyl.autonews.pojo.indicator.Indicator;

//认证
public class Food extends Indicator {
	private Indicator grain;// 认证
	private Indicator oilOrFat;// 认证
	private MeatPoultryAndProcessedProducts meatPoultryAndProcessedProducts;// 认证
	private Indicator eggs;// 认证
	private Indicator aquaticProducts;// 认证
	private Indicator freshVegetables;// 认证
	private Indicator freshFruits;// 认证
	private Indicator milkAndIsProducts;// 认证

	public Indicator getGrain() {
		return grain;
	}

	public void setGrain(Indicator grain) {
		this.grain = grain;
	}

	public Indicator getOilOrFat() {
		return oilOrFat;
	}

	public void setOilOrFat(Indicator oilOrFat) {
		this.oilOrFat = oilOrFat;
	}

	public MeatPoultryAndProcessedProducts getMeatPoultryAndProcessedProducts() {
		return meatPoultryAndProcessedProducts;
	}

	public void setMeatPoultryAndProcessedProducts(
			MeatPoultryAndProcessedProducts meatPoultryAndProcessedProducts) {
		this.meatPoultryAndProcessedProducts = meatPoultryAndProcessedProducts;
	}

	public Indicator getEggs() {
		return eggs;
	}

	public void setEggs(Indicator eggs) {
		this.eggs = eggs;
	}

	public Indicator getAquaticProducts() {
		return aquaticProducts;
	}

	public void setAquaticProducts(Indicator aquaticProducts) {
		this.aquaticProducts = aquaticProducts;
	}

	public Indicator getFreshVegetables() {
		return freshVegetables;
	}

	public void setFreshVegetables(Indicator freshVegetables) {
		this.freshVegetables = freshVegetables;
	}

	public Indicator getFreshFruits() {
		return freshFruits;
	}

	public void setFreshFruits(Indicator freshFruits) {
		this.freshFruits = freshFruits;
	}

	public Indicator getMilkAndIsProducts() {
		return milkAndIsProducts;
	}

	public void setMilkAndIsProducts(Indicator milkAndIsProducts) {
		this.milkAndIsProducts = milkAndIsProducts;
	}

}
