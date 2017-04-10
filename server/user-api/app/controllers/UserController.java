package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.User;
import models.UserStore;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import util.Util;

import java.util.Set;
/*creates json requests
 */
public class UserController extends Controller{

	//creates a user
	public Result create(String username, String password, String email) {

		User newUser = User.createUser(username, password, email);
		JsonNode jsonObject = Json.toJson(newUser);

		if (jsonObject == null){
			return badRequest(Util.createResponse(
					"Unable to create a user", false));
		}
		return ok(Util.createResponse(jsonObject, true));
	}

	//get a user
	public Result retrieve(int id) {
		
		User getUser = User.getId(id)
		JsonNode jsonObjects = Json.toJson(getUser);

		if (jsonObjects == null) {
			return notFound(Util.createResponse(
					"User with id:" + id + " not found", false));
		}
		return ok(Util.createResponse(jsonObjects, true));
	}
}
