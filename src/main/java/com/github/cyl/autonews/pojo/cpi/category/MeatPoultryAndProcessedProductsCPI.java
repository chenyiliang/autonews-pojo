package com.github.cyl.autonews.pojo.cpi.category;

import com.github.cyl.autonews.pojo.cpi.indicator.Indicator;

//认证
public class MeatPoultryAndProcessedProductsCPI extends Indicator {
	private Indicator porkIndicator;
	private Indicator beefIndicator;
	private Indicator lambIndicator;

	public Indicator getPorkIndicator() {
		return porkIndicator;
	}

	public void setPorkIndicator(Indicator porkIndicator) {
		this.porkIndicator = porkIndicator;
	}

	public Indicator getBeefIndicator() {
		return beefIndicator;
	}

	public void setBeefIndicator(Indicator beefIndicator) {
		this.beefIndicator = beefIndicator;
	}

	public Indicator getLambIndicator() {
		return lambIndicator;
	}

	public void setLambIndicator(Indicator lambIndicator) {
		this.lambIndicator = lambIndicator;
	}

}
