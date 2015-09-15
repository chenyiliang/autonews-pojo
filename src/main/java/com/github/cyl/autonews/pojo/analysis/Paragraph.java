package com.github.cyl.autonews.pojo.analysis;

import java.util.List;

public class Paragraph {
	private List<String> sentences;

	public Paragraph() {
		// TODO Auto-generated constructor stub
	}

	public Paragraph(List<String> sentences) {
		this.sentences = sentences;
	}

	public List<String> getSentences() {
		return sentences;
	}

	public void setSentences(List<String> sentences) {
		this.sentences = sentences;
	}

	@Override
	public String toString() {
		return "Paragraph [sentences=" + sentences + "]";
	}

}
