package com.github.cyl.autonews.pojo.ppi.category;

import com.github.cyl.autonews.pojo.indicator.Indicator;

public class ConsumerGoods extends Indicator {
	private Indicator food;// 食品
	private Indicator clothing;// 衣着
	private Indicator articlesForDailyUse;// 一般日用品
	private Indicator durableConsumerGoods;// 耐用消费品

	public Indicator getFood() {
		return food;
	}

	public void setFood(Indicator food) {
		this.food = food;
	}

	public Indicator getClothing() {
		return clothing;
	}

	public void setClothing(Indicator clothing) {
		this.clothing = clothing;
	}

	public Indicator getArticlesForDailyUse() {
		return articlesForDailyUse;
	}

	public void setArticlesForDailyUse(Indicator articlesForDailyUse) {
		this.articlesForDailyUse = articlesForDailyUse;
	}

	public Indicator getDurableConsumerGoods() {
		return durableConsumerGoods;
	}

	public void setDurableConsumerGoods(Indicator durableConsumerGoods) {
		this.durableConsumerGoods = durableConsumerGoods;
	}

}
