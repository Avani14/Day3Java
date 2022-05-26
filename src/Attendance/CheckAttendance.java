package Attendance;

public class CheckAttendance {
	static int wagePerHour = 20;
	static int fullDayHour = 8;
	
	static int wageCalculation(int x,int y)
	{
		int ans = x * y;
		return ans;
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
	}
}
