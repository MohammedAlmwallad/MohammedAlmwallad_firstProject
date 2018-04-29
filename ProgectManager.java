
public class ProgectManager extends Employee {
	
	private int nbProgects;
	
	public ProgectManager(int id, String name, int nbProgects) {
		super(id,name);
		this.nbProgects = nbProgects;
	}
	public ProgectManager(ProgectManager p) {
		
		super(p);
		this.nbProgects = p.nbProgects;
	}
	public int getNbProgects() {
		
		return nbProgects;
	}
	public void display() {
		super.display();
		System.out.println("nbprogects: "+nbProgects);
	}
	public double calculateSalary() {
		double b = 1000 * nbProgects;
		double salary = 30000 + b;
		
		return salary;
	}

}
