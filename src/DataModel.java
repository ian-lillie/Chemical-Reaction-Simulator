import processing.core.PApplet;

public class DataModel extends Model {

	DataModel(PApplet p) {
		super(p);
	}

	// x values from 1000 to 1300
	// y values from 0 to 850

	public void drawSim() {

		parent.textSize(15);
		parent.textAlign(parent.LEFT, parent.CENTER);
		
		parent.fill(255, 0, 0);
		parent.ellipse(1050, 50, 50, 50);
		parent.text("Concentration: " + aConc, 1100, 50);
		parent.text("Moles: " + (aConc * ChemicalEquil.volume), 1100, 80);
		parent.text("Percentage: " + aChance, 1100, 110);

		parent.fill(0, 255, 0);
		parent.ellipse(1050, 200, 50, 50);
		parent.text("Concentration: " + bConc, 1100, 200);
		parent.text("Moles: " + (bConc * ChemicalEquil.volume), 1100, 230);
		parent.text("Percentage: " + bChance, 1100, 260);

		parent.fill(0, 0, 255);
		parent.ellipse(1050, 350, 50, 50);
		parent.text("Concentration: " + cConc, 1100, 350);
		parent.text("Moles: " + (cConc * ChemicalEquil.volume), 1100, 380);
		parent.text("Percentage: " + cChance, 1100, 410);

		parent.fill(0);
		parent.ellipse(1050, 500, 50, 50);
		parent.text("Concentration: " + dConc, 1100, 500);
		parent.text("Moles: " + (dConc * ChemicalEquil.volume), 1100, 530);
		parent.text("Percentage: " + dChance, 1100, 560);
		
		parent.fill(255, 155, 0);
		parent.ellipse(1050, 650, 50, 50);
		parent.text("Concentration: " + eConc, 1100, 650);
		parent.text("Moles: " + (eConc * ChemicalEquil.volume), 1100, 680);
		parent.text("Percentage: " + eChance, 1100, 710);
		
		
		parent.fill(255);
		parent.textAlign(parent.CENTER, parent.CENTER);
		parent.textSize(40);
		parent.text("A", 1050, 45);
		parent.text("B", 1050, 195);
		parent.text("C", 1050, 345);
		parent.text("D", 1050, 495);
		parent.text("E", 1050, 645);
		
		//adjust values button
		
		parent.fill(255, 0, 0);
		parent.rect(1050, 750, 150, 50);
		parent.textSize(15);
		parent.fill(0);
		parent.text("Adjust Values", 1125, 775);
		
		if(parent.mouseX > 1050 && parent.mouseX < 1200 && parent.mouseY > 750 && parent.mouseY < 800 && parent.mousePressed == true && ChemicalEquil.pressed == false) {
			ChemicalEquil.paused = true;
			ChemicalEquil.pressed = true;
		} else if (parent.mousePressed == false) {
			ChemicalEquil.pressed = false;
		}
		
		//pause button 
		
		parent.fill(0, 0, 255);
		parent.rect(1225, 750, 150, 50);
		parent.fill(0);
		parent.text("Pause", 1300, 775);
		
		if(parent.mouseX > 1225 && parent.mouseX < 1375 && parent.mouseY > 750 && parent.mouseY < 800 && parent.mousePressed == true && ChemicalEquil.stopped == false && ChemicalEquil.pressed == false) {
			ChemicalEquil.stopped = true;
			ChemicalEquil.pressed = true;
		} 
		
	}

}