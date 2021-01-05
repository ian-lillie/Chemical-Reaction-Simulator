public class GraphPoint {

	public float time;
	public float concentration;
	public int type;

	public GraphPoint(float ti, float c, int ty) {
		time = ti;
		concentration = c;
		type = ty;
	}

	public float getTime() {
		return time;
	}

	public float getConcentration() {
		return concentration;
	}

	public int getType() {
		return type;
	}

}
