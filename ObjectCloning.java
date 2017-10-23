package com.objects;
public class ObjectCloning implements Cloneable{
	int rollno;
	String name;
ObjectCloning(int a, String b){
	rollno = a;
	name = b;
}
	public Object Cloning() throws CloneNotSupportedException{
	return super.clone();
}
	public static void main(String[] args) {
	try {
		ObjectCloning obj1 = new ObjectCloning(112,"DHANUSH");
		ObjectCloning obj2 = (ObjectCloning)obj1.Cloning();
		System.out.println(obj1.name+" "+obj1.rollno);
		System.out.println(obj2.name+" "+obj2.rollno);
	}
	catch
		(CloneNotSupportedException x) {};
	};

};
