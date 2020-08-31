package Models;

public abstract class Services {
	protected String id;
	protected String nameServices;
	protected double usedArea;
	protected double rentCost;
	protected int numberOfPeople;
	protected String typeOfRent;
	
	public Services() {
	}
	
	public Services(String id, String nameServices, double usedArea, double rentCost, int numberOfPeople,
			String typeOfRent) {

		this.id = id;
		this.nameServices = nameServices;
		this.usedArea = usedArea;
		this.rentCost = rentCost;
		this.numberOfPeople = numberOfPeople;
		this.typeOfRent = typeOfRent;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNameServices() {
		return nameServices;
	}
	public void setNameServices(String nameServices) {
		this.nameServices = nameServices;
	}
	public double getUsedArea() {
		return usedArea;
	}
	public void setUsedArea(double usedArea) {
		this.usedArea = usedArea;
	}
	public double getRentCost() {
		return rentCost;
	}
	public void setRentCost(double rentCost) {
		this.rentCost = rentCost;
	}
	public int getNumberOfPeople() {
		return numberOfPeople;
	}
	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}
	public String getTypeOfRent() {
		return typeOfRent;
	}
	public void setTypeOfRent(String typeOfRent) {
		this.typeOfRent = typeOfRent;
	}
	abstract void showInfor();
}
