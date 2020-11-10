import java.util.Random;
public class EmpWage {
    public static final int absent=0;
    public static final int is_Part_Time=80;
    public static final int is_Full_Time=16;

    public void calculate_wage(){
    int sum=0;
    System.out.println("Day\tWage\tSum");
    for(int d=1;d<=20;d++){
      int employee = (int) ((Math.random() * 10) % 3);
      switch(employee){
      case 1:
        sum=sum+is_Full_Time;
        System.out.println(d+"\t"+is_Full_Time+"\t"+sum);
        break;
      case 2 :
        sum=sum+is_Part_Time;
        System.out.println(d+"\t"+is_Part_Time+"\t"+sum);
        break;
      case 0 :
        sum=sum+absent;
        System.out.println(d+"\t"+absent+"\t"+sum);
      }
    }
  }
  
  public static void main(String[] args) {
    System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM");
    EmpWage obj = new EmpWage();
    obj.calculate_wage();
  }
}
