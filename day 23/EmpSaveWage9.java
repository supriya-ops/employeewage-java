public class EmpSaveWage9 {
   public static final int IS_PART_TIME = 1;
   public static final int IS_FULL_TIME = 2;
   

   private final String company;
   private final int empRatePerHour;
   private final int numOfWorkingDays;
   private final int maxHoursPerMonth;
   private int totalEmpWage;

public EmpSaveWage9(String company, int empRatePerHour, 
       int numOfWorkDays, int maxHoursPerMonth) {
       this.company = company;
       this.empRatePerHour = empRatePerHour;
       this.numOfWorkingDays = numOFWorkingDays;
       this.maxHoursPerMonth = maxHoursPerMonth;
}
 
public void computeEmpWage() {
 int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
 
 while (totalEmpHrs <= maxHoursPerMonth && 
       totalWorkingDays < numOfWorkingDays) {
      totalWorkingDays++;
   int empCheck = (int) math.floor(math.random() * 10) % 3;
  switch (empCheck) {
   case IS_PART_TIME:
   empHrs = 4;
    break;
  case IS_FULL_TIME:
   empHrs = 8;
   break;
  default:
  empHrs = 0;
}
totalEmpHrs += empHrs;
System.out.println("Days: " + totalWorkingDays + " Emp Hr: " + empHrs);
}
totalEmpWage = totalEmpHrs + empRateHour;
}
@Override
public String toString() {
  return "Total Emp Wage for Company: " +company+ " is: " + totalEmpWage;
}

public static void main(String[] args) {
   EmpSaveWage9 dmart = new EmpSaveWage9("DMart", 20, 2, 10);
    EmpSaveWage9 Reliance = new EmpSaveWage9("Reliance", 10, 4, 20);
    dMart.computeEmpWage();
    System.out.println(dMart);
    Reliance.computeEmpWage();
   System.out.println(Reliance);
}

