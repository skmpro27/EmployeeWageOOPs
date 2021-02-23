
public class EmpWageOOPs {

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public final int WAGE_PER_HOUR;

	public EmpWageOOPs(int perHr) {

		System.out.println("Welcome to Employee Wages Computation Program");
		WAGE_PER_HOUR = perHr;
	}

	public int EmpWageMonth() {

		int empHrs = 0;
		for (int i = 0; i < 20; i++)
		{
			int empCheck = (int) (Math.random() * 3);
			switch (empCheck)
			{
				case IS_FULL_TIME:
					empHrs += 8;
					break;

				case IS_PART_TIME:
					empHrs += 4;
					break;

				default:
			}
		}
		return empHrs * WAGE_PER_HOUR;
	}

	public static void main(String args[]) {

		EmpWageOOPs obj = new EmpWageOOPs(20);
		System.out.println("Employee wages for a month: " + obj.EmpWageMonth());
	}
}
