import processing.core.PApplet;

public class StartScreen {
	
	PApplet p;
	
	public StartScreen(PApplet parent) {
		p = parent;
	}
	
	public void drawMenu() {
		p.background(255);
		
		//Reaction description imported screenshot
		p.imageMode(p.CENTER);
		p.image(ChemicalEquil.info, 700, 225, 550, 400);
		
		p.textAlign(p.CENTER, p.CENTER);
		
		//Sliders
		p.fill(0);
		p.stroke(0);
		p.textSize(15);
		
		//A Concentration
		p.triangle(10, 500, 100, 435, 190, 500);
		p.text("A Concentration (M): " + ((float)PApplet.round(Model.aConc * 10)) / 10, 100, 525);
		p.triangle(10, 550, 100, 615, 190, 550);
		
		if(p.mouseX > 10 && p.mouseX < 190 && p.mouseY > 435 && p.mouseY < 500 && p.mousePressed == true) {
			Model.aConc += 0.1;
		} else if(p.mouseX > 10 && p.mouseX < 190 && p.mouseY > 550 && p.mouseY < 615 && p.mousePressed == true) {
			Model.aConc -= 0.1;
		}
		
		//B Concentration
		p.triangle(210, 500, 300, 435, 390, 500);
		p.text("B Concentration (M): " + ((float)PApplet.round(Model.bConc * 10)) / 10, 300, 525);
		p.triangle(210, 550, 300, 615, 390, 550);
		
		if(p.mouseX > 210 && p.mouseX < 390 && p.mouseY > 435 && p.mouseY < 500 && p.mousePressed == true) {
			Model.bConc += 0.1;
		} else if(p.mouseX > 210 && p.mouseX < 390 && p.mouseY > 550 && p.mouseY < 615 && p.mousePressed == true) {
			Model.bConc -= 0.1;
		}
		
		//C Concentration
		p.triangle(410, 500, 500, 435, 590, 500);
		p.text("C Concentration (M): " + ((float)PApplet.round(Model.cConc * 10)) / 10, 500, 525);
		p.triangle(410, 550, 500, 615, 590, 550);
		
		if(p.mouseX > 410 && p.mouseX < 590 && p.mouseY > 435 && p.mouseY < 500 && p.mousePressed == true) {
			Model.cConc += 0.1;
		} else if(p.mouseX > 410 && p.mouseX < 590 && p.mouseY > 550 && p.mouseY < 615 && p.mousePressed == true) {
			Model.cConc -= 0.1;
		}
		
		//D Concentration
		p.triangle(610, 500, 700, 435, 790, 500);
		p.text("D Concentration (M): " + ((float)PApplet.round(Model.dConc * 10)) / 10, 700, 525);
		p.triangle(610, 550, 700, 615, 790, 550);
		
		if(p.mouseX > 610 && p.mouseX < 790 && p.mouseY > 435 && p.mouseY < 500 && p.mousePressed == true) {
			Model.dConc += 0.1;
		} else if(p.mouseX > 610 && p.mouseX < 790 && p.mouseY > 550 && p.mouseY < 615 && p.mousePressed == true) {
			Model.dConc -= 0.1;
		}
		
		//E Concentration
		p.triangle(810, 500, 900, 435, 990, 500);
		p.text("E Concentration (M): " + ((float)PApplet.round(Model.eConc * 10)) / 10, 900, 525);
		p.triangle(810, 550, 900, 615, 990, 550);
		
		if(p.mouseX > 810 && p.mouseX < 990 && p.mouseY > 435 && p.mouseY < 500 && p.mousePressed == true) {
			Model.eConc += 0.1;
		} else if(p.mouseX > 810 && p.mouseX < 990 && p.mouseY > 550 && p.mouseY < 615 && p.mousePressed == true) {
			Model.eConc -= 0.1;
		}
		
		//Volume
		p.triangle(1010, 500, 1100, 435, 1190, 500);
		ChemicalEquil.volume = ((float)PApplet.round(ChemicalEquil.volume * 10)) / 10;
		p.text("Volume (L): " + ChemicalEquil.volume, 1100, 525);
		p.triangle(1010, 550, 1100, 615, 1190, 550);
		
		if(p.mouseX > 1010 && p.mouseX < 1190 && p.mouseY > 435 && p.mouseY < 500 && p.mousePressed == true) {
			ChemicalEquil.volume += 0.1;
		} else if(p.mouseX > 1010 && p.mouseX < 1190 && p.mouseY > 550 && p.mouseY < 615 && p.mousePressed == true) {
			ChemicalEquil.volume -= 0.1;
		}
		
		//K1
		p.triangle(10, 700, 100, 635, 190, 700);
		Model.k1 = ((float)PApplet.round(Model.k1 * 100)) / 100;
		p.text("K1 " + Model.k1, 100, 725);
		p.triangle(10, 750, 100, 815, 190, 750);
		
		if(p.mouseX > 10 && p.mouseX < 190 && p.mouseY > 635 && p.mouseY < 700 && p.mousePressed == true) {
			Model.k1 += 0.01;
		} else if(p.mouseX > 10 && p.mouseX < 190 && p.mouseY > 750 && p.mouseY < 815 && p.mousePressed == true) {
			Model.k1 -= 0.01;
		}
		
		//K2
		p.triangle(210, 700, 300, 635, 390, 700);
		Model.k2 = ((float)PApplet.round(Model.k2 * 100)) / 100;
		p.text("K2 " + Model.k2, 300, 725);
		p.triangle(210, 750, 300, 815, 390, 750);
		
		if(p.mouseX > 210 && p.mouseX < 390 && p.mouseY > 635 && p.mouseY < 700 && p.mousePressed == true) {
			Model.k2 += 0.01;
		} else if(p.mouseX > 210 && p.mouseX < 390 && p.mouseY > 750 && p.mouseY < 815 && p.mousePressed == true) {
			Model.k2 -= 0.01;
		}
		
		//K3
		p.triangle(410, 700, 500, 635, 590, 700);
		Model.k3 = ((float)PApplet.round(Model.k3 * 100)) / 100;
		p.text("K3 " + Model.k3, 500, 725);
		p.triangle(410, 750, 500, 815, 590, 750);
		
		if(p.mouseX > 410 && p.mouseX < 590 && p.mouseY > 635 && p.mouseY < 700 && p.mousePressed == true) {
			Model.k3 += 0.01;
		} else if(p.mouseX > 410 && p.mouseX < 590 && p.mouseY > 750 && p.mouseY < 815 && p.mousePressed == true) {
			Model.k3 -= 0.01;
		}
		
		//K4
		p.triangle(610, 700, 700, 635, 790, 700);
		Model.k4 = ((float)PApplet.round(Model.k4 * 100)) / 100;
		p.text("K4 " + Model.k4, 700, 725);
		p.triangle(610, 750, 700, 815, 790, 750);
		
		if(p.mouseX > 610 && p.mouseX < 790 && p.mouseY > 635 && p.mouseY < 700 && p.mousePressed == true) {
			Model.k4 += 0.01;
		} else if(p.mouseX > 610 && p.mouseX < 790 && p.mouseY > 750 && p.mouseY < 815 && p.mousePressed == true) {
			Model.k4 -= 0.01;
		}
		
		//K5
		p.triangle(810, 700, 900, 635, 990, 700);
		Model.k5 = ((float)PApplet.round(Model.k5 * 100)) / 100;
		p.text("K5 " + Model.k5, 900, 725);
		p.triangle(810, 750, 900, 815, 990, 750);
		
		if(p.mouseX > 810 && p.mouseX < 990 && p.mouseY > 635 && p.mouseY < 700 && p.mousePressed == true) {
			Model.k5 += 0.01;
		} else if(p.mouseX > 810 && p.mouseX < 990 && p.mouseY > 750 && p.mouseY < 815 && p.mousePressed == true) {
			Model.k5 -= 0.01;
		}
		
		//K6
		p.triangle(1010, 700, 1100, 635, 1190, 700);
		Model.k6 = ((float)PApplet.round(Model.k6 * 100)) / 100;
		p.text("K6 " + Model.k6, 1100, 725);
		p.triangle(1010, 750, 1100, 815, 1190, 750);
		
		if(p.mouseX > 1010 && p.mouseX < 1190 && p.mouseY > 635 && p.mouseY < 700 && p.mousePressed == true) {
			Model.k6 += 0.01;
		} else if(p.mouseX > 1010 && p.mouseX < 1190 && p.mouseY > 750 && p.mouseY < 815 && p.mousePressed == true) {
			Model.k6 -= 0.01;
		}
		
		//Time Step
		p.triangle(1210, 500, 1300, 435, 1390, 500);
		ChemicalEquil.timeStep = ((float)PApplet.round(ChemicalEquil.timeStep * 100)) / 100;
		p.text("Time Step Value (s): " + ChemicalEquil.timeStep, 1300, 525);
		p.triangle(1210, 550, 1300, 615, 1390, 550);
		
		if(p.mouseX > 1210 && p.mouseX < 1390 && p.mouseY > 435 && p.mouseY < 500 && p.mousePressed == true) {
			ChemicalEquil.timeStep += 0.01;
		} else if(p.mouseX > 1210 && p.mouseX < 1390 && p.mouseY > 550 && p.mouseY < 615 && p.mousePressed == true) {
			ChemicalEquil.timeStep -= 0.01;
		}
		
		//Start
		p.fill(0, 255, 0);
		p.rect(1210, 635, 180, 180);
		p.textSize(30);
		p.fill(0);
		p.text("Start", 1300, 725);
		
		if(p.mouseX > 1210 && p.mouseX < 1390 && p.mouseY > 635 && p.mouseY < 815 && p.mousePressed == true && ChemicalEquil.pressed == false) {
			ChemicalEquil.paused = false;
			ChemicalEquil.pressed = true;
			System.out.println("Paused = " + ChemicalEquil.paused);
		} else if (p.mousePressed == false) {
			ChemicalEquil.pressed = false;
			System.out.println("here");
		}
		
		//Checking for negative values
		if(Model.aConc <= 0) {
			Model.aConc = 0;
		}
		
		if(Model.bConc <= 0) {
			Model.bConc = 0;
		}
		
		if(Model.cConc <= 0) {
			Model.cConc = 0;
		}
		
		if(Model.dConc <= 0) {
			Model.dConc = 0;
		}
		
		if(Model.eConc <= 0) {
			Model.eConc = 0;
		}
		
		if(ChemicalEquil.volume <= 0) {
			ChemicalEquil.volume = 0;
		}
		
		if(ChemicalEquil.timeStep <= 0) {
			ChemicalEquil.timeStep = 0;
		}
		
		if(Model.k1 <= 0) {
			Model.k1 = 0;
		}
		
		if(Model.k2 <= 0) {
			Model.k2 = 0;
		}
		
		if(Model.k3 <= 0) {
			Model.k3 = 0;
		}
		
		if(Model.k4 <= 0) {
			Model.k4 = 0;
		}
		
		if(Model.k5 <= 0) {
			Model.k5 = 0;
		}
		
		if(Model.k6 <= 0) {
			Model.k6 = 0;
		}
	}

}
