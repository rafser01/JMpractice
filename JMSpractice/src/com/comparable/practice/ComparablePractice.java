package com.comparable.practice;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
 

public class ComparablePractice {

	public static void main(String[] args) {
		 ArrayList<Fruits> fruitList=new ArrayList<Fruits>();

		 fruitList.add(new Fruits("Mango", 10));
		 fruitList.add(new Fruits("Apple", 20));
		 fruitList.add(new Fruits("Banana", 5));
//		Collections.sort(fruitList);
		 Collections.sort(fruitList, Fruits.FruitsComparator);
		  
		for(Fruits f:fruitList){
			System.out.println(f.getFruitName()+" "+f.getQuantity());
		}
	}

}
