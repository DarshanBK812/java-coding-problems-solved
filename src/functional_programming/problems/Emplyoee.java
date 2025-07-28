package functional_programming.problems;

public class Emplyoee {

	private int employeeId;
	private String employeeName;
	private int age;
	private double sal;

	public Emplyoee(int employeeId, String employeeName, int age, double sal) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.age = age;
		this.sal = sal;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emplyoee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", age=" + age + ", sal=" + sal
				+ "]";
	}

}
