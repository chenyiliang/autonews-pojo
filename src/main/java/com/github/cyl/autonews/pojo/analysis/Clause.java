package com.github.cyl.autonews.pojo.analysis;

import java.util.List;

import org.apdplat.word.segmentation.Word;

public class Clause {
	private String clause;
	private List<Word> words;
	private int type;

	public Clause() {

	}

	public Clause(String clause) {
		this.clause = clause;
	}

	public Clause(String clause, int type) {
		this.clause = clause;
		this.type = type;
	}

	public Clause(String clause, List<Word> words, int type) {
		this.clause = clause;
		this.words = words;
		this.type = type;
	}

	public String getClause() {
		return clause;
	}

	public void setClause(String clause) {
		this.clause = clause;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public List<Word> getWords() {
		return words;
	}

	public void setWords(List<Word> words) {
		this.words = words;
	}

	@Override
	public String toString() {
		return "Clause [clause=" + clause + ", type=" + type + "]";
	}

}
