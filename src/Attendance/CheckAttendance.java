package Attendance;

public class CheckAttendance {
	static int wagePerHour = 20;
	static int fullDayHour = 8;
	static int partTimeHour = 4;
	static int workingDays = 20;
	static int wageCalculation(int x,int y)
	{
		int ans = x * y;
		return ans;
	}
	static void monthlyWage(int x)
	{
		int dailyWageFullTime = CheckAttendance.wageCalculation(wagePerHour,fullDayHour);
		System.out.println("Monthly wage of a full time employee is : "+dailyWageFullTime*x);
		int dailyWagePartTime = CheckAttendance.wageCalculation(wagePerHour,partTimeHour);
		System.out.println("Monthly wage of a full time employee is : "+dailyWagePartTime*x);
		
	}
	public static void main(String[] args) {
		
		System.out.println("Welcome to employee wage computation program.");
		double empAttendance = Math.floor(Math.random()*10)%2;
        if(empAttendance == 1)
        {
            System.out.println("Employee is present today");
        }
        else {
            System.out.println("Employee is not present today");
        }
        System.out.println("Daily wage of an employee is : "+CheckAttendance.wageCalculation(wagePerHour, fullDayHour));
        System.out.println("Daily wage of a part time employee is : "+CheckAttendance.wageCalculation(wagePerHour, partTimeHour));
        monthlyWage(workingDays);
	}
}