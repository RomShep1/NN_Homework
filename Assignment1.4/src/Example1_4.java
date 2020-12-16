import java.util.Scanner;

public class Example1_4 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("¬ведите количество банков(N): ");	 
		int n = in.nextInt();
		double[] arr = new double[n];
		int j = 0;
		System.out.printf("¬ведите данные о купли-продаже в банках: ");	 
		for(int i = 0; i < arr.length; i++) 
		{
			arr[i] = in.nextDouble();
			if(arr[i] > arr[j])
				j = i;
		}
        System.out.println(arr[j]);
	}
}
