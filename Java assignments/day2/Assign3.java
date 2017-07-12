/**
 * Created by zemoso on 11/7/17.
 */

package day2;

import java.lang.reflect.Constructor;

public class Assign3 {

	private String name;

    Assign3(){
    	this("Apurva");
    }

    Assign3(String name){
        this.name = name;
        System.out.println("One parameter constructor with name "+this.name);
    }

    public static void main(String[] args) {

    	/*Initialiation message doesnt get printed by creation of array in JAVA, 
    	default initialization doesn't occur on creation of array. So, no constructor is called,
    	so nothing gets printed.*/

        Assign3[]  abs = new Assign3[10];
    }
}