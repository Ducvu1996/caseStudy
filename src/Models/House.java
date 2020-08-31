package Models;

public class House extends Services{
	private String standardRoom;
	private int numberOfFloor;
	public House() {
		super();

	}
	public House( String id,String nameServices, double usedArea, double rentCost, int numberOfPeople,
			String typeOfRent,String standardRoom,int numberOfFloor) {
		super(id,nameServices,usedArea,rentCost,numberOfPeople,typeOfRent);
		this.standardRoom = standardRoom;
		this.numberOfFloor = numberOfFloor;
	}
	public String getStandardRoom() {
		return standardRoom;
	}

	public void setStandardRoom(String standardRoom) {
		this.standardRoom = standardRoom;
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
				+""+this.getNumberOfFloor() 
		);
		
	}

}
