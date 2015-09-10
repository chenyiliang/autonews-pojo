package com.github.cyl.autonews.pojo.cpi.indicator;

public class Indicator {
	// 环比 month-on-month
	private float mom;
	// 同比 year-on-year
	private float yoy;
	// 至当前时间，年平均
	private float yavg;

	public float getMom() {
		return mom;
	}

	public void setMom(float mom) {
		this.mom = mom;
	}

	public float getYoy() {
		return yoy;
	}

	public void setYoy(float yoy) {
		this.yoy = yoy;
	}

	public float getYavg() {
		return yavg;
	}

	public void setYavg(float yavg) {
		this.yavg = yavg;
	}

}
