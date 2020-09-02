package Models;


public class Customer {
	private String nameCustommer;
	private String birthday;
	private String gender;
	private String idCard;
	private String phoneNumber;
	private String email;
	private String typeOfCustomer;
	private String address;
	private Services servicesUse;
	public Customer() {
		
	}
	public Customer(String nameCustommer, String birthday, String gender, String idCard, String phoneNumber,
			String email, String typeOfCustomer, String address) {
		this.nameCustommer = nameCustommer;
		this.birthday = birthday;
		this.gender = gender;
		this.idCard = idCard;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.typeOfCustomer = typeOfCustomer;
		this.address = address;
		
	}

	public String getNameCustommer() {
		return nameCustommer;
	}

	public void setNameCustommer(String nameCustommer) {
		this.nameCustommer = nameCustommer;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTypeOfCustomer() {
		return typeOfCustomer;
	}

	public void setTypeOfCustomer(String typeOfCustomer) {
		this.typeOfCustomer = typeOfCustomer;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Services getServicesUse() {
		return servicesUse;
	}

	public void setServicesUse(Services servicesUse) {
		this.servicesUse = servicesUse;
	}

	public String showInfor() {
		return				"Name of customer:"+this.getNameCustommer()
							+"\tBirthday:"+this.getBirthday()
							+"\tGender:"+this.getGender()
							+"\tId card:"+this.getIdCard()
							+"\tPhone Number:"+this.getPhoneNumber()
							+"\tEmail:"+this.getEmail()
							+"\tType of customer: "+this.getTypeOfCustomer()
							+"\tAddress:"+this.getAddress();
			
	}


	
}
