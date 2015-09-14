package com.github.cyl.autonews.pojo.indicator;

public class Indicator {
	// 字段名
	private String fieldName;
	// 环比 month-on-month
	private double mom;
	// 同比 year-on-year
	private double yoy;
	// 至当前时间，年平均
	private double yavg;

	public Indicator() {
		// TODO Auto-generated constructor stub
	}

	public Indicator(String fieldName, double mom, double yoy, double yavg) {
		this.fieldName = fieldName;
		this.mom = mom;
		this.yoy = yoy;
		this.yavg = yavg;
	}

	public Indicator(String fieldName, double mom, double yoy) {
		super();
		this.fieldName = fieldName;
		this.mom = mom;
		this.yoy = yoy;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public double getMom() {
		return mom;
	}

	public void setMom(double mom) {
		this.mom = mom;
	}

	public double getYoy() {
		return yoy;
	}

	public void setYoy(double yoy) {
		this.yoy = yoy;
	}

	public double getYavg() {
		return yavg;
	}

	public void setYavg(double yavg) {
		this.yavg = yavg;
	}

	public void setIndicator(Indicator indicator) {
		this.fieldName = indicator.fieldName;
		this.mom = indicator.mom;
		this.yoy = indicator.yoy;
		this.yavg = indicator.yavg;
	}
}
