package day3;

class Cycle {
	public void Task1() {
		System.out.println("Cycle is doing Task1()"); }
}

class Unicycle extends Cycle{
	public void balance() {
		System.out.println("Unicycle is balanced"); }
}


class Bicycle extends Cycle{
	public void balance() {
		System.out.println("Bicycle is balanced"); }
}


class Tricycle extends Cycle{
	Tricycle(){
		System.out.println("Tricycle object created!");
	}
}

public class assign2{

	public static void main(String[] args) {

			Cycle[] cycles = {new Unicycle(), new Bicycle(), new Tricycle()};

			/*The following for loop will give error because it will check type (i.e. Cycle) before method calling. Since there
			is no method named "balance()" insite the Cycle class, it won't be able to find the method.*/

			for(int i = 0;i <= 1; i++) 
			{
				cycles[i].balance();
			}

			//After downcasting, the type is changed to child class i.e. Unicycle and Bicycle respectively. So, method is called.
			Unicycle uc = (Unicycle)cycles[0]; uc.balance();
			Bicycle bc = (Bicycle)cycles[1]; bc.balance();

		}
}