package com.github.cyl.autonews.pojo.cpi;

public class HealthCareAndPersonalProductsCPI extends Indicator {
	private Indicator traditionalChineseMedicineIndicator;
	private Indicator westernMedicineIndicator;
	private Indicator healthcareServicesIndicator;

	public Indicator getTraditionalChineseMedicineIndicator() {
		return traditionalChineseMedicineIndicator;
	}

	public void setTraditionalChineseMedicineIndicator(
			Indicator traditionalChineseMedicineIndicator) {
		this.traditionalChineseMedicineIndicator = traditionalChineseMedicineIndicator;
	}

	public Indicator getWesternMedicineIndicator() {
		return westernMedicineIndicator;
	}

	public void setWesternMedicineIndicator(Indicator westernMedicineIndicator) {
		this.westernMedicineIndicator = westernMedicineIndicator;
	}

	public Indicator getHealthcareServicesIndicator() {
		return healthcareServicesIndicator;
	}

	public void setHealthcareServicesIndicator(
			Indicator healthcareServicesIndicator) {
		this.healthcareServicesIndicator = healthcareServicesIndicator;
	}

}
