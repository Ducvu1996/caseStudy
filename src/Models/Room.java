package Models;

public class Room extends Services{
	private String freeServiceIncluded;
	public Room() {
		super();
	}
	
	public Room( String id,String nameServices, double usedArea, double rentCost, int numberOfPeople,
			String typeOfRent,String freeServiceIncluded) {
		super(id,nameServices,usedArea,rentCost,numberOfPeople,typeOfRent);
		this.freeServiceIncluded = freeServiceIncluded;
	}

	public String getFreeServiceIncluded() {
		return freeServiceIncluded;
	}

	public void setFreeServiceIncluded(String freeServiceIncluded) {
		this.freeServiceIncluded = freeServiceIncluded;
	}

	

	@Override
	void showInfor() {
	
		System.out.println(
				""+super.getNameServices()
				+""+super.getUsedArea()
				+""+super.getRentCost()
				+""+super.getNumberOfPeople()
				+""+super.getTypeOfRent()
				+""+this.getFreeServiceIncluded()
		);
		
	}

}
