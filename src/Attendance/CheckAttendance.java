package Attendance;

public class CheckAttendance {
	public static void main(String[] args) {
		double empAttendance = Math.floor(Math.random()*10)%2;
		if(empAttendance == 1)
		{
			System.out.println("Employee is present today");
		}
		else {
			System.out.println("Employee is not present today");
		}	
	}
}
