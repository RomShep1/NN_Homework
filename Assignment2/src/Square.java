public class Square extends Figure
{
	private double sideLength;
	
	Square(double centerX, double centerY, double sideLength) 
	{
		super(centerX, centerY);
		System.out.println("�������� ��������");
		this.sideLength = sideLength;
		VertexInitialization();
	}

	@Override
	public void Moving(double x, double y) 
	{
		System.out.println("����������� �� " + "x: " + x + " y: " + y);
		centerX += x;
		centerY += y;
		
		topLeftX += x;
		topLeftY += y;
		topRightX += x;
		topRightY += y;
		bottomLeftX += x;
		bottomLeftY += y;
		bottomRightX += x;
		bottomRightY += y;
	}
	
	private void VertexInitialization()
	{
		topLeftX = centerX - (double)sideLength/2;
		topLeftY = centerY + (double)sideLength/2;
		topRightX = centerX + (double)sideLength/2;
		topRightY = centerY + (double)sideLength/2;
		bottomLeftX = centerX - (double)sideLength/2;
		bottomLeftY = centerY - (double)sideLength/2;
		bottomRightX = centerX + (double)sideLength/2;
		bottomRightY = centerY - (double)sideLength/2;
	}

	@Override
	public void Resizing(double a) 
	{
		System.out.println("��������� �������� � " + a + " ����");
		sideLength *= a;
		topLeftX = (topLeftX - centerX)*a + centerX;
		topLeftY = (topLeftY - centerY)*a + centerY;
		topRightX = (topRightX - centerX)*a + centerX;
		topRightY = (topRightY - centerY)*a + centerY;
		bottomLeftX = (bottomLeftX - centerX)*a + centerX;
		bottomLeftY = (bottomLeftY - centerY)*a + centerY;
		bottomRightX = (bottomRightX - centerX)*a + centerX;
		bottomRightY = (bottomRightY - centerY)*a + centerY;
	}



	@Override
	public void InformationOutput() 
	{
		System.out.println("����� ������: " + "x: " + centerX + " y: " + centerY);
		System.out.println("����� ������� �����: " + "x: " + topLeftX + " y: " + topLeftY);
		System.out.println("������ ������� �����: " + "x: " + topRightX + " y: " + topRightY);
		System.out.println("����� ������ �����: " + "x: " + bottomLeftX + " y: " + bottomLeftY);
		System.out.println("������ ������ �����: " + "x: " + bottomRightX + " y: " + bottomRightY);
		System.out.println("������ �������: " + sideLength);
		System.out.println();
	}
}
