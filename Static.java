package com.statics;

public class Static {

	private int ID = 100;
	private String Name = "DHANUSH";
	private double Salary = 20000;
	private static int EmpCount = 0;
	private int Rooms = 10;
	public Static(int ID,String name, double Salary) {
		this.ID = ID;
		this.Name = name;
		this.Salary = Salary;
		EmpCount++;
		Rooms++;
		}
	
	public int getEmpCount() {
		return EmpCount;
	}
	
	public static void main(String[] args) {
		
		System.out.println(EmpCount);  
		Static st = new Static(113,"DHANUSH",23980);
		System.out.println(st.getEmpCount());// returns static field.
		System.out.println(st.Rooms);
		System.out.println(st.Name);
		System.out.println(st.ID);
		System.out.println(st.Salary);
		System.out.println("------------------------");
		Static st1 = new Static(114,"BHAGATH",25000);
		//static effect takes place in whole class even a new object is created.
		System.out.println(st1.getEmpCount());
		System.out.println(st1.Rooms);
		//doesn't calculate as 11+1(non-static field), Instead, calculated as 10+1 again.
		System.out.println(st1.Name);
		System.out.println(st1.ID);
		System.out.println(st1.Salary);
		System.out.println(st1.Rooms);
	}
};