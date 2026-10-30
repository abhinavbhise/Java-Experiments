package greenthumb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * JDBC part (CRUD with SQLite). If the SQLite driver jar is not added,
 * the program still runs; only Save/Load are disabled.
 */
public class Database {

    private static final String URL = "jdbc:sqlite:greenthumb.db";
    private Connection con;

    public boolean connect() {
        try {
            Class.forName("org.sqlite.JDBC");                     // load driver
            con = DriverManager.getConnection(URL);               // Connection interface
            try (Statement st = con.createStatement()) {          // Statement interface
                st.execute("CREATE TABLE IF NOT EXISTS plants("
                        + "name TEXT PRIMARY KEY, type TEXT, health INTEGER, days_since INTEGER)");
            }
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
            return false;
        }
    }

    /** Create / Update: save the whole garden. */
    public int saveAll(List<Plant> plants) throws SQLException {
        try (Statement st = con.createStatement()) {
            st.executeUpdate("DELETE FROM plants");               // Delete
        }
        String sql = "INSERT INTO plants VALUES(?,?,?,?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {  // PreparedStatement
            for (Plant p : plants) {
                ps.setString(1, p.getName());
                ps.setString(2, p.getType());
                ps.setInt(3, p.getHealth());
                ps.setInt(4, p.getDaysSinceWatered());
                ps.executeUpdate();                               // Insert
            }
        }
        return plants.size();
    }

    /** Read: load all plants back. */
    public List<Plant> loadAll() throws SQLException, PlantCareException {
        List<Plant> list = new ArrayList<>();
        try (Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM plants")) {   // ResultSet navigation
            while (rs.next()) {
                Plant p = Garden.createPlant(rs.getString("type"), rs.getString("name"));
                p.setHealth(rs.getInt("health"));
                p.setDaysSinceWatered(rs.getInt("days_since"));
                list.add(p);
            }
        }
        return list;
    }

    public void close() {
        try { if (con != null) con.close(); } catch (SQLException ignored) { }
    }
}
