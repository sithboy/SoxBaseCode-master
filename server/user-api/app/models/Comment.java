package models;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Comment {
	public int commentID;
	public String comment;
	public int rating;
	public int resortID;
	public int runID;
	public String commentTime;

	val dbconnection = db.getConnection("default");
	val statement = dbconnection.createStatement();

	//constructors
	public Comment(){
		commentID = 1;
		comment = "empty comment";
		rating = 1;
		resortID = 1;
		runID = 1;
		commentTime = "12345";
	}
	//simple get methods
	public int getCommentId(int commentID){
		String getCommentIdSql = "SELECT * FROM comment WHERE commentID = this.commentID";
		statement.executeUpdate(getCommentIdSql);
	}

	public String getComment(String comment){
		String getCommentSql = "SELECT *FROM comment WHERE comment = this.comment";
		statement.executeUpdate(getCommentSql);
	}

	public int getRating(int rating){
		String getRatingSql = "SELECT *FROM comment WHERE rating = this.rating";
		statement.executeUpdate(getRatingSql);
	}

	public int getResortID(int resortID){
		String getResortIDSql = "SELECT *FROM comment WHERE resortID = this.resortID";
		statement.executeUpdate(getResortIDSql);
	}

	public int getRunID(int runID){
		String getRunIDSql = "SELECT *FROM comment WHERE runID = this.runID";
		statement.executeUpdate(getRunIDSql);
	}

	public String getCommentTime(String commentTime){
		String getCommentTimeSql = "SELECT *FROM comment WHERE commentTime = this.commentTime";
		Statement.executeUpdate(getCommentTimeSql);
	}

	//not sure if we need all these fields when creating a comment?
	public void createComment(int commentID, String comment, int rating, int userID, int resortID, int runID, int commentTime) {
		String setUserSql = "INSERT INTO comment (commentID, comment, rating, userID, resortID, runID, commentTime)"  +
				"VALUES (this.commentID, this.comment, this.rating, this.userID, this.resortID, this.runID, this.commentTime)";
		Statement.executeUpdate(setUserSql);
	}
	
	public void deleteComment(int commentID){
		String deleteCommentSql = "DELETE FROM comment WHERE commentID = this.commentID";
		Statement.executeUpdate(deleteCommentSql);
	}

	public String getAllComments(){
		String getAllCommentsSql = "SELECT * FROM comment";
		statement.executeUpdate(getAllCommentsSql);
	}	
	
	public int commentSize() {
		return comment.length();
	}
}


