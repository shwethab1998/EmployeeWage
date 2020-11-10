public class EmpWage {
    public static void main(String arg[]){
        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION");
        int empRatePerHr=20;
        int is_Part_Time=2;
        int is_Full_Time=1;
        int empHrs=0;
        int empWage=0;
        double employee = (int)(( Math.random() * 10 ) % 3);
        if ( employee == is_Part_Time ) {
            System.out.println("Part Time  ");
            empHrs = 4;
        }
        else if (employee == is_Full_Time ) {
            System.out.println("Full Time ");
            empHrs = 8;
        }
        else {
            System.out.println("Employee is Absent ");
            empHrs = 0;
        }
            empWage=(empHrs*empRatePerHr);
            System.out.println("Employee Wage is "+empWage);
    }
}
