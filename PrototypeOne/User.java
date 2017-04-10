package models;

public class User {
	public int id;
	public String userName;
	public String password;
	public String email;

	//constructors
	public User(){
		id = 1;
		userName = "username";
		password = "12345";
		email = "email";
	}

	//simple get methods
	public int getId(){
		return id;
	}

	public String getUserName(){
		return userName;
	}

	public String getPassword(){
		return password;
	}

	public String getEmail(){
		return email;
	}

	//simple set methods
	public void setId(int id){
		this.id = id;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void put(int id2, User user) {
		// TODO Auto-generated method stub

	}

}
