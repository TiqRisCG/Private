package privatestudent;

public class privateStudent {

	private String name;
	
	
	public privateStudent(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "privateStudent [name=" + name + ", getName()=" + getName() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	/*public String toString() {
		return name;
	}*/
	
	
}
