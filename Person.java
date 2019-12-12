package humanity;

public class Person {
	private String name;
	private Person friend;
	
	public Person(String name) {
		this.name = name;
		friend = null;
	}

	public String getName() {
		return name;
	}
	public boolean addFriend(Person friend) {
		if(friend == null) {
			return false;
		}
		else if(this == friend) {
			return false;
		}
		else if(this.friend != null) {
			return false;
		}
		this.friend = friend;
		return true;
	}
	public boolean removeFriend() {
		if(friend == null) {
			return false;
		}
		friend = null;
		return true;
	}
	public boolean isLonely() {
		if(friend != null) {
			return false;
		}
		return true;
	}
	public String getFriendName() {
		if(friend.name == null) {
			String a = null;
			return a;
		}
		return friend.name;
	}
}
