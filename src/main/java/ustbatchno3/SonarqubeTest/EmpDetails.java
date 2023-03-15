package ustbatchno3.SonarqubeTest;

public class EmpDetails {

	private  String emp_name;
	private int age;
	private int exprnc;
	private double salary;
	/**
	 * @param emp_name
	 * @param age
	 * @param exprnc
	 * @param salary
	 */
	public EmpDetails(String emp_name, int age, int exprnc, double salary) {
		super();
		this.emp_name = emp_name;
		this.age = age;
		this.exprnc = exprnc;
		this.salary = salary;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getExprnc() {
		return exprnc;
	}
	@Override
	public String toString() {
		return "EmpDetails [emp_name=" + emp_name + ", age=" + age + ", exprnc=" + exprnc + ", salary=" + salary + "]";
	}
	public void setExprnc(int exprnc) {
		this.exprnc = exprnc;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
