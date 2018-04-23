
public abstract class Employee {

	protected int id;
	protected String name;
	
	public Employee(int id, String name) {
		
		this.id=id;
		this.name= name;
	}
	public int getid() {
		
		return id;
	}
	public void display() {
		
		System.out.println("id: "+id+"name: "+name);
		
	}
	public abstract  double calculateSalary();
	
	
}
