import processing.core.PApplet;

public class GraphModel extends Model implements Simulation {

	GraphModel(PApplet p) {
		super(p);
	}

	public void initialize() {
		graphA.add(new GraphPoint(ChemicalEquil.time, aConc, 0));
		graphB.add(new GraphPoint(ChemicalEquil.time, bConc, 1));
		graphC.add(new GraphPoint(ChemicalEquil.time, cConc, 2));
		graphD.add(new GraphPoint(ChemicalEquil.time, dConc, 3));
		graphE.add(new GraphPoint(ChemicalEquil.time, eConc, 4));
	}

	public void runSim() {
		
		graphA.add(new GraphPoint(ChemicalEquil.time, aConc, 0));
		graphB.add(new GraphPoint(ChemicalEquil.time, bConc, 1));
		graphC.add(new GraphPoint(ChemicalEquil.time, cConc, 2));
		graphD.add(new GraphPoint(ChemicalEquil.time, dConc, 3));
		graphE.add(new GraphPoint(ChemicalEquil.time, eConc, 4));
		
	}

	public void drawSim() {

		parent.stroke(0);
		parent.line(100, 800, 900, 800); // time axis from 100 to 900 (LENGTH OF 800)
		parent.line(100, 520, 100, 800); // concentration axis from 520 to 800 (HEIGHT OF 280)

		
		float timeAxisDifference = defineTimeAxis();
		float concentrationAxisDifference = defineConcentrationAxis();
		
		parent.noFill();
		parent.stroke(255, 0, 0);

		parent.beginShape();
		for (int i = 0; i < graphA.size(); i++) {
			float xPosition = (graphA.get(i).getTime() / timeAxisDifference) * 800;
			xPosition = xPosition + 100;

			float yPosition = -(graphA.get(i).getConcentration() / concentrationAxisDifference) * 280;
			yPosition = 800 + yPosition;

			parent.curveVertex(xPosition, yPosition);
		}
		parent.endShape();

		parent.stroke(0, 255, 0);

		parent.beginShape();
		for (int i = 0; i < graphB.size(); i++) {
			float xPosition = (graphB.get(i).getTime() / timeAxisDifference) * 800;
			xPosition = xPosition + 100;

			float yPosition = -(graphB.get(i).getConcentration() / concentrationAxisDifference) * 280;
			yPosition = 800 + yPosition;

			parent.curveVertex(xPosition, yPosition);
		}
		parent.endShape();

		parent.stroke(0, 0, 255);

		parent.beginShape();
		for (int i = 0; i < graphC.size(); i++) {
			float xPosition = (graphC.get(i).getTime() / timeAxisDifference) * 800;
			xPosition = xPosition + 100;

			float yPosition = -(graphC.get(i).getConcentration() / concentrationAxisDifference) * 280;
			yPosition = 800 + yPosition;

			parent.curveVertex(xPosition, yPosition);
		}
		parent.endShape();

		parent.stroke(0);

		parent.beginShape();
		for (int i = 0; i < graphD.size(); i++) {
			float xPosition = (graphD.get(i).getTime() / timeAxisDifference) * 800;
			xPosition = xPosition + 100;

			float yPosition = -(graphD.get(i).getConcentration() / concentrationAxisDifference) * 280;
			yPosition = 800 + yPosition;

			parent.curveVertex(xPosition, yPosition);
		}
		parent.endShape();
		
		parent.stroke(255, 155, 0);
		
		parent.beginShape();
		for (int i = 0; i < graphE.size(); i++) {
			float xPosition = (graphE.get(i).getTime() / timeAxisDifference) * 800;
			xPosition = xPosition + 100;

			float yPosition = -(graphE.get(i).getConcentration() / concentrationAxisDifference) * 280;
			yPosition = 800 + yPosition;

			parent.curveVertex(xPosition, yPosition);
		}
		parent.endShape();
		
		
		labelAxis(concentrationAxisDifference);
		
		
	}

	public float defineTimeAxis() {
		float timeLength = 0;
		for (int i = 0; i < graphA.size(); i++) {
			if (graphA.get(i).getTime() > timeLength) {
				timeLength = graphA.get(i).getTime();
			}
		}

		return timeLength;

	}

	public float defineConcentrationAxis() {
		float concentrationLength = 0;
		for (int i = 0; i < graphA.size(); i++) {
			if (graphA.get(i).getConcentration() > concentrationLength) {
				concentrationLength = graphA.get(i).getConcentration();
			}
			if (graphB.get(i).getConcentration() > concentrationLength) {
				concentrationLength = graphB.get(i).getConcentration();
			}
			if (graphC.get(i).getConcentration() > concentrationLength) {
				concentrationLength = graphC.get(i).getConcentration();
			}
			if (graphD.get(i).getConcentration() > concentrationLength) {
				concentrationLength = graphD.get(i).getConcentration();
			}
			if (graphE.get(i).getConcentration() > concentrationLength) {
				concentrationLength = graphE.get(i).getConcentration();
			}
		}

		return concentrationLength;

	}
	
	public void labelAxis(float concentrationAxisLength) {
		
		float c = concentrationAxisLength;
		
		parent.fill(0);
		
		parent.text("0", 100, 810);
		parent.text(ChemicalEquil.time, 900, 810);
		parent.text(ChemicalEquil.time/2, 500, 810);
		
		parent.text("Time (s)", 500, 825);
		
		
		parent.text("0", 70, 800);
		parent.text(c, 70, 520);
		parent.text(c/2, 70, 660);
		
		parent.translate(30, 660);
		parent.rotate(-parent.radians(90));
		parent.text("Concentration (M)", 0, 0);
		
		parent.rotate(parent.radians(90));
		parent.translate(-30, -660);
	}
}