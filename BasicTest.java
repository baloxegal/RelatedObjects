package tests;

import humanity.*;;

public class BasicTest {
	
	public static int runCase() {
		
		int percentage = 0;
		
		Person guy = new Person("John");
			
		if(guy.addFriend(guy)) {
			System.err.println("Add test failed\nREASON: Person cannot add himself as a friend!");
			return percentage;
		}
		percentage += 20;
		if(guy.addFriend(null)) {
			System.err.println("Add test failed\nREASON: Person can not add NULL as a friend!");
			return percentage;
		}
		percentage += 20;
		if(!guy.addFriend(new Person("Marry"))) {
			System.err.println("Add test failed\nREASON: Person did not add another Person (object) as a friend!");
			return percentage;
		}
		percentage += 20;
		if(!guy.removeFriend()) {
			System.err.println("Remove test failed\nREASON: Person did not remove Person (object) as a friend!");
			return percentage;
		}
		percentage += 20;
		if(!guy.isLonely()) {
			System.err.println("Status test failed\nREASON: Person was not lonely after removing Person (object) as a friend!");
			return percentage;
		}
		percentage += 20;
		return percentage;
	}
}
