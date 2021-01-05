import processing.core.*;

public class ChemicalEquil extends PApplet {

	public static void main(String[] args) {
		PApplet.main(new String[] { "ChemicalEquil" });
	}

	// Global variable declarations
	static float timeStep = 0.05f;
	static float time = 0f;

	public static float initialaConc = 0.8f;
	public static float initialbConc = 0.8f;
	public static float initialcConc = 0.5f;
	public static float initialdConc = 0.2f;
	public static float initialeConc = 0f;

	public static float volume = 15f;

	public static float initialk1 = 0.5f; // A + B --> C
	public static float initialk2 = 0.3f; // C --> A + B
	public static float initialk3 = 0.7f;
	public static float initialk4 = 0.2f;
	public static float initialk5 = 0.01f;
	public static float initialk6 = 0.01f;
	

	int simulationSpeed = 120;

	static boolean paused = true;
	static boolean stopped = false;
	
	static boolean pressed = false;

	Model chemicalModel = new Model(this);
	

	PercentageModel modelOne = new PercentageModel(this);
	MoleModel modelTwo = new MoleModel(this);
	GraphModel modelThree = new GraphModel(this);
	DataModel modelFour = new DataModel(this);
	
	StartScreen menu = new StartScreen(this);
	
	static PImage info;

	public void settings() {
		size(1400, 850);
	}

	public void setup() {

		//setup window and initializations
		
		frameRate(simulationSpeed);
		resetScreen();

		chemicalModel.initialize();

		modelOne.initialize();
		modelTwo.initialize();
		modelThree.initialize();

		modelOne.drawSim();
		modelTwo.drawSim();
		modelThree.drawSim();
		
		info = loadImage("ReactionInfo.png");
	}

	public void draw() {
		
		if(paused && !stopped) {
			//initial screen with sliders to adjust values
			startScreen();
		}

		if(!paused && !stopped) {
			
			//running each individual simulation
			
			resetScreen();
	
			chemicalModel.setRates();
	
			modelOne.runSim();
			modelOne.drawSim();
	
			modelTwo.runSim();
			modelTwo.fluid();
			modelTwo.drawSim();
	
			modelThree.runSim();
			modelThree.drawSim();
	
			modelFour.drawSim();
	
			isFinished();
		
		}
		
		if(stopped) {
			stoppedMode();
		}

	}
	
	public void startScreen() {
		menu.drawMenu();
		
	}

	public static float getTimeStep() {
		return timeStep;
	}

	public static float getTime() {
		return time;
	}

	public void resetScreen() {
		background(255);
		stroke(0);
		line(500, 0, 500, 500);
		line(0, 500, 1000, 500);
		line(1000, 0, 1000, 850);
	}
	
	public void stoppedMode() {
		
		//what happens when the pause button is pressed
		
		fill(0, 0, 255);
		rect(1225, 750, 150, 50);
		fill(0);
		text("Resume", 1300, 775);
		
		if(mouseX > 1225 && mouseX < 1375 && mouseY > 750 && mouseY < 800 && mousePressed == true && ChemicalEquil.stopped == true && ChemicalEquil.pressed == false) {
			ChemicalEquil.stopped = false;
			ChemicalEquil.pressed = true;
		} else if (mousePressed == false) {
			ChemicalEquil.pressed = false;
		}
	}

	public void isFinished() {
		time = time + timeStep;
		if (keyPressed == true) {
			boolean stopped = true;
			while (stopped == true) {
				if (mousePressed == true) {
					stopped = false;
				}
			}
		}
	}

}
