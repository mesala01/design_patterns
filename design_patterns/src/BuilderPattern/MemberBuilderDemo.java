package BuilderPattern;

public class MemberBuilderDemo {

	public static void main(String[] args) {
		MemberBuilder builder = new MemberBuilder("Malovich", "Laura");
		/*
		 * Once a builder is instantiated and member built , we can set the optional values
		 * for  the member. Notice that value can only be added for a member 
		 * through the builder.
		 */
		builder.age(30)
		.phone("507-313-8976")
		.address("4000 College Dr, wilsonville, OR, 12345");
		Member mbr = builder.build();
		System.out.println(mbr.getAge());
		System.out.println(mbr.getFirstName());


	}

}
