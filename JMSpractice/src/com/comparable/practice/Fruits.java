package com.comparable.practice;
import java.util.*;

public class Fruits implements Comparable<Fruits> {
String fruitName;
int quantity;
public Fruits(String fruitName, int quantity) {
	super();
	this.fruitName = fruitName;
	this.quantity = quantity;
}
public String getFruitName() {
	return fruitName;
}
public void setFruitName(String fruitName) {
	this.fruitName = fruitName;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
@Override
public int compareTo(Fruits compareTo) {
	// TODO Auto-generated method stub
	return compareTo.quantity-this.quantity;
}
public static Comparator<Fruits> FruitsComparator=new Comparator <Fruits>(){

	@Override
	public int compare(Fruits o1, Fruits o2) {
		String firstFruitName=o1.getFruitName().toLowerCase();
		String secondFruitName=o2.getFruitName().toLowerCase();
		return firstFruitName.compareTo(secondFruitName);
	}
	
	
};


}
