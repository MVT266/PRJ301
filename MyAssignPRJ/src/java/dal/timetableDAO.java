/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.timetable;

/**
 *
 * @author ADMIN
 */
public class timetableDAO extends DBContext {

    public ArrayList<timetable> getTimeTable() {
        ArrayList<timetable> listTable = new ArrayList<>();
        try {
            String sql = "SELECT * FROM [Lession] as l \n"
                    + "inner join [Group] as g on g.Group_id=l.Group_id\n"
                    + "inner join [Slot] as s on s.Slot_id=l.Slot\n"
                    + "inner join [Instructor] as i on i.Instructor_id=l.Instructor_id\n"
                    + "inner join [Room] as r on r.Room_id=l.Room\n"
                    + "where (1=1)";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                timetable t = new timetable(rs.getString(1), rs.getString(2), rs.getString(3));
                listTable.add(t);
            }
        } catch (SQLException e) {

        }
        return listTable;
    }

    @Override
    public ArrayList list() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insert(Object model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Object model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Object model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static void main(String[] args) {
        System.out.println(new timetableDAO().getTimeTable());
    }
}
