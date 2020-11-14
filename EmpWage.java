import java.util.*;
public class EmpWage {
	public static final int isPartTime=1;
    public static final int isFullTime=2;
    static String company;
    static int ratePerHour;
    static int days;
    static int maxHours;
    static int totalWage;
    EmpWage(String company,int ratePerHour,int days,int maxHours)
    {
        this.company=company;
	this.ratePerHour=ratePerHour;
        this.days=days;
        this.maxHours=maxHours;
    }
    public static int getWorkingHours(int check)
    {
        int hours;
        switch(check)
        {
            case 2:
                hours=8;
                break;
            case 1:
                hours=4;
                break;
            default:
                hours=0;
                break;
        }
        return hours;
    }
    public static int attendanceCheck()
    {
        int result=(int)Math.floor((Math.random()*10)%3);
        return result;
    }
    public static void print(int totalDays,int workHours,int totalHours,int dailySalary,int totalSalary)
    {
        System.out.println(totalDays+"\t"+workHours+"\t\t"+totalHours+"\t\t"+dailySalary+"\t\t"+totalSalary);
    }
    public static void employeeWages()
    {
        int check=0,workHours=0,dailySalary=0,totalSalary=0,totalHours=0,totalDays=0;
        System.out.println("Day\tDaily Hours\tTotal Hours\tDaily Wage\tTotal Wage");
	while(totalHours<maxHours && totalDays<days)
        {
            totalDays+=1;
            check=attendanceCheck();
            workHours=getWorkingHours(check);
            totalHours=totalHours+workHours;
            dailySalary=workHours*ratePerHour;
            totalSalary=totalHours*ratePerHour;
            print(totalDays,workHours,totalHours,dailySalary,totalSalary);
        }
        totalWage= totalSalary;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of companies:");
		int n=sc.nextInt();
		for(int counter=1;counter<=n;counter++)
		{
			System.out.println("Enter name of company:");
			String company=sc.next();
			System.out.println("Enter rate per hour:");
			int ratePerHour=sc.nextInt();
			System.out.println("Enter number of working days:");
			int days=sc.nextInt();
			System.out.println("Enter maximum working hours:");
			int maxHours=sc.nextInt();
			EmpWage companyname=new EmpWage(company,ratePerHour,days,maxHours);
			companyname.employeeWages();
			System.out.println("Employee wage in company "+companyname.company+" is "+companyname.totalWage);
		}
	}
}
