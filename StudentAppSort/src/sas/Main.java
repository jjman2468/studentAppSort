package sas;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		m.stduent_run();
		// m.fruit_run();
	}

	public void stduent_run() {

		ArrayList<Student> al = new ArrayList<Student>();
		System.out.println("Student List");
		Student s1 = new Student(101, "E", 27);
		al.add(s1);
		Student s2 = new Student(103, "B", 23);
		al.add(s2);
		Student s3 = new Student(105, "Z", 21);
		al.add(s3);
		Student s4 = new Student(108, "S", 32);
		al.add(s4);
		Student s5 = new Student(110, "H", 21);
		al.add(s5);
		Student s6 = new Student(102, "C", 28);
		al.add(s6);
		Student s7 = new Student(109, "K", 25);
		al.add(s7);
		Student s8 = new Student(101, "E", 24);
		al.add(s8);
		Student s9 = new Student(101, "A", 28);
		al.add(s9);
		Student s10 = new Student(101, "D", 20);
		al.add(s10);

		Collections.sort(al);

		for (Student a : al)
			System.out.println(a.toString());
	}
}
