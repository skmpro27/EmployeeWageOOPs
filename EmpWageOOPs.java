
public class EmpWageOOPs {

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public final int WAGE_PER_HOUR;

	public EmpWageOOPs(int perHr) {

		System.out.println("Welcome to Employee Wages Computation Program");
		WAGE_PER_HOUR = perHr;
	}

	public int EmpWage() {

		int empHrs = 0;
		int empCheck = (int) (Math.random() * 3);
		if (empCheck == IS_FULL_TIME)
			empHrs = 8;
		else if (empCheck == IS_PART_TIME)
			empHrs = 4;
		else
			empHrs = 0;

		return empHrs * WAGE_PER_HOUR;
	}

	public static void main(String args[]) {

		EmpWageOOPs obj = new EmpWageOOPs(20);
		System.out.println("Employee daily wage: " + obj.EmpWage());
	}
}
