package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.Comment;
import models.CommentStore;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import util.Util;


import java.util.Set;
/*creates json requests
 */
public class CommentController extends Controller{

	//create a comment
	public Result create(String comment, int rating, int userID, int resortID, int runID){

		Comment newComment = Comment.createComment(comment, rating, userID, resortID,runID);
		JsonNode jsonObject = Json.toJson(newComment);

		if (jsonObject == null){
			return badRequest(Util.createResponse(
					"Unable to create a comment", false));
		}
		return ok(Util.createResponse(jsonObject, true));
	}

	//get a comment
	public Result retrieve(int id) {

		Comment getComment = Comment.getCommentId(id);
		JsonNode jsonObjects = Json.toJson(getComment);

		if (jsonObjects == null) {
			return notFound(Util.createResponse(
					"User with id:" + id + " not found", false));
		}
		return ok(Util.createResponse(jsonObjects, true));
	}
}
