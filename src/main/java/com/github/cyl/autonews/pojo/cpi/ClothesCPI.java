package com.github.cyl.autonews.pojo.cpi;

public class ClothesCPI extends Indicator {
	private Indicator clothingIndicator;
	private Indicator shoesIndicator;
	private Indicator clothingProcessingServiceFeeIndicator;

	public Indicator getClothingIndicator() {
		return clothingIndicator;
	}

	public void setClothingIndicator(Indicator clothingIndicator) {
		this.clothingIndicator = clothingIndicator;
	}

	public Indicator getShoesIndicator() {
		return shoesIndicator;
	}

	public void setShoesIndicator(Indicator shoesIndicator) {
		this.shoesIndicator = shoesIndicator;
	}

	public Indicator getClothingProcessingServiceFeeIndicator() {
		return clothingProcessingServiceFeeIndicator;
	}

	public void setClothingProcessingServiceFeeIndicator(
			Indicator clothingProcessingServiceFeeIndicator) {
		this.clothingProcessingServiceFeeIndicator = clothingProcessingServiceFeeIndicator;
	}

}
