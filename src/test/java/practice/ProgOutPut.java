package practice;

import java.util.LinkedList;

public class ProgOutPut {
	// What will this program print out to the console when executed?
	public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(5);
        list.add(1);
        list.add(10);
        System.out.println(list);
    }

}
//[5, 1, 10]