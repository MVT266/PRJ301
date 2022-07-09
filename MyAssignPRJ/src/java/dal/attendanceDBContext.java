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
import Model.Student;
import Model.Course;
import model.Attendance;

/**
 *
 * @author acer
 */
public class attendanceDBContext extends DBContext {

    public ArrayList<Student> Selectbyid(int did) {
        ArrayList<Student> stus = new ArrayList<>();
        try {
            String sql = "select s.Student_id, s.LastName, c.Course_id from Student s, Course c where c.Course_id = 'PRJ301'";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, did);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Student s = new Student();
                s.setStudent_id(rs.getString("Student_id"));
                s.setLastname(rs.getString("LastName"));
                Course c = new Course();
                stus.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(attendanceDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return stus;
    }

     public ArrayList<Attendance> listAttendance(String className) {
        ArrayList<Attendance> listAttendance = new ArrayList<>();
        String sql = "select * from [Group] where [Group].Group_name like ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, className);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                Attendance r = new Attendance(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));

                listAttendance.add(r);
            }
        } catch (SQLException ex) {
            Logger.getLogger(attendanceDBContext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(attendanceDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listAttendance;
    }

    public ArrayList<String> listClass() {
        ArrayList<String> listClass = new ArrayList<>();
        String sql = "select distinct Group_name from [Group]";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {

                listClass.add(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(attendanceDBContext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(attendanceDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listClass;
    }

    public ArrayList<String> listID(String GroupName) {
        ArrayList<String> listID = new ArrayList<>();
        String sql = "select Student_id from [Group] where Group_name like ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, GroupName);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {

                listID.add(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(attendanceDBContext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(attendanceDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listID;
    }

      public ArrayList<String> listStudent() {
        ArrayList<String> listStudent = new ArrayList<>();
        String sql = "select distinct Student_name from [Student]";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {

                 listStudent.add(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(attendanceDBContext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(attendanceDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return  listStudent;
    }
      
    public void update(String code,int number) {
        ArrayList<String> listCode = new ArrayList<>();
        
        
            String sql = "UPDATE attendance SET status = ? where code like ?";
            try {
                PreparedStatement stm = connection.prepareStatement(sql);
                stm.setInt(1, number);
                stm.setString(2, code);
                stm.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(attendanceDBContext.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(attendanceDBContext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        

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

    @Override
    public ArrayList list() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
