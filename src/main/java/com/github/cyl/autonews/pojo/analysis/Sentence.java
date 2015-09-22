package com.github.cyl.autonews.pojo.analysis;

import java.util.List;

public class Sentence {
	private String sentence;
	private List<Clause> clauses;
	private List<String> terms;
	private int type;

	public Sentence() {
	}

	public Sentence(String sentence) {
		this.sentence = sentence;
	}

	public Sentence(String sentence, List<Clause> clauses) {
		this.sentence = sentence;
		this.clauses = clauses;
	}

	public Sentence(String sentence, List<Clause> clauses, List<String> terms) {
		this.sentence = sentence;
		this.clauses = clauses;
		this.terms = terms;
	}

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	public List<Clause> getClauses() {
		return clauses;
	}

	public void setClauses(List<Clause> clauses) {
		this.clauses = clauses;
	}

	public List<String> getTerms() {
		return terms;
	}

	public void setTerms(List<String> terms) {
		this.terms = terms;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Sentence [sentence=" + sentence + ", clauses=" + clauses + ", terms=" + terms + ", type=" + type + "]";
	}

}
