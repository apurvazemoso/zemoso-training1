package apurva.assignment.main;
import apurva.assignment.data.*;
import apurva.assignment.singleton.*;

class Main{
	public static void main(String[] args) {
		Data firstObj = new Data();
		firstObj.printFields();
		firstObj.printLocals();
		Singleton check = new Singleton();
		check.methodTwo();
	}
	
}
