import java.util.Random;
public class EmpWage {
	public static final int empRatePerHr=20;
    public static final int is_Part_Time=2;
    public static final int is_Full_Time=1;
    public static void main(String arg[]){
        System.out.println("WELCOME to EMPLOYEE WAGE Computation");
        int empRatePerHr=20;
        int empHrs=0;
        int empWage=0;
        int employee=(int)(( Math.random()*10)%3);
        switch(employee){
            case is_Part_Time:
                System.out.println("Part Time  ");
                empHrs = 4;
                break;
            case is_Full_Time:
                System.out.println("Full Time ");
                empHrs = 8;
                break;
            default:
                System.out.println("Employee is Absent ");
                empHrs = 0;
        }
            empWage=(empHrs*empRatePerHr);
            System.out.println("Employee Wage is "+empWage);
    }
}
