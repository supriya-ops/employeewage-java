public class EMpWageBuilderMultiCompany{

public static final int Is_part_Time = 1;
public static final int Is_full_Time = 2;

public static int computeEmpWage(String company,int emprate_per_hrs,int numofwo>

int emphrs = 0;
int totalemphrs =0;
int totalworkingdays =0;

while(totalemphrs <= maxhourspermonth && totalworkingdays < numofworkingdays){
   totalworkingdays++;
int  empCheck = (int) Math.floor(Math.random() * 10) % 3;
switch (empCheck){
      case Is_part_Time:
         emphrs = 4;
         break;
      case Is_full_Time:
         emphrs =  8;
  break;
      default:
         emphrs = 0;
}
totalemphrs += emphrs;
System.out.println("day:" + totalworkingdays + "emphrs :" + emphrs);
}
int totalempWage  =  totalemphrs * emprate_per_hrs;
System.out.println( "total Emp Wage for company: " + totalempWage);
return totalempWage;
}
public static void main(String args []){
computeEmpWage ("Super market",30,5,15);
computeEmpWage ("Reliance",17,4,11);
}
}

