package Models;

public class Villa extends Services{
	
	private String standardRoom;
	private double poolArea;
	private int numberOfFloor;
	public Villa() {
		super();
		
	}
	public Villa( String nameServices,String id, double usedArea, double rentCost, int numberOfPeople,
			String typeOfRent,String standardRoom,double poolArea,int numberOfFloor) {
		super(nameServices,id,usedArea,rentCost,numberOfPeople,typeOfRent);
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
	public String showInfor() {
		return
				"name:"+super.getNameServices()+"\t"+
				"id:"+super.getId()+"\t"
				+"use area:"+super.getUsedArea()+"\t"
				+" rent cost:"+super.getRentCost()+"\t"
				+" number of people:"+super.getNumberOfPeople()+"\t"
				+" type of rent:"+super.getTypeOfRent()+"\t"
				+" standard room:"+this.getStandardRoom()+"\t"
				+"pool area:"+this.getPoolArea()+"\t"
				+"number of floor: "+this.getNumberOfFloor();
		
	}
	@Override
	public String toString() {
		return
				"name:"+this.getNameServices()+"\t"+
				"id:"+this.getId()+"\t"
				+"use area:"+this.getUsedArea()+"\t"
				+" rent cost:"+this.getRentCost()+"\t"
				+" number of people:"+this.getNumberOfPeople()+"\t"
				+" type of rent:"+this.getTypeOfRent()+"\t"
				+" standard room:"+this.getStandardRoom()+"\t"
				+"pool area:"+this.getPoolArea()+"\t"
				+"number of floor: "+this.getNumberOfFloor();
		
	}
	

}
