import java.util.ArrayList;
import processing.core.PApplet;

public class Model {

	PApplet parent;

	public static float aConc;
	public static float bConc;
	public static float cConc;
	public static float dConc;
	public static float eConc;
	
	

	public static float k1;
	public static float k2;
	public static float k3;
	public static float k4;
	public static float k5;
	public static float k6;
	
	

	public static float molesA;
	public static float molesB;
	public static float molesC;
	public static float molesD;
	public static float molesE;
	
	

	public static float aChance;
	public static float bChance;
	public static float cChance;
	public static float dChance;
	public static float eChance;
	
	

	public float aRate;
	public float bRate;
	public float cRate;
	public float dRate;
	public float eRate;
	
	

	public float aTemp;
	public float bTemp;
	public float cTemp;
	public float dTemp;
	public float eTemp;
	
	

	public float aCut;
	public float bCut;
	public float cCut;
	public float dCut;
	

	public Model(PApplet p) {
		parent = p;
		System.out.println(k1);
	}

	// percentage simulation
	Chemical[][] simulation = new Chemical[10][10];

	// molar simulation
	ArrayList<Chemical> moles = new ArrayList<Chemical>();

	// graph simulation
	ArrayList<GraphPoint> graphA = new ArrayList<GraphPoint>();
	ArrayList<GraphPoint> graphB = new ArrayList<GraphPoint>();
	ArrayList<GraphPoint> graphC = new ArrayList<GraphPoint>();
	ArrayList<GraphPoint> graphD = new ArrayList<GraphPoint>();
	ArrayList<GraphPoint> graphE = new ArrayList<GraphPoint>();

	public void initialize() {
		aConc = ChemicalEquil.initialaConc;
		bConc = ChemicalEquil.initialbConc;
		cConc = ChemicalEquil.initialcConc;
		dConc = ChemicalEquil.initialdConc;
		eConc = ChemicalEquil.initialeConc;

		k1 = ChemicalEquil.initialk1;
		k2 = ChemicalEquil.initialk2;
		k3 = ChemicalEquil.initialk3;
		k4 = ChemicalEquil.initialk4;
		
		k5 = ChemicalEquil.initialk5;
		k6 = ChemicalEquil.initialk6;

	}

	public void setRates() {
		aRate = -(k1 * aConc * bConc) + (k2 * cConc * eConc) - (k5 * aConc) + (k6 * dConc * eConc);
		bRate = -(k1 * aConc * bConc) + (k2 * cConc * eConc) + (k3 * cConc) - (k4 * dConc * bConc);
		cRate = (k1 * aConc * bConc) - (k2 * cConc * eConc) - (k3 * cConc) + (k4 * dConc * bConc);
		dRate = (k3 * cConc) - (k4 * dConc * bConc) + (k5 * aConc) - (k6 * dConc * eConc);
		eRate = (k1 * aConc * bConc) - (k2 * cConc * eConc) + (k5 * aConc) - (k6 * dConc * eConc);
		

		aTemp = aConc + (aRate * ChemicalEquil.timeStep);
		aConc = aTemp;

		bTemp = bConc + (bRate * ChemicalEquil.timeStep);
		bConc = bTemp;

		cTemp = cConc + (cRate * ChemicalEquil.timeStep);
		cConc = cTemp;

		dTemp = dConc + (dRate * ChemicalEquil.timeStep);
		dConc = dTemp;
		
		eTemp = eConc + (eRate * ChemicalEquil.timeStep);
		eConc = eTemp;
	}

}
