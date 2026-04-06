package com.api;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDAO {

    public void addUser(User user) throws Exception {
        String sql = "INSERT INTO users (id, name) VALUES (?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, user.getId());
            ps.setString(2, user.getName());

            ps.executeUpdate();
        }
    }

    public User getUserById(int id) throws Exception {
        String sql = "SELECT * FROM users WHERE id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            try (java.sql.ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new User(
                            rs.getInt("id"),
                            rs.getString("name")
                    );
                }
            }
        }

        return null;
    }

    public void updateUser(int id, User user) throws Exception {
        String sql = "UPDATE users SET name = ? WHERE id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, user.getName());
            ps.setInt(2, id);

            ps.executeUpdate();
        }
    }

    public void deleteUser(int id) throws Exception {
        String sql = "DELETE FROM users WHERE id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }

}