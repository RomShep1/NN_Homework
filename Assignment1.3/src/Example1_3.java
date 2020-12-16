import java.util.Scanner;

public class Example1_3 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
        System.out.println("¬ведите точность(epsilon): ");
		double e = in.nextDouble();
        double a = (double)-1/(2*2);
        double s = a;
        int n = 1;
    	System.out.println("S = " + s + " n = " + n + " a = " + a + " e = " + e);
    	while(Math.abs(a) >= e)
        {
    		n++;
        	if(n%2 == 0)
        		a = (double)n/((n + 1)*(n + 1));
        	else
        		a = (double)-n/((n + 1)*(n + 1));
        	s += a;
        	System.out.println("S = " + s + " n = " + n + " a = " + a + " e = " + e);
        }
	}
}
