import java.util.Scanner;

public class Example1_1 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
        System.out.println("¬ведите a,b и c: ");
        int a = in.nextInt();
        int b = in.nextInt();  
        int c = in.nextInt(); 
        
        int diff1 = a - b, diff2 = a - c, diff3 = b - a, diff4 = b - c;
        if (diff1*diff2 < 0) 
            System.out.println(b + c);
        else if (diff3*diff4 < 0) 
            System.out.println(a + c);
        else
            System.out.println(b + a);
	}
}
