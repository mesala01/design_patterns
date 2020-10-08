package BuilderPattern;
import java.math.*;

public class MemberBuilder {
	public final String lastName;
	public final String firstName;
	public final int id;
	public int age; // optional
	public String phone; // optional
	public String address; // optional
    
    /*Constructor: takes only the required info to 
     * create a new member
     */
	
	public MemberBuilder(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.id = (int) Math.random();
	}
	
	 // Sets an age for an existing member
	 public MemberBuilder age(int age) {
         this.age = age;
         return this;
     }
	 
	 //Sets a phone for an existing member
     public MemberBuilder phone(String phone) {
         this.phone = phone;
         return this;
     }
     
     //Sets an address for an existing member
     public MemberBuilder address(String address) {
         this.address = address;
         return this;
     }
     
     //Creates a new member
     public Member build() {
         Member user =  new Member(this);
         return user;
     }
     
     
    
    

	

}
