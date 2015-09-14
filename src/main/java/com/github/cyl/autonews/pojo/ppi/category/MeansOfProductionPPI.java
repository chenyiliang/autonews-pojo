package com.github.cyl.autonews.pojo.ppi.category;

import com.github.cyl.autonews.pojo.indicator.Indicator;

public class MeansOfProductionPPI extends Indicator {
	private Indicator miningAndQuarryingIndustry;// 采掘
	private Indicator rawMaterialsIndustry;// 原材料
	private Indicator processingIndustry;// 加工

	public Indicator getMiningAndQuarryingIndustry() {
		return miningAndQuarryingIndustry;
	}

	public void setMiningAndQuarryingIndustry(
			Indicator miningAndQuarryingIndustry) {
		this.miningAndQuarryingIndustry = miningAndQuarryingIndustry;
	}

	public Indicator getRawMaterialsIndustry() {
		return rawMaterialsIndustry;
	}

	public void setRawMaterialsIndustry(Indicator rawMaterialsIndustry) {
		this.rawMaterialsIndustry = rawMaterialsIndustry;
	}

	public Indicator getProcessingIndustry() {
		return processingIndustry;
	}

	public void setProcessingIndustry(Indicator processingIndustry) {
		this.processingIndustry = processingIndustry;
	}

}
