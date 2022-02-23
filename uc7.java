package emp;
class empwage{
	int parttimehr=4;
	int fulltimehr=8;
	int days = 30;
	int wageperhr = 20;
	int type = 100;
	public void wage_for_month()
	{	
		System.out.println("Welcome to employee wage calculator program... ");
		float wagepermonth;
		if(type==1)
		{
			System.out.println("Employee works as part timer");
			wagepermonth = parttimehr * wageperhr * days;
	
		}
		else
		{
			System.out.println("Employee works as full timer");
			wagepermonth = fulltimehr * wageperhr * days;

		}
		System.out.println("Salary of the employee is: "+ wagepermonth);
	}
}

public class uc7 {
	public static void main(String ar[])
	{
		empwage emp = new empwage();
		emp.wage_for_month();
//		System.out.println(emp.type+ " " + emp.days);
}

}
