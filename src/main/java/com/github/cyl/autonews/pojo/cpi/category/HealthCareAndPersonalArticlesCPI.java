package com.github.cyl.autonews.pojo.cpi.category;

import com.github.cyl.autonews.pojo.cpi.indicator.Indicator;

//认证
public class HealthCareAndPersonalArticlesCPI extends Indicator {
	private Indicator traditionalChineseMedicineIndicator;// 认证
	private Indicator westernMedicineIndicator;// 认证
	private Indicator healthCareServicesIndicator;// 认证

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

	public Indicator getHealthCareServicesIndicator() {
		return healthCareServicesIndicator;
	}

	public void setHealthCareServicesIndicator(
			Indicator healthCareServicesIndicator) {
		this.healthCareServicesIndicator = healthCareServicesIndicator;
	}

}
