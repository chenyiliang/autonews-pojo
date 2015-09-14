package com.github.cyl.autonews.pojo.cpi.category;

import com.github.cyl.autonews.pojo.indicator.Indicator;

//认证
public class HealthCareAndPersonalArticles extends Indicator {
	private Indicator traditionalChineseMedicine;// 认证
	private Indicator westernMedicine;// 认证
	private Indicator healthCareServices;// 认证

	public Indicator getTraditionalChineseMedicine() {
		return traditionalChineseMedicine;
	}

	public void setTraditionalChineseMedicine(
			Indicator traditionalChineseMedicine) {
		this.traditionalChineseMedicine = traditionalChineseMedicine;
	}

	public Indicator getWesternMedicine() {
		return westernMedicine;
	}

	public void setWesternMedicine(Indicator westernMedicine) {
		this.westernMedicine = westernMedicine;
	}

	public Indicator getHealthCareServices() {
		return healthCareServices;
	}

	public void setHealthCareServices(Indicator healthCareServices) {
		this.healthCareServices = healthCareServices;
	}

}
