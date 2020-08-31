package Models;

public class Villa extends Services{
	
	private String standardRoom;
	private double poolArea;
	private int numberOfFloor;
	public Villa() {
		super();
		
	}
	public Villa( String id,String nameServices, double usedArea, double rentCost, int numberOfPeople,
			String typeOfRent,String standardRoom,double poolArea,int numberOfFloor) {
		super(id,nameServices,usedArea,rentCost,numberOfPeople,typeOfRent);
		this.standardRoom = standardRoom;
		this.poolArea = poolArea;
		this.numberOfFloor = numberOfFloor;
	}

	public Villa(String standardRoom, double poolArea, int numberOfFloor) {
		super();
		this.standardRoom = standardRoom;
		this.poolArea = poolArea;
		this.numberOfFloor = numberOfFloor;
	}


	public String getStandardRoom() {
		return standardRoom;
	}


	public void setStandardRoom(String standardRoom) {
		this.standardRoom = standardRoom;
	}


	public double getPoolArea() {
		return poolArea;
	}


	public void setPoolArea(double poolArea) {
		this.poolArea = poolArea;
	}


	public int getNumberOfFloor() {
		return numberOfFloor;
	}


	public void setNumberOfFloor(int numberOfFloor) {
		this.numberOfFloor = numberOfFloor;
	}


	@Override
	void showInfor() {
		System.out.println(
				""+super.getNameServices()
				+""+super.getUsedArea()
				+""+super.getRentCost()
				+""+super.getNumberOfPeople()
				+""+super.getTypeOfRent()
				+""+this.getStandardRoom()
				+""+this.getPoolArea()
				+""+this.getNumberOfFloor() 
		);
		
	}

}
