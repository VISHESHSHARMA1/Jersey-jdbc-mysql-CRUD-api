package com.api;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

@Path("/users")
public class UserResource {

    private static final List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "Vishesh"));
        users.add(new User(2, "Seema"));
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getUsers() {
        return users;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String addUser(User user) {
        try {
            UserDAO dao = new UserDAO();
            dao.addUser(user);
            return "User saved to database";
        } catch (Exception e) {
            e.printStackTrace();
            return "Error saving user";
        }
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUserById(@PathParam("id") int id) {
        try {
            UserDAO dao = new UserDAO();
            return dao.getUserById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String updateUser(@PathParam("id") int id, User user) {
        try {
            UserDAO dao = new UserDAO();
            dao.updateUser(id, user);
            return "User updated in database";
        } catch (Exception e) {
            e.printStackTrace();
            return "Error updating user";
        }
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String deleteUser(@PathParam("id") int id) {
        try {
            UserDAO dao = new UserDAO();
            dao.deleteUser(id);
            return "User deleted from database";
        } catch (Exception e) {
            e.printStackTrace();
            return "Error deleting user";
        }
    }
}