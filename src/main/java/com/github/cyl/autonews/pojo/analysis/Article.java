package com.github.cyl.autonews.pojo.analysis;

import java.util.List;

public class Article {
	private int year;
	private int month;
	private String title;
	private List<Section> sections;

	public Article() {
	}

	public Article(int year, int month, String title) {
		this.year = year;
		this.month = month;
		this.title = title;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Section> getSections() {
		return sections;
	}

	public void setSectinos(List<Section> sections) {
		this.sections = sections;
	}

	@Override
	public String toString() {
		return "Article [year=" + year + ", month=" + month + ", title=" + title + ", sections=" + sections + "]";
	}

}
