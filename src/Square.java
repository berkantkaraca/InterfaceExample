
public class Square implements Calculate {
	
	int edge;

	public Square(int edge) {
		this.edge = edge;
	}

	@Override
	public void perimeter() {
		System.out.println("The Perimeter of Square: " + (edge * 4));
		
	}

	@Override
	public void area() {		
		System.out.println("The Area of Square: " + Math.pow(edge, 2));
	}

	
}
