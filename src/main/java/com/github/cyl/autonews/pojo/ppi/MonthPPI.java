package com.github.cyl.autonews.pojo.ppi;

public class MonthPPI extends PPI {
	private int year;
	private int month;

	public MonthPPI() {
	}

	public MonthPPI(int year, int month) {
		this.year = year;
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

}
