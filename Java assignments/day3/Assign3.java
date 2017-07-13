package day3;

interface i1{
	public void t1();
	public void t2();
}

interface i2{
	public void t3();
	public void t4();
}

interface i3{
	public void t5();
	public void t6();
}

interface i4 extends i1,i2,i3{
	public void t7();
}

class concreteClass implements i1{
	public void t1(){}
	public void t2(){}
}

class Required extends concreteClass implements i4{
	public void t3(){}
	public void t4(){}
	public void t5(){}
	public void t6(){}
	public void t7(){}
	public void t8(i1 interface1){interface1.t1();}
	public void t9(i2 interface2){interface2.t3();}
	public void t10(i3 interface3){interface3.t5();}
	public void t11(i4 interface4){interface4.t7();}	
}

class Assign3{
	public static void main(String[] args){
	Required req = new Required();
	req.t8(req);
	req.t9(req);
	req.t10(req);
	req.t11(req);
	}
}