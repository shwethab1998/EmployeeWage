public class EmpWage {
    public static final int noOfDayInMonth=20;
    public static final int empRatePerHr=20;
    public static final int is_Part_Time=1;
    public static final int is_Full_Time=2;

    public static void main(String arg[]) {

        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION");
	int absent=0;
        int empHrs = 0;
        int empWage = 0;
        int empWageForMonth=0;

        for ( int day = 1; day <= noOfDayInMonth; day++ ) {

            int employee = (int) ((Math.random() * 10) % 3);

            switch (employee) {
                case is_Part_Time:
                    empHrs = 4;
                    break;
                case is_Full_Time:
                    empHrs = 8;
                    break;
                default:
                    absent=absent+1;
                    empHrs = 0;
            }
            empWage = (empHrs * empRatePerHr);
            empWageForMonth = (empWageForMonth+empWage);
        }
	System.out.println("Employee was absent for "+absent+" days");
        System.out.println("Employee Wage of Month is : " + empWageForMonth);

    }
}
