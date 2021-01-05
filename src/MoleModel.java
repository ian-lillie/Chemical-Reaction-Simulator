import processing.core.PApplet;

public class MoleModel extends Model implements Simulation {

	MoleModel(PApplet p) {
		super(p);
	}

	public void initialize() {
		molesA = (int) (aConc * ChemicalEquil.volume);
		molesB = (int) (bConc * ChemicalEquil.volume);
		molesC = (int) (cConc * ChemicalEquil.volume);
		molesD = (int) (dConc * ChemicalEquil.volume);
		molesE = (int) (eConc * ChemicalEquil.volume);

		float tempA = molesA;
		float tempB = molesB;
		float tempC = molesC;
		float tempD = molesD;
		float tempE = molesE;

		while (tempA > 0) {
			float tempX = (parent.random(550, 950));
			float tempY = (parent.random(50, 450));
			float tempS = (parent.random(0, 10));
			float tempAn = (parent.random(0, (float) (2 * Math.PI)));
			moles.add(new Chemical(0, tempX, tempY, tempS, tempAn));
			tempA -= 1;
		}

		while (tempB > 0) {
			float tempX = (parent.random(550, 950));
			float tempY = (parent.random(50, 450));
			float tempS = (parent.random(0, 10));
			float tempAn = (parent.random(0, (float) (2 * Math.PI)));
			moles.add(new Chemical(1, tempX, tempY, tempS, tempAn));
			tempB -= 1;
		}

		while (tempC > 0) {
			float tempX = (parent.random(550, 950));
			float tempY = (parent.random(50, 450));
			float tempS = (parent.random(0, 10));
			float tempAn = (parent.random(0, (float) (2 * Math.PI)));
			moles.add(new Chemical(2, tempX, tempY, tempS, tempAn));
			tempC -= 1;
		}

		while (tempD > 0) {
			float tempX = (parent.random(550, 950));
			float tempY = (parent.random(50, 450));
			float tempS = (parent.random(0, 10));
			float tempAn = (parent.random(0, (float) (2 * Math.PI)));
			moles.add(new Chemical(3, tempX, tempY, tempS, tempAn));
			tempD -= 1;
		}
		
		while (tempE > 0) {
			float tempX = (parent.random(550, 950));
			float tempY = (parent.random(50, 450));
			float tempS = (parent.random(0, 10));
			float tempAn = (parent.random(0, (float) (2 * Math.PI)));
			moles.add(new Chemical(4, tempX, tempY, tempS, tempAn));
			tempE -= 1;
		}

	}

	public void runSim() {

		int actualA = (int) (aConc * ChemicalEquil.volume);
		int actualB = (int) (bConc * ChemicalEquil.volume);
		int actualC = (int) (cConc * ChemicalEquil.volume);
		int actualD = (int) (dConc * ChemicalEquil.volume);
		int actualE = (int) (eConc * ChemicalEquil.volume);

		// Updating A

		if (molesA != actualA) {
			if (molesA > actualA) {
				for (int i = 0; i < moles.size(); i++) {
					if (moles.get(i).getChemical() == 0 && molesA > actualA) {
						moles.remove(i);
						molesA -= 1;
					}
				}

			}
			if (molesA < actualA) {
				for (int i = 0; i < (actualA - molesA); i++) {
					moles.add(new Chemical(0, (parent.random(550, 950)), (parent.random(50, 450)),
							(parent.random(0, 10)), (parent.random(0, (float) (2 * Math.PI)))));
				}
				molesA += 1;
			}

			molesA = actualA;
		}

		// Updating B

		if (molesB != actualB) {
			if (molesB > actualB) {
				for (int i = 0; i < moles.size(); i++) {
					if (moles.get(i).getChemical() == 1 && molesB > actualB) {
						moles.remove(i);
						molesB -= 1;
					}
				}

			}
			if (molesB < actualB) {
				for (int i = 0; i < (actualB - molesB); i++) {
					moles.add(new Chemical(1, (parent.random(550, 950)), (parent.random(50, 450)),
							(parent.random(0, 10)), (parent.random(0, (float) (2 * Math.PI)))));
				}
				molesB += 1;
			}

			molesB = actualB;
		}

		// Updating C

		if (molesC != actualC) {
			if (molesC > actualC) {
				for (int i = 0; i < moles.size(); i++) {
					if (moles.get(i).getChemical() == 2 && molesC > actualC) {
						moles.remove(i);
						molesC -= 1;
					}
				}

			}
			if (molesC < actualC) {
				for (int i = 0; i < (actualC - molesC); i++) {
					moles.add(new Chemical(2, (parent.random(550, 950)), (parent.random(50, 450)),
							(parent.random(0, 10)), (parent.random(0, (float) (2 * Math.PI)))));
				}
				molesC += 1;
			}

			molesC = actualC;
		}

		// Updating D

		if (molesD != actualD) {
			if (molesD > actualD) {
				for (int i = 0; i < moles.size(); i++) {
					if (moles.get(i).getChemical() == 3 && molesD > actualD) {
						moles.remove(i);
						molesD -= 1;
					}
				}

			}
			if (molesD < actualD) {
				for (int i = 0; i < (actualD - molesD); i++) {
					moles.add(new Chemical(3, (parent.random(550, 950)), (parent.random(50, 450)),
							(parent.random(0, 10)), (parent.random(0, (float) (2 * Math.PI)))));
				}
				molesD += 1;
			}

			molesD = actualD;
		}
		
		//Updating E
		
		if (molesE != actualE) {
			if (molesE > actualE) {
				for (int i = 0; i < moles.size(); i++) {
					if (moles.get(i).getChemical() == 4 && molesD > actualD) {
						moles.remove(i);
						molesE -= 1;
					}
				}

			}
			if (molesE < actualE) {
				for (int i = 0; i < (actualE - molesE); i++) {
					moles.add(new Chemical(4, (parent.random(550, 950)), (parent.random(50, 450)),
							(parent.random(0, 10)), (parent.random(0, (float) (2 * Math.PI)))));
				}
				molesE += 1;
			}

			molesE = actualE;
		}

	}

	public void fluid() {

		for (int i = 0; i < moles.size(); i++) {

			float xPos = moles.get(i).getXPos();
			float yPos = moles.get(i).getYPos();
			float speed = moles.get(i).getSpeed();
			float angle = moles.get(i).getAngle();

			float xVelocity = (float) (speed * Math.cos(angle));
			float yVelocity = (float) (speed * Math.sin(angle));

			float newX = (xPos + (xVelocity * ChemicalEquil.timeStep));
			float newY = (yPos + (yVelocity * ChemicalEquil.timeStep));

			moles.get(i).setPosition(newX, newY);
			moles.get(i).setSpeed(speed + (float) (Math.random() - 0.5));
			// moles.get(i).setAngle(angle + random(-0.1, 0.1));

			// moles.get(i).collisionDetection(i);

			moles.get(i).barrierDetection();
		}
	}

	public void collisionDetection(Chemical x, int i) {

		float xPosition = x.getXPos();
		float yPosition = x.getYPos();
		float speed = x.getSpeed();
		float angle = x.getAngle();

		for (int j = 0; j < moles.size(); j++) {
			float tempX = moles.get(j).getXPos();
			float tempY = moles.get(j).getYPos();
			float distance = PApplet.dist(xPosition, yPosition, tempX, tempY);

			if (distance < 30 && distance > 27 && !(x.equals(moles.get(j)))) {
				x.setSpeed(-speed);
			}

			if (distance <= 27 && !(x.equals(moles.get(j)))) {
				x.setPosition(xPosition + 10, yPosition + 10);
				moles.get(j).setPosition(xPosition - 10, yPosition - 10);
			}

		}

	}

	public void drawSim() {

		for (int i = 0; i < moles.size(); i++) {

			float xval = moles.get(i).getXPos();
			float yval = moles.get(i).getYPos();

			if (moles.get(i).getChemical() == 0) {
				parent.fill(255, 0, 0);
				parent.ellipse(xval, yval, 30, 30);
			} else if (moles.get(i).getChemical() == 1) {
				parent.fill(0, 255, 0);
				parent.ellipse(xval, yval, 30, 30);
			} else if (moles.get(i).getChemical() == 2) {
				parent.fill(0, 0, 255);
				parent.ellipse(xval, yval, 30, 30);
			} else if (moles.get(i).getChemical() == 3) {
				parent.fill(0);
				parent.ellipse(xval, yval, 30, 30);
			}  else if (moles.get(i).getChemical() == 4) {
				parent.fill(255, 155, 0);
				parent.ellipse(xval, yval, 30, 30);
		}

	}

}
	
}
