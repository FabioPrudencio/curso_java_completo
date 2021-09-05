package entities;

public class Employee {
	
	private Integer id;
	private String name;
	private Double salary;
	private Integer hours;
	private Double valuePerHour;
	
	public Employee(){		
	}
	
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Employee(String name, Integer hours, Double valuePerHour) {
		super();
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}
	

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public void increaseSalary(Double percentage) {
		salary += salary * (percentage / 100);		
	}
	
	public String toString() {
		return id + ", " + name + String.format(", %.2f%n", salary);
	}
	
	public Double payment() {
		return getHours() * getValuePerHour();
	}	
}
