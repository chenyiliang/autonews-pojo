package com.github.cyl.autonews.pojo.cpi.category;

import com.github.cyl.autonews.pojo.indicator.Indicator;

//认证
public class MeatPoultryAndProcessedProducts extends Indicator {
	private Indicator pork;
	private Indicator beef;
	private Indicator lamb;

	public Indicator getPork() {
		return pork;
	}

	public void setPork(Indicator pork) {
		this.pork = pork;
	}

	public Indicator getBeef() {
		return beef;
	}

	public void setBeef(Indicator beef) {
		this.beef = beef;
	}

	public Indicator getLamb() {
		return lamb;
	}

	public void setLamb(Indicator lamb) {
		this.lamb = lamb;
	}

}
