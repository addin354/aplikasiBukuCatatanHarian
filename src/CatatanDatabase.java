/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CatatanDatabase {
    private Connection conn;

    public CatatanDatabase() throws SQLException {
       conn = DriverManager.getConnection("jdbc:sqlite:catatan.db");
        String createTableSQL = "CREATE TABLE IF NOT EXISTS catatan (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "judul TEXT, " +
                "isi TEXT, " +
                "tanggal TEXT)";
        Statement stmt = conn.createStatement();
        stmt.execute(createTableSQL);
    }

    public void tambahCatatan(Catatan catatan) throws SQLException {
        String sql = "INSERT INTO catatan (judul, isi, tanggal) VALUES (?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, catatan.getJudul());
        pstmt.setString(2, catatan.getIsi());
        pstmt.setString(3, catatan.getTanggal());
        pstmt.executeUpdate();
    }

    public List<Catatan> ambilSemuaCatatan() throws SQLException {
        List<Catatan> catatanList = new ArrayList<>();
        String sql = "SELECT * FROM catatan";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            Catatan catatan = new Catatan(
                    rs.getInt("id"),
                    rs.getString("judul"),
                    rs.getString("isi"),
                    rs.getString("tanggal")
            );
            catatanList.add(catatan);
        }
        return catatanList;
    }

    public void updateCatatan(Catatan catatan) throws SQLException {
        String sql = "UPDATE catatan SET judul = ?, isi = ?, tanggal = ? WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, catatan.getJudul());
        pstmt.setString(2, catatan.getIsi());
        pstmt.setString(3, catatan.getTanggal());
        pstmt.setInt(4, catatan.getId());
        pstmt.executeUpdate();
    }

    public void hapusCatatan(int id) throws SQLException {
        String sql = "DELETE FROM catatan WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        pstmt.executeUpdate();
    }
}