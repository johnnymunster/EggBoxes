/*
FarmerJohn.java
J Munster
1 10 2018
*/

//App Class

import java.util.*;

public class FarmerJohn{
	public static void main (String args[]){

	//variables
	int eggs;
	int boxes;
	int eggsLeftOver;


	//objects - external

	Scanner keyboard;
	//(bring)declares and intitates a scanner
	keyboard=new Scanner(System.in);

	//bring in the eggs app
	EggBoxes eggBoxes;
	//creating an instances (connecting them together)
	eggBoxes=new EggBoxes();

	//input- ask the user a question

	//EGGS
	//ask the question
	System.out.println("Enter number of eggs: ");

	//store the answer
	//means grab the next interger coming from out question from the right and stores it in the left
	eggs=keyboard.nextInt();

	//send the answer to the instan class (to the Setter section)
	eggBoxes.setEggs(eggs);

	//process
	//Calculate
	eggBoxes.compute();

	//BOXES
	boxes=eggBoxes.getBoxes();
	System.out.println("Box(es) needed: "+boxes+".");

	//send the answer to the instan class (to the Setter section)
	eggsLeftOver=eggBoxes.getEggsLeftOver();
	System.out.println("Egg(s) Remaining: "+eggsLeftOver+".");
}

}