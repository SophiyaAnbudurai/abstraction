package abstraction;

public class SphericalPlanet {
	private float radius;
	public SphericalPlanet(String planetName2, float radius ) {
	super();
	this.radius = radius;
	}
	public float getRadius() {
	return radius;
	}
	public void setRadius(float radius) {
	this.radius = radius;
	}
	public void display2()
	{

	float pi = (float) 3.142;
	float rad = (this.getRadius()*this.getRadius()*this.getRadius());
	float total = (4*pi*rad)/3;
	System.out.printf("%ekm3",total);
	}
	}



