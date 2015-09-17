package com.github.cyl.autonews.pojo.analysis;

public class Clause {
	private String clause;
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

	@Override
	public String toString() {
		return "Clause [clause=" + clause + ", type=" + type + "]";
	}

}
