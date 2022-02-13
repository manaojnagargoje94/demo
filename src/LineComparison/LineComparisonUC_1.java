package LineComparison;


import java.util.*;


public class LineComparisonUC_1 {

	
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Program ");
		Scanner sc = new Scanner(System.in);
		System.out.print("plese Enter line co-ordinates x1=");
		int x1=sc.nextInt();
		System.out.print("plese Enter line co-ordinates x2=");
		int x2=sc.nextInt();
		System.out.print("plese Enter line co-ordinates y1=");
		int y1=sc.nextInt();
		System.out.print("plese Enter line co-ordinates y2=");
		int y2=sc.nextInt();
		double length=Math.sqrt((x2-x1)^2+(y2-y1)^ 2);
				System.out.println("length of line: " + length);
				
	} 		
	

}