package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class User {
	public int id;
	public String userName;
	public String firstName;
	public String lastName;
	public String password;
	public String email;
	public String timeStamp;

	Connection dbconnection = play.db.DB.getConnection("default");
	Statement stmt = dbconnection.createStatement();
	
	public User(){
		id = 1;
		userName = "username";
		firstName = "a";
		lastName ="b";
		email = "email";
		password = "12345";
		timeStamp ="12345";
	
	}
	//simple get methods
	public int getId(int id){
		String getIdSql = "SELECT * FROM user WHERE userID = this.id";
		stmt.executeUpdate(getIdSql);
	}

	public String getUserName(String userName){
		String getUserNameSql = "SELECT *FROM user WHERE username = this.userName";
		stmt.executeUpdate(getUserNameSql);
	}

	public String getFirstName(String firstName){
		String getFirstNameSql = "SELECT *FROM user WHERE firstName = this.firstName";
		stmt.executeUpdate(getFirstNameSql);
	}

	public String getLastName(String lastName){
		String getLastNameSql = "SELECT *FROM user WHERE lastName = this.lastName";
		stmt.executeUpdate(getLastNameSql);
	}

	public String getPassword(String password){
		String getPasswordSql = "SELECT *FROM user WHERE password = this.password";
		stmt.executeUpdate(getPasswordSql);
	}

	public String getEmail(String email){
		String getEmailSql = "SELECT *FROM user WHERE emailAddress = this.email";
		stmt.executeUpdate(getEmailSql);
	}

	public String getTimeStamp(String timeStamp){
		String getTimeStampSql = "SELECT *FROM user WHERE dateCreated = this.timeStamp";
		val resultTimeStamp = Statement.executeUpdate(getTimeStampSql);
	}


	public void createUser(String userName, String password, String email) {
		String setUserSql = "INSERT INTO user (username, password, emailAddress)"  +
				"VALUES (this.userName, this.password, this.email)";
		stmt.executeUpdate(setUserSql);
	}

	//individual set methods for setting one at a time
	
	public void setUserName(String userName){
		String setUserNameSql = "INSERT INTO user (username)" +
				"VALUES (this.userName)";
		stmt.executeUpdate(setUserNameSql);
	}

	public void setPassword(String password){
		String setPasswordSql = "INSERT INTO user (password)" +
				"VALUES (this.password)";
		stmt.executeUpdate(setPasswordSql);
	}

	public void setEmail(String email){
		String setEmailSql = "INSERT INTO user (emailAddress)" +
				"VALUES (this.email)";
		stmt.executeUpdate(setEmailSql);
	}
	

	public void deleteUser(int id){
		String deleteUserSql = "DELETE FROM user WHERE id = this.id";
		Statement.executeUpdate(deleteUserSql);
	}

	public String getAllUsers(){
		String getAllUsersSql = "SELECT * FROM user";
		statement.executeUpdate(getAllUsersSql);
	}	

}

