package com.lists;
import java.util.*;

public class Lists {

	public static void main(String[] args) {
		String[] veggies = {"Tomatoes","Carrots","Potatoes","Cabbage"};
		List<String> list1 = new ArrayList<String>();
		for(String x: veggies) 
		list1.add(x);
		
		for(int i =0;i<list1.size();i++) {
			System.out.printf("%s",list1.get(i)+"\n");
		}
		
		System.out.println("--------");
		
		String[] fruits = {"Oranges","Apples","Bananas"};
		List<String> list2 = new ArrayList<String>();
		for(String y: fruits) 
			list2.add(y);
			
		for(int j =0;j<list2.size();j++) 
			System.out.printf("%s",list2.get(j)+"\n");
	
	}
		}