package com.github.cyl.autonews.pojo.cpi;

public class MonthCPI extends Indicator {
	private int year;
	private int month;

	private Indicator foodIndicator;
	private Indicator nonFoodIndicator;

	private Indicator consumerGoodsIndicator;
	private Indicator serviceIndicator;

	private Indicator nonFoodAndEnergyIndicator;
	private Indicator nonVegetableAndFruitIndicator;

	private FoodCPI foodCPI;

	private TobaccoAndAlcoholCPI tobaccoAndAlcoholCPI;

	private ClothesCPI clothesCPI;

	private HouseholdEquipmentAndMaintenanceServicesCPI householdEquipmentAndMaintenanceServicesCPI;

	private HealthCareAndPersonalProductsCPI healthCareAndPersonalProductsCPI;

	private TransportAndCommunicationsCPI transportAndCommunicationsCPI;

	private EntertainmentAndEducationalProductsOrServicesCPI educationalProductsOrServicesCPI;

	private InhabitationCPI inhabitationCPI;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
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

	public Indicator getConsumerGoodsIndicator() {
		return consumerGoodsIndicator;
	}

	public void setConsumerGoodsIndicator(Indicator consumerGoodsIndicator) {
		this.consumerGoodsIndicator = consumerGoodsIndicator;
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

	public TobaccoAndAlcoholCPI getTobaccoAndAlcoholCPI() {
		return tobaccoAndAlcoholCPI;
	}

	public void setTobaccoAndAlcoholCPI(
			TobaccoAndAlcoholCPI tobaccoAndAlcoholCPI) {
		this.tobaccoAndAlcoholCPI = tobaccoAndAlcoholCPI;
	}

	public ClothesCPI getClothesCPI() {
		return clothesCPI;
	}

	public void setClothesCPI(ClothesCPI clothesCPI) {
		this.clothesCPI = clothesCPI;
	}

	public HouseholdEquipmentAndMaintenanceServicesCPI getHouseholdEquipmentAndMaintenanceServicesCPI() {
		return householdEquipmentAndMaintenanceServicesCPI;
	}

	public void setHouseholdEquipmentAndMaintenanceServicesCPI(
			HouseholdEquipmentAndMaintenanceServicesCPI householdEquipmentAndMaintenanceServicesCPI) {
		this.householdEquipmentAndMaintenanceServicesCPI = householdEquipmentAndMaintenanceServicesCPI;
	}

	public HealthCareAndPersonalProductsCPI getHealthCareAndPersonalProductsCPI() {
		return healthCareAndPersonalProductsCPI;
	}

	public void setHealthCareAndPersonalProductsCPI(
			HealthCareAndPersonalProductsCPI healthCareAndPersonalProductsCPI) {
		this.healthCareAndPersonalProductsCPI = healthCareAndPersonalProductsCPI;
	}

	public TransportAndCommunicationsCPI getTransportAndCommunicationsCPI() {
		return transportAndCommunicationsCPI;
	}

	public void setTransportAndCommunicationsCPI(
			TransportAndCommunicationsCPI transportAndCommunicationsCPI) {
		this.transportAndCommunicationsCPI = transportAndCommunicationsCPI;
	}

	public EntertainmentAndEducationalProductsOrServicesCPI getEducationalProductsOrServicesCPI() {
		return educationalProductsOrServicesCPI;
	}

	public void setEducationalProductsOrServicesCPI(
			EntertainmentAndEducationalProductsOrServicesCPI educationalProductsOrServicesCPI) {
		this.educationalProductsOrServicesCPI = educationalProductsOrServicesCPI;
	}

	public InhabitationCPI getInhabitationCPI() {
		return inhabitationCPI;
	}

	public void setInhabitationCPI(InhabitationCPI inhabitationCPI) {
		this.inhabitationCPI = inhabitationCPI;
	}

}
