/*
Eggs.Java
J Munster
1 10 2018
*/

//Instan class

//Create an application called Eggs

public class EggBoxes{

	//Data members i.e variables
	//data member should be private
	private int eggs;
	private int boxes;
	private int eggsLeftOver;
	final private int DOZEN=12;

	//constuctor
	//assign our private variables (so calcs won't be stolen)
	//when we have an instan class and an app it reasonable for making that happen

	public EggBoxes(){
		eggs=0;
		boxes=0;
		eggsLeftOver=0;


	}

	//setters - input
	//returning in eggs from the app class
	public void setEggs(int eggs){
	//the number1 variable in app class is the same as the eggs variable in the here
	this.eggs=eggs;

	}

	//compute - Calculations
	public void compute(){
	//works out the calculation
	boxes=eggs/DOZEN;
	eggsLeftOver=eggs%DOZEN;

	}


	//Getters - output
	//grab the interger sum from above
	//returns the value to the app
	public int getEggs(){
	return eggs;
	}

	public int getBoxes(){
		return boxes;

	}


	public int getEggsLeftOver(){
		return eggsLeftOver;
	}

}