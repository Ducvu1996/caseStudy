package Models;

public class Room extends Services{
	private String freeServiceIncluded;
	public Room() {
		super();
	}
	
	public Room(String nameServices, String id, double usedArea, double rentCost, int numberOfPeople,
			String typeOfRent,String freeServiceIncluded) {
		super(nameServices,id,usedArea,rentCost,numberOfPeople,typeOfRent);
		this.freeServiceIncluded = freeServiceIncluded;
	}

	public String getFreeServiceIncluded() {
		return freeServiceIncluded;
	}

	public void setFreeServiceIncluded(String freeServiceIncluded) {
		this.freeServiceIncluded = freeServiceIncluded;
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
				+" free service included:"+this.getFreeServiceIncluded();
						
		
		
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
				+" free service included:"+this.getFreeServiceIncluded();
						
		
		
	}

}
