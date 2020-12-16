public class Rectangle extends Figure
{
	private double width;
	private double height;
	
	Rectangle(double centerX, double centerY, double width, double height) 
	{
		super(centerX, centerY);
		System.out.println("Создание прямоугольника");
		this.width = width;
		this.height = height;
		VertexInitialization();
	}
	
	@Override
	public void Moving(double x, double y) 
	{
		System.out.println("Перемещение на " + "x: " + x + " y: " + y);
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
		topLeftX = centerX - (double)width/2;
		topLeftY = centerY + (double)height/2;
		topRightX = centerX + (double)width/2;
		topRightY = centerY + (double)height/2;
		bottomLeftX = centerX - (double)width/2;
		bottomLeftY = centerY - (double)height/2;
		bottomRightX = centerX + (double)width/2;
		bottomRightY = centerY - (double)height/2;
	}

	@Override
	public void Resizing(double a) 
	{
		Resizing(a,a);
	}
	
	public void Resizing(double a, double b) 
	{
		System.out.println("Изменение размеров ширины в " + a + " раза, высоты в " + b);
		width *= a;
		height *= b;
		topLeftX = (topLeftX - centerX)* a + centerX;
		topLeftY = (topLeftY - centerY)* b + centerY;
		topRightX = (topRightX - centerX)* a + centerX;
		topRightY = (topRightY - centerY)* b + centerY;
		bottomLeftX = (bottomLeftX - centerX)* a + centerX;
		bottomLeftY = (bottomLeftY - centerY)* b + centerY;
		bottomRightX = (bottomRightX - centerX)* a + centerX;
		bottomRightY = (bottomRightY - centerY)* b + centerY;
	}


	@Override
	public void InformationOutput() 
	{
		System.out.println("Точка центра: " + "x: " + centerX + " y: " + centerY);
		System.out.println("Левая верхняя точка: " + "x: " + topLeftX + " y: " + topLeftY);
		System.out.println("Правая верхняя точка: " + "x: " + topRightX + " y: " + topRightY);
		System.out.println("Левая нижняя точка: " + "x: " + bottomLeftX + " y: " + bottomLeftY);
		System.out.println("Правая нижняя точка: " + "x: " + bottomRightX + " y: " + bottomRightY);
		System.out.println("Ширина: " + width);
		System.out.println("Высота: " + height);
		System.out.println();
	}
}
