abstract class Figure 
{
	double centerX;
	double centerY;
	
	public double topLeftX;
	public double topLeftY;
	public double topRightX;
	public double topRightY;
	public double bottomLeftX;
	public double bottomLeftY;
	public double bottomRightX;
	public double bottomRightY;
	public double topX;
	public double topY;
	
	Figure(double centerX, double centerY)
	{
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	public void Turn(double angle) 
	{
		System.out.println("Поворот четырехугольника на " + angle + " градусов");
		double lastTopLeftX = topLeftX;
		double lastTopRightX = topRightX;
		double lastBottomLeftX = bottomLeftX;
		double lastBottomRightX = bottomRightX;
		
		topLeftX = (topLeftX - centerX)*Math.cos(Math.toRadians(angle)) - (topLeftY - centerY)*Math.sin(Math.toRadians(angle)) + centerX;
		topLeftY = (lastTopLeftX - centerX)*Math.sin(Math.toRadians(angle)) + (topLeftY- centerY)*Math.cos(Math.toRadians(angle)) + centerY;
		
		topRightX = (topRightX - centerX)*Math.cos(Math.toRadians(angle)) - (topRightY - centerY)*Math.sin(Math.toRadians(angle)) + centerX;
		topRightY = (lastTopRightX - centerX)*Math.sin(Math.toRadians(angle)) + (topRightY- centerY)*Math.cos(Math.toRadians(angle)) + centerY;
		
		bottomLeftX = (bottomLeftX - centerX)*Math.cos(Math.toRadians(angle)) - (bottomLeftY - centerY)*Math.sin(Math.toRadians(angle)) + centerX;
		bottomLeftY = (lastBottomLeftX - centerX)*Math.sin(Math.toRadians(angle)) + (bottomLeftY- centerY)*Math.cos(Math.toRadians(angle)) + centerY;
		
		bottomRightX = (bottomRightX - centerX)*Math.cos(Math.toRadians(angle)) - (bottomRightY - centerY)*Math.sin(Math.toRadians(angle)) + centerX;
		bottomRightY = (lastBottomRightX - centerX)*Math.sin(Math.toRadians(angle)) + (bottomRightY- centerY)*Math.cos(Math.toRadians(angle)) + centerY;
	}
	
	public abstract void Moving(double x, double y); 
	public abstract void Resizing(double a);
	public abstract void InformationOutput();

}