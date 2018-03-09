package p1MainClasses;

import java.util.Arrays;
import java.util.Random;
import java.util.Set;

import dataGenerator.DataGenerator;
import interfaces.MySet;
import mySetImplementations.AbstractMySet;
import mySetImplementations.Set1;

/*
 * Mother of all main: Constructors for all strategies (P1-P4) and spits output
 */

public class Part1Main{

	public static void main(String[] args) throws CloneNotSupportedException {
	
		
		Set1 s1 = new Set1();
		Set1 s2 = new Set1();
	
		
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s1.add(4);
		s1.add(2);
		//s1.add(rand.nextInt());
//		s2.add(2);
//		s2.add(3);
//		s2.add(4);
	
		MySet[] arr = new MySet[10];
		for(int i =0; i < arr.length; i++) {
			arr[i] = s1;
		}	
		
		System.out.println("Pre intersection method: " + s1);
		System.out.println();
		System.out.println(s1.intersectSects(arr));
		//System.out.println(s1.union(s1, s2).toString());
		
	}
	
	
}