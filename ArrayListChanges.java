package com.lists;
import java.util.*;

public class ArrayListChanges {

	public static void editlist(Collection<String> c1, Collection<String> c2) {
		Iterator<String> it = c1.iterator();
		while(it.hasNext()) 
			if(c2.contains(it.next())) 
				it.remove();					
		}
	public static void main(String[] args) {
		String[] cars = {"Honda","Hyundai","Nissan","Toyota","Ferrari","Mustang"};
		List<String> lista = new ArrayList<String>();
		for(String a: cars)
			lista.add(a);
		
		// List Before ITERATION
		for(int i=0;i<lista.size();i++)
			System.out.printf("%s",lista.get(i)+"\t");
		
		System.out.println("\n---------------------------------------");
		
		String[] cars2 = {"Lamborghini","Bugatti","Ferrari","Mustang"};
		List<String> listb = new ArrayList<String>();
		for(String b:  cars2)
			listb.add(b);
		
		for(int j=0;j<listb.size();j++)
			System.out.printf("%s",listb.get(j)+"\t");
		
		System.out.println("\n");
	
		editlist(lista,listb);
		
		// LIST AFTER ITERATION
		for(int i=0;i<lista.size();i++)
			System.out.printf("%s",lista.get(i)+"\t");	
	}			
};
	

