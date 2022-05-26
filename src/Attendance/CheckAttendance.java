package Attendance;

public class CheckAttendance {
	static int wagePerHour = 20;
	static int fullDayHour = 8;
	static int partTimeHour = 4;
	static int wageCalculation(int x,int y)
	{
		int ans = x * y;
		return ans;
	}
	
	// Solving the problem of daily wage using switch case statement
	static void wageCalculationUsingSwitch(int workingHours)
	{
		switch(workingHours) {
		case 8:
			System.out.println("Daily wage of full time employee is : "+wagePerHour*fullDayHour);
			break;
		case 4:
			System.out.println("Daily wage of part time employee is : "+wagePerHour*partTimeHour);
			break;
		}
	}
	public static void main(String[] args) {
		
		System.out.println("Welcome to employee wage computation program.");
//		double empAttendance = Math.floor(Math.random()*10)%2;
//        if(empAttendance == 1)
//        {
//            System.out.println("Employee is present today");
//        }
//        else {
//            System.out.println("Employee is not present today");
//        }
//        System.out.println("Daily wage of an employee is : "+CheckAttendance.wageCalculation(wagePerHour, fullDayHour));
//        System.out.println("Daily wage of a part time employee is : "+CheckAttendance.wageCalculation(wagePerHour, partTimeHour));
        
		
		//Solving the problem of attendance using switch case
		int empAttendance = (int) (Math.floor(Math.random()*10)%2);
		switch (empAttendance) {
		case 1 :
			System.out.println("Employee is present...");
			break;
		case 0: 
			System.out.println("Employee is absent...");
		}
		CheckAttendance.wageCalculationUsingSwitch(8);
		CheckAttendance.wageCalculationUsingSwitch(4);
		
		
	}
}
