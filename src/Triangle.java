
public class Triangle implements Calculate {

	int triangleA, triangleB, triangleC;
	
	Triangle(int triangleA, int triangleB, int triangleC){
		this.triangleA = triangleA;
		this.triangleB = triangleB;
		this.triangleC = triangleC;
	}
	
	
	@Override
	public void perimeter() {
		System.out.println("The Perimeter of Triangle: " + (triangleA + triangleB + triangleC));
	}
	
	@Override
	public void area() {
		double halfPerimeter = (triangleA + triangleB + triangleC) / 2;
		System.out.println("The Area of Triangle: " + Math.sqrt((halfPerimeter *(halfPerimeter - triangleA) * (halfPerimeter - triangleB) * (halfPerimeter - triangleC))));
	}
	
}
