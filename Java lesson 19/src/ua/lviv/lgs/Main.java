package ua.lviv.lgs;
import java.io.File;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
public class Main {
public static void main(String[] args)throws Exception {
	File fileE = new File("Serialization.txt");
	Employee e = new Employee(19, "Ivan", 2300);
	System.out.println(e);
	Methods.serialize(e, fileE);
	System.out.println(Methods.deserealize(fileE));

	System.out.println();

	File fileEmployeeList = new File("EmployeeList.obj");
	List<Employee> el = new ArrayList<Employee>();
	el.add(new Employee(57, "Vlad", 1500));
	el.add(new Employee(33, "Roman", 1900));
	el.add(new Employee(27, "Vika", 2500));
	el.add(new Employee(29, "Bohdan", 1500));
	el.add(new Employee(35, "Vova", 1700));
	for (Employee em : el) {
		System.out.println(em);
	}
}
}
