package com.github.cyl.autonews.pojo.cpi.category;

import com.github.cyl.autonews.pojo.cpi.indicator.Indicator;

//认证
public class TobaccoLiquorAndArticlesCPI extends Indicator {
	private Indicator tobaccoIndicator;// 认证
	private Indicator liquorIndicator;// 认证

	public Indicator getTobaccoIndicator() {
		return tobaccoIndicator;
	}

	public void setTobaccoIndicator(Indicator tobaccoIndicator) {
		this.tobaccoIndicator = tobaccoIndicator;
	}

	public Indicator getLiquorIndicator() {
		return liquorIndicator;
	}

	public void setLiquorIndicator(Indicator liquorIndicator) {
		this.liquorIndicator = liquorIndicator;
	}

}
