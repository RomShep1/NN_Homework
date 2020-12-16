public class Example2 
{
	public static void main(String[] args) 
	{	
		Circle circle = new Circle(3, 3, 4);
		circle.InformationOutput();
		circle.Turn(90);
		circle.InformationOutput();
		circle.Resizing(2);
		circle.InformationOutput();
		circle.Moving(5, 6);
		circle.InformationOutput();
		
		Square square = new Square(2, 2, 3);
		square.InformationOutput();
		square.Turn(45);
		square.InformationOutput();
		square.Resizing(2);
		square.InformationOutput();
		square.Moving(4, 7);
		square.InformationOutput();
		
		Rectangle rectangle = new Rectangle(0, 0, 4, 6);
		rectangle.InformationOutput();
		rectangle.Turn(45);
		rectangle.InformationOutput();
		rectangle.Resizing(2,6);
		rectangle.InformationOutput();
		rectangle.Moving(4, 7);
		rectangle.InformationOutput();
	}
}
