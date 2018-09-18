import java.util.ArrayList;

import java.util.Scanner;

public class Test {
	
	static ArrayList<Person> people = new ArrayList<>();
	
	public static void main(String args[]) {
//		Person person1 = new Person("Bojana", 20, 80.9);
//		Person person2 = new Person("Harsh", 21, 82.5);
//		System.out.println(person1.name);
//		System.out.println(person2.getDeathDate());
//		
//		ArrayList<Integer> array = new ArrayList<>();
//		array.add(10);
//		array.add(20);
//		array.add(30);
//		array.add(40);
//		System.out.println(array.get(2));
//		
		people.add(new Person("Bojana", 20, 80.9));
		people.add(new Person("Bojana1", 120, 180.9));
		people.add(new Person("Bojana2", 220, 280.9));
		people.add(new Person("Bojana3", 320, 380.9));
		people.add(new Person("Bojana4", 420, 480.9));
		
		//System.out.println(people.get(4).toString());
		
	}
}

class Person {
	String name;
	int age;
	double weight;
	
	public Person() {
		name = "";
		age = 0;
		weight = 0.0;
	}
	
	public Person(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public int getDeathDate() {
		return age + 20;
	}
	
	public String toString() {
		String result = "Name: " + name + " Age: " + age + " Weight: " + weight;
		return result;
	}
}
