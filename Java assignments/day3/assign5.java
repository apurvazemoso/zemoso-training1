package day3;
class o1{
	public class i1{
		i1(String s1){
			System.out.println(s1);
		}
	}
}



public class assign5{
	public class i2 extends o1.i1{
		i2(String name){
			new o1().super("First inner class calls second inner class and prints this - "+name); //analogous to new o1().new i1("name");
		}
	}

	public static void main(String[] args){
		i2 obj2 = new assign5().new i2("This is inner class");
	}
}
