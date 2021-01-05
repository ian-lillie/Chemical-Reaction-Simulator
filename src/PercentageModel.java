import processing.core.PApplet;

public class PercentageModel extends Model implements Simulation {

	PercentageModel(PApplet p) {
		super(p);
	}

	public void initialize() {

		aChance = aConc / (aConc + bConc + cConc + dConc + eConc) * 100;
		bChance = bConc / (aConc + bConc + cConc + dConc + eConc) * 100;
		cChance = cConc / (aConc + bConc + cConc + dConc + eConc) * 100;
		dChance = dConc / (aConc + bConc + cConc + dConc + eConc) * 100;
		dChance = eConc / (aConc + bConc + cConc + dConc + eConc) * 100;

		aCut = aChance;
		bCut = aChance + bChance;
		cCut = aChance + bChance + cChance;
		dCut = aChance + bChance + cChance + dChance;

		int progression = 0;
		for (int i = 0; i < 10; i++) {
			for (int k = 0; k < 10; k++) {
				if (progression <= aCut) {
					simulation[i][k] = new Chemical(0);
				} else if (progression > aChance && progression <= bCut) {
					simulation[i][k] = new Chemical(1);
				} else if (progression > bChance && progression <= cCut) {
					simulation[i][k] = new Chemical(2);
				} else if (progression > cChance && progression <= dCut) {
					simulation[i][k] = new Chemical(3);
				} else {
					simulation[i][k] = new Chemical(4);
				}

				progression += 1;

			}

		}
	}

	public void runSim() {
		aChance = (aConc / (aConc + bConc + cConc + dConc + eConc)) * 100;
		bChance = (bConc / (aConc + bConc + cConc + dConc + eConc)) * 100;
		cChance = (cConc / (aConc + bConc + cConc + dConc + eConc)) * 100;
		dChance = (dConc / (aConc + bConc + cConc + dConc + eConc)) * 100;
		eChance = (eConc / (aConc + bConc + cConc + dConc + eConc)) * 100;

		aCut = aChance;
		bCut = aChance + bChance;
		cCut = aChance + bChance + cChance;
		dCut = aChance + bChance + cChance + dChance;

		int progression = 0;
		for (int i = 0; i < 10; i++) {
			for (int k = 0; k < 10; k++) {
				if (progression <= aCut) {
					simulation[i][k] = new Chemical(0);
				} else if (progression > aChance && progression <= bCut) {
					simulation[i][k] = new Chemical(1);
				} else if (progression > bChance && progression <= cCut) {
					simulation[i][k] = new Chemical(2);
				} else if (progression > cChance && progression <= dCut) {
					simulation[i][k] = new Chemical(3);
				} else {
					simulation[i][k] = new Chemical(4);
				}

				progression += 1;

			}

		}

	}

	public void drawSim() {

		for (int i = 0; i < 10; i++) {
			for (int k = 0; k < 10; k++) {
				if (simulation[i][k].getChemical() == 0) {
					parent.fill(255, 0, 0);
				} else if (simulation[i][k].getChemical() == 1) {
					parent.fill(0, 255, 0);
				} else if (simulation[i][k].getChemical() == 2) {
					parent.fill(0, 0, 255);
				} else if (simulation[i][k].getChemical() == 3) {
					parent.fill(0);
				} else if (simulation[i][k].getChemical() == 4) {
					parent.fill(255, 155, 0);
				}

				parent.ellipse(i * 50 + 20, k * 50 + 20, 30, 30);

			}
		}

	}

}
