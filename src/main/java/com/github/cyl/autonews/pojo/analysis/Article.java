package com.github.cyl.autonews.pojo.analysis;

import java.util.List;

public class Article {
	private int year;
	private int month;
	private String title;
	private List<Section> sectinos;

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Section> getSectinos() {
		return sectinos;
	}

	public void setSectinos(List<Section> sectinos) {
		this.sectinos = sectinos;
	}

}
