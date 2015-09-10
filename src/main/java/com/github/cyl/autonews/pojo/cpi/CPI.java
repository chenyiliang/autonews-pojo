package com.github.cyl.autonews.pojo.cpi;

import com.github.cyl.autonews.pojo.cpi.category.ClothingCPI;
import com.github.cyl.autonews.pojo.cpi.category.FoodCPI;
import com.github.cyl.autonews.pojo.cpi.category.HealthCareAndPersonalArticlesCPI;
import com.github.cyl.autonews.pojo.cpi.category.HouseholdFacilitiesArticlesAndServicesCPI;
import com.github.cyl.autonews.pojo.cpi.category.RecreationEducationAndCultureArticlesCPI;
import com.github.cyl.autonews.pojo.cpi.category.ResidenceCPI;
import com.github.cyl.autonews.pojo.cpi.category.TobaccoLiquorAndArticlesCPI;
import com.github.cyl.autonews.pojo.cpi.category.TransportationAndCommunicationCPI;
import com.github.cyl.autonews.pojo.cpi.indicator.Indicator;

public class CPI extends Indicator {
	private Indicator urbanHouseholdIndicator;
	private Indicator ruralHouseholdIndicator;

	private Indicator foodIndicator;
	private Indicator nonFoodIndicator;

	private Indicator consumerProductsIndicator;
	private Indicator serviceIndicator;

	private Indicator nonFoodAndEnergyIndicator;
	private Indicator nonVegetableAndFruitIndicator;

	private FoodCPI foodCPI;

	private TobaccoLiquorAndArticlesCPI tobaccoLiquorAndArticlesCPI;

	private ClothingCPI clothingCPI;

	private HouseholdFacilitiesArticlesAndServicesCPI householdFacilitiesArticlesAndServicesCPI;

	private HealthCareAndPersonalArticlesCPI healthCareAndPersonalArticlesCPI;

	private TransportationAndCommunicationCPI transportationAndCommunicationCPI;

	private RecreationEducationAndCultureArticlesCPI recreationEducationAndCultureArticlesCPI;

	private ResidenceCPI residenceCPI;

	public Indicator getUrbanHouseholdIndicator() {
		return urbanHouseholdIndicator;
	}

	public void setUrbanHouseholdIndicator(Indicator urbanHouseholdIndicator) {
		this.urbanHouseholdIndicator = urbanHouseholdIndicator;
	}

	public Indicator getRuralHouseholdIndicator() {
		return ruralHouseholdIndicator;
	}

	public void setRuralHouseholdIndicator(Indicator ruralHouseholdIndicator) {
		this.ruralHouseholdIndicator = ruralHouseholdIndicator;
	}

	public Indicator getFoodIndicator() {
		return foodIndicator;
	}

	public void setFoodIndicator(Indicator foodIndicator) {
		this.foodIndicator = foodIndicator;
	}

	public Indicator getNonFoodIndicator() {
		return nonFoodIndicator;
	}

	public void setNonFoodIndicator(Indicator nonFoodIndicator) {
		this.nonFoodIndicator = nonFoodIndicator;
	}

	public Indicator getConsumerProductsIndicator() {
		return consumerProductsIndicator;
	}

	public void setConsumerProductsIndicator(Indicator consumerProductsIndicator) {
		this.consumerProductsIndicator = consumerProductsIndicator;
	}

	public Indicator getServiceIndicator() {
		return serviceIndicator;
	}

	public void setServiceIndicator(Indicator serviceIndicator) {
		this.serviceIndicator = serviceIndicator;
	}

	public Indicator getNonFoodAndEnergyIndicator() {
		return nonFoodAndEnergyIndicator;
	}

	public void setNonFoodAndEnergyIndicator(Indicator nonFoodAndEnergyIndicator) {
		this.nonFoodAndEnergyIndicator = nonFoodAndEnergyIndicator;
	}

	public Indicator getNonVegetableAndFruitIndicator() {
		return nonVegetableAndFruitIndicator;
	}

	public void setNonVegetableAndFruitIndicator(
			Indicator nonVegetableAndFruitIndicator) {
		this.nonVegetableAndFruitIndicator = nonVegetableAndFruitIndicator;
	}

	public FoodCPI getFoodCPI() {
		return foodCPI;
	}

	public void setFoodCPI(FoodCPI foodCPI) {
		this.foodCPI = foodCPI;
	}

	public TobaccoLiquorAndArticlesCPI getTobaccoLiquorAndArticlesCPI() {
		return tobaccoLiquorAndArticlesCPI;
	}

	public void setTobaccoLiquorAndArticlesCPI(
			TobaccoLiquorAndArticlesCPI tobaccoLiquorAndArticlesCPI) {
		this.tobaccoLiquorAndArticlesCPI = tobaccoLiquorAndArticlesCPI;
	}

	public ClothingCPI getClothingCPI() {
		return clothingCPI;
	}

	public void setClothingCPI(ClothingCPI clothingCPI) {
		this.clothingCPI = clothingCPI;
	}

	public HouseholdFacilitiesArticlesAndServicesCPI getHouseholdFacilitiesArticlesAndServicesCPI() {
		return householdFacilitiesArticlesAndServicesCPI;
	}

	public void setHouseholdFacilitiesArticlesAndServicesCPI(
			HouseholdFacilitiesArticlesAndServicesCPI householdFacilitiesArticlesAndServicesCPI) {
		this.householdFacilitiesArticlesAndServicesCPI = householdFacilitiesArticlesAndServicesCPI;
	}

	public HealthCareAndPersonalArticlesCPI getHealthCareAndPersonalArticlesCPI() {
		return healthCareAndPersonalArticlesCPI;
	}

	public void setHealthCareAndPersonalArticlesCPI(
			HealthCareAndPersonalArticlesCPI healthCareAndPersonalArticlesCPI) {
		this.healthCareAndPersonalArticlesCPI = healthCareAndPersonalArticlesCPI;
	}

	public TransportationAndCommunicationCPI getTransportationAndCommunicationCPI() {
		return transportationAndCommunicationCPI;
	}

	public void setTransportationAndCommunicationCPI(
			TransportationAndCommunicationCPI transportationAndCommunicationCPI) {
		this.transportationAndCommunicationCPI = transportationAndCommunicationCPI;
	}

	public RecreationEducationAndCultureArticlesCPI getRecreationEducationAndCultureArticlesCPI() {
		return recreationEducationAndCultureArticlesCPI;
	}

	public void setRecreationEducationAndCultureArticlesCPI(
			RecreationEducationAndCultureArticlesCPI recreationEducationAndCultureArticlesCPI) {
		this.recreationEducationAndCultureArticlesCPI = recreationEducationAndCultureArticlesCPI;
	}

	public ResidenceCPI getResidenceCPI() {
		return residenceCPI;
	}

	public void setResidenceCPI(ResidenceCPI residenceCPI) {
		this.residenceCPI = residenceCPI;
	}

}
