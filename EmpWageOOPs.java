
public class EmpWageOOPs {

	public static final int IS_EMPLOYEE_PRESENT = 1;

	public EmpWageOOPs() {

		System.out.println("Welcome to Employee Wages Computation Program");
	}

	public void IsEmpPresent() {

		int empCheck = (int) (Math.random() * 2);
		if (empCheck == IS_EMPLOYEE_PRESENT)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}

	public static void main(String args[]) {

		EmpWageOOPs obj = new EmpWageOOPs();
		obj.IsEmpPresent();

	}
}
