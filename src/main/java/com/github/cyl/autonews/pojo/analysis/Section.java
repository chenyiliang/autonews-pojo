package com.github.cyl.autonews.pojo.analysis;

import java.util.List;

public class Section {
	private String subTitle;
	private List<Paragraph> paragraphs;

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public List<Paragraph> getParagraphs() {
		return paragraphs;
	}

	public void setParagraphs(List<Paragraph> paragraphs) {
		this.paragraphs = paragraphs;
	}

}
