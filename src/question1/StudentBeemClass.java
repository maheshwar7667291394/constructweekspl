package question1;

public class StudentBeemClass {
	private int roll;
	private String name;
	private String address;
	private int marks;
	
	public StudentBeemClass() {}

	public StudentBeemClass(int roll, String name, String address, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "StudentBeemClass [roll=" + roll + ", name=" + name + ", address=" + address + ", marks=" + marks + "]";
	};
	
   
	

}
