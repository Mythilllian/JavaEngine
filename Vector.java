
public class Vector {
	public int x;
	public int y;
	
	public Vector(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Vector add(Vector other) {
        return new Vector(this.x + other.x, this.y + other.y);
    }
	
	public static Vector add(Vector v1, Vector v2) {
		return v1.add(v2);
	}
}
