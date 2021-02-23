
public class EmpWageOOPs {

	public static final int IS_EMPLOYEE_PRESENT = 1;
	public final int WAGE_PER_HOUR;

	public EmpWageOOPs(int perHr) {

		System.out.println("Welcome to Employee Wages Computation Program");
		WAGE_PER_HOUR = perHr;
	}

	public int EmpWage() {

		int empHrs = 0;
		int empCheck = (int) (Math.random() * 2);
		if (empCheck == IS_EMPLOYEE_PRESENT)
			empHrs = 8;
		else
			empHrs = 0;
		return empHrs * WAGE_PER_HOUR;
	}

	public static void main(String args[]) {

		EmpWageOOPs obj = new EmpWageOOPs(20);
		System.out.println("Employee daily wage: " + obj.EmpWage());
	}
}
