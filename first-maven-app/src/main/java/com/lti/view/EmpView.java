package com.lti.view;
import com.lti.model.Employee;
public class EmpView {

	public static void main(String[] args) {
Employee emp=new Employee();
emp.setId(1001);
emp.setName("Jinal");

System.out.println("Id: "+emp.getId());
System.out.println("Name: "+emp.getName());

	}

}
