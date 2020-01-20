package pack;

public class Rectangle extends Shape {
	int rectlength, rectwidth;
	public int getRectlength() {
		return rectlength;
	}
	public void setRectlength(int rectlength) {
		this.rectlength = rectlength;
	}
	public int getRectwidth() {
		return rectwidth;
	}
	public void setRectwidth(int rectwidth) {
		this.rectwidth = rectwidth;
	}
@Override
				public String toString() {
					return "Rectangle [rectlength=" + rectlength + ", rectwidth=" + rectwidth + ", shapeId=" + shapeId
							+ ", shapeName=" + shapeName + "]";
				}
public Rectangle(int shapeId, String shapeName,int rectlength,int rectwidth) {
		super(shapeId, shapeName);
		this.rectlength=rectlength;
		this.rectwidth=rectwidth;
		// TODO Auto-generated constructor stub
	}
void arearectangle()
{
	System.out.println(rectlength*rectwidth);
}

}
