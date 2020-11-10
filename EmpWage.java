public class EmpWage {
    public static final int maxHrsInMonth=100;
    public static final int noOfWorkDay=20;
    public static final int empRatePerHr=20;
    public static final int is_Part_Time=1;
    public static final int is_Full_Time=2;

    public static void main(String arg[]) {

        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION");
	int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkDay=0;
        int totalEmpWage=0;
	while( totalWorkDay < noOfWorkDay && totalEmpHrs <= maxHrsInMonth ) {

            int employee = (int) ((Math.random() * 10) % 3);

            switch (employee) {
                case is_Part_Time:
                    empHrs = 4;
                    break;
                case is_Full_Time:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalWorkDay++;
            totalEmpHrs = totalEmpHrs + empHrs;
            }
    totalEmpWage = ( totalEmpHrs * empRatePerHr );
    System.out.println("Employee days:" + totalWorkDay+" Days");
    System.out.println("Hours Worked: "+totalEmpHrs+" hrs");
    System.out.println("Employee Total Salary is :"+ totalEmpWage+" Rs");
    }
}
