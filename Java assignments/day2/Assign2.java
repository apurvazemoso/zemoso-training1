/**
 * Created by zemoso on 11/7/17.
 */

package day2;

import java.lang.reflect.Constructor;

public class Assign2 {


    Assign2(){
        this(3,4);
    }

    Assign2(int num, int num1){
        System.out.println(num+" "+num1);
    }

    public static void main(String[] args) {
        Assign2 abs = new Assign2();
    }
}
