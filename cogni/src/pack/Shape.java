package pack;

public class Shape {
	int shapeId;
	String shapeName; 
	@Override
	public String toString() {
		return "Shape [shapeId=" + shapeId + ", shapeName=" + shapeName + "]";
	}
  public int getShapeId() {
		return shapeId;
	}
	public void setShapeId(int shapeId) {
		this.shapeId = shapeId;
	}
	public String getShapeName() {
		return shapeName;
	}
	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	} 
  public Shape(int shapeId, String shapeName) {
	super();
	this.shapeId = shapeId;
	this.shapeName = shapeName;
}
 /* void displayshape(){
	System.out.println("Shapename is"+"  "+shapeName+" " +"Shapeid"+" "+shapeId);
}
*/
}
