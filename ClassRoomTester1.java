package assignment03;

import assignment03.ClassRoom;
import assignment03.Student;

public class ClassRoomTester1 {

	public static void main(String[] args) {
		ClassRoom c1 = new ClassRoom();

		c1.addStudent(new Student(32, "selin"));
		c1.addStudent(new Student(41, "eylul"));
		c1.addStudent(new Student(52, "begum"));
		c1.addStudent(new Student(66, "doga"));
		c1.addStudent(new Student(29, "nazli"));

		ClassRoom c2 = new ClassRoom();

		c2.addStudent(new Student(53, "Gina"));
		c2.addStudent(new Student(91, "ali"));
		c2.addStudent(new Student(74, "baris"));
		c2.addStudent(new Student(38, "ceyda"));
		c2.addStudent(new Student(50, "deniz"));

		ClassRoom c3 = new ClassRoom();

		c3.addStudent(new Student(23, "Gabby"));
		c3.addStudent(new Student(4, "elif"));
		c3.addStudent(new Student(58, "faith"));
		c3.addStudent(new Student(17, "gungor"));
		c3.addStudent(new Student(21, "kaan"));

		ClassRoom c4 = new ClassRoom();

		c4.addStudent(new Student(69, "lara"));
		c4.addStudent(new Student(25, "koray"));
		c4.addStudent(new Student(69, "brittaney"));
		c4.addStudent(new Student(72, "zeynep"));
		c4.addStudent(new Student(84, "ted"));


		ClassRoom.sortById(c3.getRoster());
		System.out.println(c3);
		System.out.println(c1.isRegistered(5));
		System.out.println(c1.isRegistered(32));
		//System.out.println(c1.alsoRegisteredIn(c2,c3,c4));
		System.out.println(ClassRoom.registeredInAll(c2,c3,c4));
		System.out.println(ClassRoom.registeredInOne(c1,c3,c2));

	}



}
