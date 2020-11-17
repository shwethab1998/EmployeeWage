package companyEmployeeWage;

package iEmployeeWage;

import java.util.*;
public class EmpWage implements iEmployeeWage
{
	int counter=0;
	int numberOfCompanies;
	ArrayList<companyEmployeeWage> companyEmployeeWageList;

	static Map<String,companyEmployeeWage> companyEmployeeWageMap;

	EmpWage(int n)
	{
		this.numberOfCompanies=n;
		companyEmployeeWageList=new ArrayList<companyEmployeeWage>();
		companyEmployeeWageMap=new HashMap<String,companyEmployeeWage>();
	}
	public void addCompany(String company,int ratePerHour,int days,int maxHours)
	{
		companyEmployeeWage companyempwage=new companyEmployeeWage(company,ratePerHour,days,maxHours);
		companyEmployeeWageList.add(companyempwage);
		companyEmployeeWageMap.put(company, companyempwage);
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
	public static int getTotalWage(String company)
	{
		return companyEmployeeWageMap.get(company).totalWage;
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
    public int employeeWages(companyEmployeeWage companyEmployee)
    {
        int check=0,workHours=0,dailySalary=0,totalSalary=0,totalHours=0,totalDays=0;
        while(totalHours<companyEmployee.maxHours && totalDays<companyEmployee.days)
        {
            totalDays+=1;
            check=attendanceCheck();
            workHours=getWorkingHours(check);
            totalHours=totalHours+workHours;
            dailySalary=workHours*companyEmployee.ratePerHour;
            companyEmployee.addDailyWage(dailySalary);
        }
        totalSalary=totalHours*companyEmployee.ratePerHour;
        for(int i=0;i<companyEmployee.dailyWage.size();i++)
        {
        	System.out.println("Wage on day "+(i+1)+" is "+companyEmployee.dailyWage.get(i));
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
		System.out.println("Enter the name of company whose total wage is needed:");
		String company=sc.next();
		if(companyEmployeeWageMap.containsKey(company))
			System.out.println("Total wage is:"+getTotalWage(company));
		else
			System.out.println("Invalid company name!");
	}
}
