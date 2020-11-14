import java.util.*;
public class employeeWage implements iEmployeeWage
{
	int counter=0;
	int numberOfCompanies;
	ArrayList<companyEmployeeWage> companyEmployeeWageList;
	employeeWage(int n)
	{
		this.numberOfCompanies=n;
		companyEmployeeWageList=new ArrayList<companyEmployeeWage>();
	}
	public void addCompany(String company,int ratePerHour,int days,int maxHours)
	{
		companyEmployeeWage companyempwage=new companyEmployeeWage(company,ratePerHour,days,maxHours);
		companyEmployeeWageList.add(companyempwage);
	}
	public void computeWages()
	{
		for(int i=0;i<companyEmployeeWageList.size();i++)
		{
			companyEmployeeWage companyempwage=companyEmployeeWageList.get(i);
			companyempwage.setTotalWage(this.employeeWages(companyempwage));
			System.out.println(companyempwage);
			System.out.println("----------------------------");
		}
	}
    public int getWorkingHours(int check)
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
    public int attendanceCheck()
    {
        int result=(int)Math.floor((Math.random()*10)%3);
        return result;
    }
    public void print(int totalDays,int workHours,int totalHours,int dailySalary,int totalSalary)
    {
        System.out.println(totalDays+"\t"+workHours+"\t\t"+totalHours+"\t\t"+dailySalary+"\t\t"+totalSalary);
    }
    public int employeeWages(companyEmployeeWage companyEmployee)
    {
        int check=0,workHours=0,dailySalary=0,totalSalary=0,totalHours=0,totalDays=0;
        System.out.println("Day\tDaily Hours\tTotal Hours\tDaily Wage\tTotal Wage");
        while(totalHours<companyEmployee.maxHours && totalDays<companyEmployee.days)
        {
            totalDays+=1;
            check=attendanceCheck();
            workHours=getWorkingHours(check);
            totalHours=totalHours+workHours;
            dailySalary=workHours*companyEmployee.ratePerHour;
            totalSalary=totalHours*companyEmployee.ratePerHour;
            print(totalDays,workHours,totalHours,dailySalary,totalSalary);
        }
        return totalSalary;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of companies:");
		int n=sc.nextInt();
		iEmployeeWage employeeWageList=new employeeWage(n);
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
			employeeWageList.addCompany(company,ratePerHour,days,maxHours);
		}
		employeeWageList.computeWages();
	}
}
