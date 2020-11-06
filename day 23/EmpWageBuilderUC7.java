public class EmpWageBuilderUC7{

public static final int Is_Part_time = 1;
public static final int Is_full_time = 2;
public static final int emp_rate_per_hour = 20;
public static final int num_of_working_days = 2;
public static final int max_hrs_in_month = 10;

public static int computeEmpwage() {
   int totalEmpHrs = 0 ;
   int totalworkingDays = 0 ;
   int empHrs = 0;
while  (totalEmpHrs <= max_hrs_in_month && totalworkingDays < num_of_working_days ){
   totalworkingDays++;
   int empCheck= (int) Math.floor (Math.random() * 10) % 3;
   switch (empCheck){
         case Is_Part_time:
               empHrs = 4;
               break;
         case Is_full_time:
               empHrs = 8;
         default:
               empHrs = 0;
}
totalEmpHrs += empHrs;
System.out.println("Day: " + totalworkingDays + " Emp hrs: " + empHrs );
}
int totalEmpWage = totalEmpHrs * emp_rate_per_hour;
System.out.println("total Emp Wage:" + totalEmpWage);
   return totalEmpWage;
}
public static void main(String[] args){
   computeEmpWage();

}
}
