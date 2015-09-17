package com.github.cyl.autonews.pojo.analysis;

import java.util.List;

public class Paragraph {
	private List<Sentence> sentences;

	public Paragraph() {
	}

	public Paragraph(List<Sentence> sentences) {
		this.sentences = sentences;
	}

	public List<Sentence> getSentences() {
		return sentences;
	}

	public void setSentences(List<Sentence> sentences) {
		this.sentences = sentences;
	}

	@Override
	public String toString() {
		return "Paragraph [sentences=" + sentences + "]";
	}

}
