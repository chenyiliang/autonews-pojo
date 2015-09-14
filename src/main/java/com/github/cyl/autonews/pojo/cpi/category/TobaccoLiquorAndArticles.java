package com.github.cyl.autonews.pojo.cpi.category;

import com.github.cyl.autonews.pojo.indicator.Indicator;

//认证
public class TobaccoLiquorAndArticles extends Indicator {
	private Indicator tobacco;// 认证
	private Indicator liquor;// 认证

	public Indicator getTobacco() {
		return tobacco;
	}

	public void setTobacco(Indicator tobacco) {
		this.tobacco = tobacco;
	}

	public Indicator getLiquor() {
		return liquor;
	}

	public void setLiquor(Indicator liquor) {
		this.liquor = liquor;
	}

}
