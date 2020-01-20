package pack;
class Shape1{
String shapeName;
@Override
public String toString() {
	return "Shape1 [shapeName=" + shapeName + ", shapeId=" + shapeId + "]";
}
int shapeId;
public Shape1(String shapeName, int shapeId) {
	super();
	this.shapeName = shapeName;
	this.shapeId = shapeId;
}

public int getShapeId() {
	return shapeId;
}
public void setShapeId(int shapeId) {
	this.shapeId = shapeId;
}
double area()
{
	return 1.00;
}
}
class Rectangle1 extends Shape1{
	int length,width;
	public Rectangle1(String shapeName, int shapeId,	int length,int width) {
		super(shapeName, shapeId);
		// TODO Auto-generated constructor stub
		this.length=length;
		this.width=width;
	}
		@Override
	public String toString() {
		return "Rectangle1 [length=" + length + ", width=" + width + ", shapeName=" + shapeName + ", shapeId=" + shapeId
				+ "]";
	}
		public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	double area()
	{
		return length*width;
	}
}
class square extends Shape1{
	int lengthsquare;
	@Override
	public String toString() {
		return "square [lengthsquare=" + lengthsquare + ", shapeName=" + shapeName + ", shapeId=" + shapeId + "]";
	}
	public int getLengthsquare() {
		return lengthsquare;
	}
	public void setLengthsquare(int lengthsquare) {
		this.lengthsquare = lengthsquare;
	}
	public square(String shapeName, int shapeId,int lengthsquare) {
		super(shapeName, shapeId);
		// TODO Auto-generated constructor stub
		this.lengthsquare=lengthsquare;
	}
	double area()
	{
		return lengthsquare*lengthsquare;
	}
	}
class Circle extends Shape1{
	public Circle(String shapeName, int shapeId,int radius) {
		super(shapeName, shapeId);
		// TODO Auto-generated constructor stub
		this.radius=radius;
	}
	int radius;
	@Override
	public String toString() {
		return "circle [radius=" + radius + ", shapeName=" + shapeName + ", shapeId=" + shapeId + "]";
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	double area(){
		return super.area()+3.14*radius*radius;
	}
	
}
	
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle("circle", 4, 2);
		System.out.println(c.area());
		Rectangle1 r=new Rectangle1("rectangle", 2,5, 4);
		System.out.println(r.area());
		square s=new square("square", 3, 3);
		System.out.println(s.area());

	}

}
