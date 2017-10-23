package com.objects;

public class ObjectCloning2 implements Cloneable {
	String Emp_name;
	int Emp_ID;
	float Salary;
ObjectCloning2(String s,int e,float f){
	Emp_name =s;
	Emp_ID = e;
	Salary = f;
}
public Object Clone()throws CloneNotSupportedException{
	return super.clone();
}	
	public static void main(String[] args) {
	try {
		ObjectCloning2 c2 = new ObjectCloning2("Dhanush",1548,10000.56f);
		ObjectCloning2 c3 = (ObjectCloning2)c2.Clone();
		System.out.println(c2.Emp_ID+" "+c2.Emp_name+" "+c2.Salary );
		System.out.println(c3.Emp_name+" "+c3.Salary+" "+c3.Emp_ID);
	}
		catch
		(CloneNotSupportedException c){};
	}

	

}
