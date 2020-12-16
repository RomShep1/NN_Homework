import java.util.Scanner;

public class Example1_2 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
	    double a = 0, s = 0, h = 0, r = 0;
		System.out.printf("Введите номер(1: a, 2: S, 3: h, 4: R): ");	    
        int t = in.nextInt();
	    switch(t)
	    {
	    	case 1: 
		    	System.out.printf("Введите a: ");	
		        a = in.nextInt();
		        s = a*a*Math.sqrt(3)/4;
		        h = a*Math.sqrt(3)/2;
		        r = a*Math.sqrt(3)/3;
		        System.out.println("a = " + a + " S = " + s + " h = " + h + " R = " + r);
		        break;
	        case 2: 
    			System.out.printf("Введите S: ");
	        	s = in.nextInt();
	            a = Math.sqrt(4*s/Math.sqrt(3));
	            h = a*Math.sqrt(3)/2;
	            r = a*Math.sqrt(3)/3;
	            System.out.println("a = " + a + " S = " + s + " h = " + h + " R = " + r);
	            break;
	        case 3:
    			System.out.printf("Введите h: ");
	        	h = in.nextInt();
	            a = 2*h/Math.sqrt(3);
	            s = a*a*Math.sqrt(3)/4;
	            r = a*Math.sqrt(3)/3;
	            System.out.println("a = " + a + " S = " + s + " h = " + h + " R = " + r);
	            break;
	        case 4:
    			System.out.printf("Введите R: ");
	        	r = in.nextInt();
	            a = 3*r/Math.sqrt(3);
	            s = a*a*Math.sqrt(3)/4;
	            h = a*Math.sqrt(3)/2;
	            System.out.println("a = " + a + " S = " + s + " h = " + h + " R = " + r);
	            break;
	        default:
	        	System.out.println("Номер введен неправильно");
	    }
	}
}
