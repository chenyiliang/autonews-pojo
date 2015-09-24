package com.github.cyl.autonews.pojo.analysis;

import java.util.List;

import org.apdplat.word.segmentation.Word;

public class Sentence {
	private String sentence;
	private List<Clause> clauses;
	private List<Word> words;
	private int type;// 0-普通语句，1-余秋梅，2-摘选语录
	private double similarity;// 当type=2时，要显示这个相似度

	public Sentence() {
	}

	public Sentence(String sentence) {
		this.sentence = sentence;
	}

	public Sentence(String sentence, List<Clause> clauses) {
		this.sentence = sentence;
		this.clauses = clauses;
	}

	public Sentence(String sentence, List<Clause> clauses, List<Word> words) {
		this.sentence = sentence;
		this.clauses = clauses;
		this.words = words;
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

	public List<Word> getWords() {
		return words;
	}

	public void setWords(List<Word> words) {
		this.words = words;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public double getSimilarity() {
		return similarity;
	}

	public void setSimilarity(double similarity) {
		this.similarity = similarity;
	}

	@Override
	public String toString() {
		return "Sentence [sentence=" + sentence + ", clauses=" + clauses + ", words=" + words + ", type=" + type
				+ ", similarity=" + similarity + "]";
	}
}
