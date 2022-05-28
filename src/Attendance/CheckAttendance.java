package Attendance;

public class CheckAttendance {
	public static void attendance()
	{
		double empAttendance = Math.floor(Math.random()*10)%2;
        if(empAttendance == 1)
        {
            System.out.println("Employee is present today");
        }
        else {
            System.out.println("Employee is not present today");
        }
	}
	public static void main(String[] args) {
		System.out.println("Welcome to employee wage computation program.");
		double empAttendance = Math.floor(Math.random()*10)%2;
      	CheckAttendance.attendance();
	}
}
