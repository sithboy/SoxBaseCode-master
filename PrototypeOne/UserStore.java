package models;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UserStore {
	// create an integer id for each 
	//new student record and use it as a key.
	
    private Map <Integer,User> users = new HashMap<>();
 
    public User addUser(User user) {
        int id = users.size();
        user.setId(id);
        users.put(id, user);
        return user;
    }
 
    public User getUser(int id) {
        return users.get(id);
    }
 
    public Set<User> getAllUsers() {
        return new HashSet<>(users.values());
    }
 
    public User updateUser (User user){
        int id = user.getId();
        if (users.containsKey(id)) {
            users.put(id, user);
            return user;
        }
        return null;
    }
 
    public boolean deleteUser(int id) {
        return users.remove(id) != null;
    } 
}