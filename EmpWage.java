import java.util.Random;
public class EmpWage {
    public static void main(String arg[]){
        System.out.println("WELCOME to EMPLOYEE WAGE Computation");
        int empRatePerHr=20;
        int empHrs=0;
        int empWage=0;
        double employee=Math.random();
        if(employee>0.5)
        {
            System.out.println("Employee is Present");
            empHrs=8;
            empWage=(empHrs*empRatePerHr);
            System.out.println("Daily Wage is "+empWage);
        }
        else
        {
            System.out.println("Employee is Absent");
            empHrs=0;
            empWage=(empHrs*empRatePerHr);
            System.out.println("Daily Wage is "+empWage);
        }
    }
}
