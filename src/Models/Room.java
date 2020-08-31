package Models;

public class Room extends Services{
	private String freeServiceIncluded;
	public Room() {
		super();
	}
	
	public Room(String nameServices, String id, double usedArea, double rentCost, int numberOfPeople,
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
	public void showInfor() {
	
		System.out.println(
				"name:"+super.getNameServices()+"\t"+
				"id:"+super.getId()+"\t"
				+"use area:"+super.getUsedArea()+"\t"
				+" rent cost:"+super.getRentCost()+"\t"
				+" number of people:"+super.getNumberOfPeople()+"\t"
				+" type of rent:"+super.getTypeOfRent()+"\t"
				+" free service included:"+this.getFreeServiceIncluded()+"\t"
						
		);
		
	}

}
