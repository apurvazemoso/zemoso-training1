/**
 * Created by zemoso on 11/7/17.
 */

package day2;

import java.lang.reflect.Constructor;

public class Assign4 {

	private String name;

    Assign4(){
    	this("Apurva");
    }

    Assign4(String name){
        this.name = name;
        System.out.println("One parameter constructor with name " + this.name);
    }

    public static void main(String[] args) {

        Assign4[]  abs = new Assign4[10];
        for (int i = 0; i < 10; i++) {
        	abs[i] = new Assign4();
       	}
    }
}