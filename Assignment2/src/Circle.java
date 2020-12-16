public class Circle extends Figure
{
	private double rad;
	
	Circle(double centerX, double centerY, double rad) 
	{
		super(centerX, centerY);
		System.out.println("�������� �����");
		this.rad = rad;
		topX = centerX;
		topY = centerY + rad;
	}
	
	@Override
	public void Moving(double x, double y) 
	{
		System.out.println("����������� �� " + "x: " + x + " y: " + y);
		centerX += x;
		centerY += y;
		topX += x;
		topY += y;
	}
	
	@Override
	public void Resizing(double a) 
	{
		System.out.println("��������� ������� � " + a + " ����");
		rad *= a;
		topX = (topX - centerX)*a + centerX;
		topY = (topY - centerY)*a + centerY;
	}
	
	@Override
	public void Turn(double angle) 
	{
		System.out.println("������� �� " + angle + " ��������");
		double lastToptX = topX;
		
		topX = (topX - centerX)*Math.cos(Math.toRadians(angle)) - (topY - centerY)*Math.sin(Math.toRadians(angle)) + centerX;
		topY = (lastToptX - centerX)*Math.sin(Math.toRadians(angle)) + (topY- centerY)*Math.cos(Math.toRadians(angle)) + centerY;
	}
	
	@Override
	public void InformationOutput() 
	{
		System.out.println("����� ������: " + "x: " + centerX + " y: " + centerY);
		System.out.println("������� �����: " + "x: " + topX + " y: " + topY);
		System.out.println("������: " + rad);
		System.out.println();
	}
}
