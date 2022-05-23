package com.atos;

import com.org.*;
import com.shapes.*;

public class InheritanceDemo {

	public static void main(String[] args) {
      //Employee emp = new Employee(101,"Zakir","Developer");//
      //System.out.println(emp);//
      
      
      /*Manager mgr1=new Manager(101,"Zakir","Developer",201);
      Manager mgr2=new Manager(102,"Hussain","Developer",202);
      System.out.println(mgr1);
      System.out.println(mgr2);*/
		
	  /*Student st=new Student();
	  st.setstudentid(101);
	  st.setstudentname("Zakir");
	  st.setstudentmarks*/
		
		
		
		Circle obj=new Circle(6);
		obj.draw();
		
		Rectangle obj2=new Rectangle(5,6);
		obj2.draw();
		
		Square obj3=new Square(4);
		obj3.display();
		obj3.draw();
		obj3.draw2d();
	}
    
}

