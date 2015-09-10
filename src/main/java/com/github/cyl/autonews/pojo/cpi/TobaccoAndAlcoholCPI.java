package com.github.cyl.autonews.pojo.cpi;

public class TobaccoAndAlcoholCPI extends Indicator {
	private Indicator tobaccoIndicator;
	private Indicator alcoholIndicator;

	public Indicator getTobaccoIndicator() {
		return tobaccoIndicator;
	}

	public void setTobaccoIndicator(Indicator tobaccoIndicator) {
		this.tobaccoIndicator = tobaccoIndicator;
	}

	public Indicator getAlcoholIndicator() {
		return alcoholIndicator;
	}

	public void setAlcoholIndicator(Indicator alcoholIndicator) {
		this.alcoholIndicator = alcoholIndicator;
	}

}
