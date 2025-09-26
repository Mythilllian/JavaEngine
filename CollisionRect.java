
public class CollisionRect extends CollisionObject {
	public CollisionRect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public boolean onGround() {
		return false;
	}
	
	//public Vector[] getEdgePoints() {/*TODO*/}
	
	public double distance(int x, int y)
	  {
	    double dx = x - this.x;
	    double dy = y - this.y;
	    return Math.max(Math.abs(dx),Math.abs(dy));
	  }

}
