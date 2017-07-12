package day3;

class Mouse extends Rodent{
	Mouse(){
		System.out.println("Mouse object formed!");
	}
	public void Task1() {
		System.out.println("Mouse is doing Task1()"); }
	public void task2() { 
		System.out.println("Mouse is doing Task2()");}
}

class Gerbil extends Rodent{
	Gerbil(){
		System.out.println("Gerbil object formed!");
	}
	public void Task1() {
		System.out.println("Gerbil is doing Task1()"); }
	public void task2() { 
		System.out.println("Gerbil is doing Task2()");}
	}
class Hambster extends Rodent{
	Hambster(){
		System.out.println("Hambster object formed!");
	}
	public void Task1() {
		System.out.println("Hambster is doing Task1()"); }
	public void task2() { 
		System.out.println("Hambster is doing Task2()");}

}
abstract class Rodent {
	public void Task1() {
		System.out.println("Rodent is doing Task1()"); }
	abstract public void task2();
}

class assign1{

	public static void main(String[] args) {
		Rodent[] animal = {new Mouse(), new Hambster(), new Gerbil()};
		for(int i = 0;i <= 2; i++) 
			{
				animal[i].Task1();
				animal[i].task2();
			}
		}
}
