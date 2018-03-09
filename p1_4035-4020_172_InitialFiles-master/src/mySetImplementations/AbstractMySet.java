package mySetImplementations;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import interfaces.MySet;

public abstract class AbstractMySet<E> implements MySet<E> {

	public Set1 set1;
	public Set1 unionSet;
	
	public boolean isEmpty() { 
		return size() == 0; 
	}

	public String toString() { 
		String s = ""; 
		boolean first = true; 
		for (E e : this) {
			if (first) {
				s = "{" + e; 
				first = false;     
			}
			else
				s += ", " + e;
		}
		return s + "}"; 
	}

	public <T> T[] toArray(T[] arr) { 
		if (arr.length < this.size()) { 
			// if arr.length < this.size, allocate a new array of the same 
			// type as arr (components of the new array are set to be of equal
			// runtime type as components of the original array arr) 
			// and big enough to hold all the elements in this set. For 
			// this, we need to use the Array class....
			arr = (T[]) Array.newInstance(arr.getClass().getComponentType(), this.size());
		} else if (arr.length > this.size()) 
			// Set to null all those positions of arr that won't be used. 
			for (int j=this.size(); j< arr.length; j++) 
				arr[j] = null;

		int i = 0;
		for (E e: this) {
			arr[i] = (T) e;   // It is assumed E can be casted to T
			i++;
		}
		return arr;	
	}

	public Object[] toArray() { 
		Object[] array = new Object[this.size()]; 
		int i = 0;
		for (E e: this) {
			array[i] = e;
			i++;
		}
		return array;	

	}

	public MySet<E> intersectSects(MySet<E>[] t) {//
	/**Partially works, temporarily removes a single element from the array intead of every instance of the object from the collection
	 * 	
	 */
		for(int i = 0; i< t.length; i++) {
		for(E e : t[i]) {
			if(t[i].contains(e)) {
			this.remove(e);
		}
		}
		}
		
		System.out.println("Ok");
		
		return set1;


     
    }
	
	public ArrayList<MySet<E>>  Union(Set1 a, Set1 b){//Made changes to it to be able to add the several sets to an arrayList
	/**The main reason is that this array will be the array in the parameter of the intersection method
	 * According to the document, first we called on union and then intersection
	 * Works partially because it removes the element e from a single set instead of removing every instance of the object
	 *This method now calls on the intersection class to be able to add the sets to the array 
	 */
		ArrayList<MySet<E>> newArray = new ArrayList<MySet<E>>();
	    newArray.add(a);
	    newArray.add(b);
	    
	    MySet[] x =  new MySet[this.size()];
	    for(int i =0; i< newArray.size(); i++) {
	    	x[i] = newArray.get(i);
	    }

	   this.intersectSects( x);
	    return newArray;
	}
	
	
	public static void main(String args[]){
        Set1 a = new Set1<>();
        a.add("a");
        a.add("b");

        Set1 b = new Set1<>();
        b.add("v");
        b.add("r");
        b.add("a");
    System.out.println(a.Union(a, b));

    } 
	public Set1 <E> getUnion(){
		return this.unionSet;
	}

	
	public abstract Iterator<E> iterator(); 
	public abstract Object clone()  throws CloneNotSupportedException; 
}

