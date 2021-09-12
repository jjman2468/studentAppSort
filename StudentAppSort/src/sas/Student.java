package sas;

public class Student implements Comparable<Student>{
	   
	   private int no;
	   private int age;
	   private String name;
	   
	   public Student(int no,String name,int age) {
	      this.age = age;
	      this.name = name;
	      this.no = no;
	   }
	   
	   @Override
	   public int compareTo(Student o) {
	      // TODO Auto-generated method stub
	      return name.compareTo(o.name);
	   }
	   
	   @Override
	   public String toString() {
	      // TODO Auto-generated method stub
	      return "Student [no ="+this.no+", name="+this.name+", age="+this.age+"]";
	   }
	}