package BuilderPattern;

public class Member {
	private final String lastName;
	private final String firstName;
	private final int id;
	private final int age; // optional
    private final String phone; // optional
    private final String address; // optional
	
    
    //constructor
    public Member(MemberBuilder builder) {
    	this.firstName = builder.lastName;
    	this.lastName = builder.firstName;
    	this.id = builder.id;
    	this.age = builder.age;
    	this.phone = builder.phone;
    	this.address = builder.address;
    	
    }

	public String getLastName() {
		return lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public int getId() {
		return id;
	}


	public int getAge() {
		return age;
	}


	public String getPhone() {
		return phone;
	}


	public String getAddress() {
		return address;
	}
	
	

}
