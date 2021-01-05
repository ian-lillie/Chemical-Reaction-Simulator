public class Chemical {

	public int type;
	public float xPos;
	public float yPos;

	public float speed;
	public float angle;

	public Chemical(int t) {
		type = t;
	}

	public Chemical(int t, float x, float y, float s, float a) {
		type = t;
		xPos = x;
		yPos = y;
		speed = s;
		angle = a;
	}

	public void setChemical(int t) {
		type = t;
	}

	public int getChemical() {
		return type;
	}

	public void setPosition(float x, float y) {
		xPos = x;
		yPos = y;
	}

	public float getXPos() {
		return xPos;
	}

	public float getYPos() {
		return yPos;
	}

	public void setSpeed(float s) {
		speed = s;
	}

	public void setAngle(float a) {
		angle = a;
	}

	public float getSpeed() {
		return speed;
	}

	public float getAngle() {
		return angle;
	}

	public void barrierDetection() {
		if (xPos < 520) {
			angle = (float) (Math.PI - angle);
			this.setAngle(angle);
			xPos = 520;
		}

		if (xPos > 980) {
			angle = (float) (Math.PI - angle);
			this.setAngle(angle);
			xPos = 980;
		}

		if (yPos < 20) {
			angle = -angle;
			this.setAngle(angle);
			yPos = 20;
		}

		if (yPos > 480) {
			angle = -angle;
			this.setAngle(angle);
			yPos = 480;
		}
	}

	public void collisionDetection() {

	}

}
