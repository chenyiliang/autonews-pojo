package com.github.cyl.autonews.pojo.cpi;

public class FoodCPI extends Indicator {
	private Indicator grainIndicator;
	private Indicator oilIndicator;
	private MeatAndPoultryCPI meatAndPoultryCPI;
	private Indicator eggIndicator;
	private Indicator aquaticGoodsIndicator;
	private Indicator vegetableIndicator;
	private Indicator fruitIndicator;
	private Indicator liquidMilkAndDairProductsIndicator;

	public Indicator getGrainIndicator() {
		return grainIndicator;
	}

	public void setGrainIndicator(Indicator grainIndicator) {
		this.grainIndicator = grainIndicator;
	}

	public Indicator getOilIndicator() {
		return oilIndicator;
	}

	public void setOilIndicator(Indicator oilIndicator) {
		this.oilIndicator = oilIndicator;
	}

	public MeatAndPoultryCPI getMeatAndPoultryCPI() {
		return meatAndPoultryCPI;
	}

	public void setMeatAndPoultryCPI(MeatAndPoultryCPI meatAndPoultryCPI) {
		this.meatAndPoultryCPI = meatAndPoultryCPI;
	}

	public Indicator getEggIndicator() {
		return eggIndicator;
	}

	public void setEggIndicator(Indicator eggIndicator) {
		this.eggIndicator = eggIndicator;
	}

	public Indicator getAquaticGoodsIndicator() {
		return aquaticGoodsIndicator;
	}

	public void setAquaticGoodsIndicator(Indicator aquaticGoodsIndicator) {
		this.aquaticGoodsIndicator = aquaticGoodsIndicator;
	}

	public Indicator getVegetableIndicator() {
		return vegetableIndicator;
	}

	public void setVegetableIndicator(Indicator vegetableIndicator) {
		this.vegetableIndicator = vegetableIndicator;
	}

	public Indicator getFruitIndicator() {
		return fruitIndicator;
	}

	public void setFruitIndicator(Indicator fruitIndicator) {
		this.fruitIndicator = fruitIndicator;
	}

	public Indicator getLiquidMilkAndDairProductsIndicator() {
		return liquidMilkAndDairProductsIndicator;
	}

	public void setLiquidMilkAndDairProductsIndicator(
			Indicator liquidMilkAndDairProductsIndicator) {
		this.liquidMilkAndDairProductsIndicator = liquidMilkAndDairProductsIndicator;
	}

}
