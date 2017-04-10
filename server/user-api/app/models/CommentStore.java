package models;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CommentStore {

	// create an integer id for each 
	//new student record and use it as a key.
	private static CommentStore instance;
	private Map <Integer,Comment> comments = new HashMap<>();
	
	private static CommentStore instance;

	public Comment addComment (Comment comment) {
		int id = comments.size();
		comment.setCommentId(id);
		comments.put(id, comment);
		return comment;
	}
	public static CommentStore getInstance() {
        if (instance == null) {
            instance = new CommentStore();
        }
        return instance;
    }

	public Comment getUser(int commentId) {
		return comments.get(commentId);
	}

	public Set<Comment> getAllUsers() {
		return new HashSet<>(comments.values());
	}

	public Comment updateComment (Comment comment){
		int commentId = comment.getCommentId();
		if (comments.containsKey(commentId)) {
			comments.put(commentId, comment);
			return comment;
		}
		return null;
	}

	public boolean deleteComment(int commentId) {
		return comments.remove(commentId) != null;
	} 
}

