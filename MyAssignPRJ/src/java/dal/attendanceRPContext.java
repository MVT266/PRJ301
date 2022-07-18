/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Group;
import model.Lession;
import model.Room;
import model.Slot;

/**
 *
 * @author acer
 */
public class attendanceRPContext extends DBContext{
    
     public ArrayList<Lession> listattendancereport() {
        ArrayList<Lession> Attendancers = new ArrayList<>();
        try {
             String sql = "SELECT * FROM [Lession] as l \n" +
"                    inner join [Group] as g on g.Group_id=l.Group_id\n" +
"                    inner join [Slot] as s on s.Slot_id=l.Slot\n" +
"                    inner join [Instructor] as i on i.Instructor_id=l.Instructor_id\n" +
"                    inner join [Room] as r on r.Room_id=l.Room_id\n" +
"                    where (1=1)";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            
            while (rs.next()) {
                Lession l = new Lession();
                l.setId(rs.getInt("Lession_id"));
                Group g = new Group();
                g.setGroup_id(rs.getInt("Group_id"));
                g.setGroup_name("Group_Name");
                l.setGroup(g);
                l.setName(rs.getString("Name"));
                l.setDate(rs.getDate("Date"));
                Slot s = new Slot();
                s.setId(rs.getInt("Slot_id"));
                s.setStart(rs.getString("Time_Start"));
                s.setEnd(rs.getString("Time_End"));
                l.setSlot(s);
                Room r = new Room();
                r.setId(rs.getInt("Room_id"));
                r.setName(rs.getString("Name"));
                l.setRoom(r);
                l.setGroup(g);
                l.setSlot(s);
                Attendancers.add(l);
            }
        } catch (SQLException ex) {
            Logger.getLogger(attendanceRPContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Attendancers;
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
    
}
