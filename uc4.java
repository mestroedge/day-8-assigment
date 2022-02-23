package linelengthcompare;

class linecomparison{
	public void linecomapre(int x1,int x2, int y1, int y2, int x3, int x4, int y3, int y4)
	{
		System.out.println("Welcome to line comparison program...");
		if (x1==x3 && y1==y3 && x2==x4 && y2==y4)
		{
			System.out.println("Two lines are of equal  length");
			System.out.print(Math.sqrt((x1-x2)^2+(y1-y2)^2));
		}
		else 
		{
			System.out.println("Two lines are not of  equal  length, line1 of "+ Math.sqrt((x1-x2)^2+(y1-y2)^2)+"length and line2 of "+ Math.sqrt((x3-x4)^2+(y3-y4)^2)+ " length.");
			
		}
	}
}

public class uc4 {
	public static void main(String ar[])
	{
		linecomparison lc = new linecomparison();
		lc.linecomapre(10, 15, 14, 20, 18, 25, 19, 23);
		System.out.println();
		lc.linecomapre(10, 20, 10, 20, 10, 20, 10, 20);
	}

}
