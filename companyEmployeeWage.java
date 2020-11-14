package EmpWage;
public class companyEmployeeWage {
    public static final int isPartTime=1;
    public static final int isFullTime=2;

    public String company;
    public int ratePerHour;
    public int days;
    public int maxHours;
    public int totalWage;
    companyEmployeeWage(String company,int ratePerHour,int days,int maxHours)
    {
        this.company=company;
        this.ratePerHour=ratePerHour;
        this.days=days;
        this.maxHours=maxHours;
    }
    public void setTotalWage(int totalWage)
    {
    	this.totalWage=totalWage;
    }
    public String toString()
    {
    	return "Employee wage in company "+company+" is "+totalWage;
    }
}
