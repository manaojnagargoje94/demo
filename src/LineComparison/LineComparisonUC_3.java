package LineComparison;



import java.util.*;


public class LineComparisonUC_3 {

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
		double line1=Math.sqrt((x2-x1)^2+(y2-y1)^2);
		System.out.println("length of line: " + line1);

		System.out.print("plese Enter line co-ordinates a1=");
		int a1=sc.nextInt();
		System.out.print("plese Enter line co-ordinates xa2=");
		int a2=sc.nextInt();
		System.out.print("plese Enter line co-ordinates b1=");
		int b1=sc.nextInt();
		System.out.print("plese Enter line co-ordinates b2=");
		int b2=sc.nextInt();
		double line2=Math.sqrt((a2-a1)^2+(b2-b1)^2);
		System.out.println("length of line: " + line2);
		
		
		
		Integer L1=new Integer((int) line1);
		Integer L2=new Integer((int) line2);
		if (L1.equals(L2))
		{
			System.out.println("line L1 and L2 line are equals");
		}
		else 
		{
			System.out.println("line L1 and L2 line are not equals");
		}
		int equal = L1.compareTo(L2);
		
		System.out.println(equal);
		if(equal==0)
		{
			System.out.println("L1 and L2 are equal");
		}
		
		else if (equal>0) {
			System.out.println("L1 is greter than L2");
			
		}
		else {
			System.out.println("L2 is greter than L1");
		}
	}
}











