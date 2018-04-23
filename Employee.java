
public abstract class Employee {

	protected int id;
	protected String name;
	
	public Employee(int id, String name) {
		
		this.id=id;
		this.name= name;
	}
	public Employee(Employee e) {
		this.id = e.id;
		this.name = e.name;
	}
	public int getid() {
		
		return id;
	}
	public void display() {
		
		System.out.println("id: "+id);
		System.out.println("name: "+name);
	}
	public abstract  double calculateSalary();
	
	
}
