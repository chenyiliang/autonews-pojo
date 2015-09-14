package com.github.cyl.autonews.pojo.cpi;

import com.github.cyl.autonews.pojo.cpi.category.Clothing;
import com.github.cyl.autonews.pojo.cpi.category.Food;
import com.github.cyl.autonews.pojo.cpi.category.HealthCareAndPersonalArticles;
import com.github.cyl.autonews.pojo.cpi.category.HouseholdFacilitiesArticlesAndServices;
import com.github.cyl.autonews.pojo.cpi.category.RecreationEducationAndCultureArticles;
import com.github.cyl.autonews.pojo.cpi.category.Residence;
import com.github.cyl.autonews.pojo.cpi.category.TobaccoLiquorAndArticles;
import com.github.cyl.autonews.pojo.cpi.category.TransportationAndCommunication;
import com.github.cyl.autonews.pojo.indicator.Indicator;

public class CPI extends Indicator {
	private Indicator urbanHousehold;
	private Indicator ruralHousehold;

	private Indicator nonFood;

	private Indicator consumerProducts;
	private Indicator service;

	private Indicator nonFoodAndEnergy;
	private Indicator nonVegetableAndFruit;

	private Food food;

	private TobaccoLiquorAndArticles tobaccoLiquorAndArticles;

	private Clothing clothing;

	private HouseholdFacilitiesArticlesAndServices householdFacilitiesArticlesAndServices;

	private HealthCareAndPersonalArticles healthCareAndPersonalArticles;

	private TransportationAndCommunication transportationAndCommunication;

	private RecreationEducationAndCultureArticles recreationEducationAndCultureArticles;

	private Residence residence;

	public Indicator getUrbanHousehold() {
		return urbanHousehold;
	}

	public void setUrbanHousehold(Indicator urbanHousehold) {
		this.urbanHousehold = urbanHousehold;
	}

	public Indicator getRuralHousehold() {
		return ruralHousehold;
	}

	public void setRuralHousehold(Indicator ruralHousehold) {
		this.ruralHousehold = ruralHousehold;
	}

	public Indicator getNonFood() {
		return nonFood;
	}

	public void setNonFood(Indicator nonFood) {
		this.nonFood = nonFood;
	}

	public Indicator getConsumerProducts() {
		return consumerProducts;
	}

	public void setConsumerProducts(Indicator consumerProducts) {
		this.consumerProducts = consumerProducts;
	}

	public Indicator getService() {
		return service;
	}

	public void setService(Indicator service) {
		this.service = service;
	}

	public Indicator getNonFoodAndEnergy() {
		return nonFoodAndEnergy;
	}

	public void setNonFoodAndEnergy(Indicator nonFoodAndEnergy) {
		this.nonFoodAndEnergy = nonFoodAndEnergy;
	}

	public Indicator getNonVegetableAndFruit() {
		return nonVegetableAndFruit;
	}

	public void setNonVegetableAndFruit(Indicator nonVegetableAndFruit) {
		this.nonVegetableAndFruit = nonVegetableAndFruit;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public TobaccoLiquorAndArticles getTobaccoLiquorAndArticles() {
		return tobaccoLiquorAndArticles;
	}

	public void setTobaccoLiquorAndArticles(
			TobaccoLiquorAndArticles tobaccoLiquorAndArticles) {
		this.tobaccoLiquorAndArticles = tobaccoLiquorAndArticles;
	}

	public Clothing getClothing() {
		return clothing;
	}

	public void setClothing(Clothing clothing) {
		this.clothing = clothing;
	}

	public HouseholdFacilitiesArticlesAndServices getHouseholdFacilitiesArticlesAndServices() {
		return householdFacilitiesArticlesAndServices;
	}

	public void setHouseholdFacilitiesArticlesAndServices(
			HouseholdFacilitiesArticlesAndServices householdFacilitiesArticlesAndServices) {
		this.householdFacilitiesArticlesAndServices = householdFacilitiesArticlesAndServices;
	}

	public HealthCareAndPersonalArticles getHealthCareAndPersonalArticles() {
		return healthCareAndPersonalArticles;
	}

	public void setHealthCareAndPersonalArticles(
			HealthCareAndPersonalArticles healthCareAndPersonalArticles) {
		this.healthCareAndPersonalArticles = healthCareAndPersonalArticles;
	}

	public TransportationAndCommunication getTransportationAndCommunication() {
		return transportationAndCommunication;
	}

	public void setTransportationAndCommunication(
			TransportationAndCommunication transportationAndCommunication) {
		this.transportationAndCommunication = transportationAndCommunication;
	}

	public RecreationEducationAndCultureArticles getRecreationEducationAndCultureArticles() {
		return recreationEducationAndCultureArticles;
	}

	public void setRecreationEducationAndCultureArticles(
			RecreationEducationAndCultureArticles recreationEducationAndCultureArticles) {
		this.recreationEducationAndCultureArticles = recreationEducationAndCultureArticles;
	}

	public Residence getResidence() {
		return residence;
	}

	public void setResidence(Residence residence) {
		this.residence = residence;
	}

}
