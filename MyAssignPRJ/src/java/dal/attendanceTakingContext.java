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
import model.Course;
import model.Group;
import model.Student;

/**
 *
 * @author Acer
 */
public class attendanceTakingContext extends DBContext {

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
            Logger.getLogger(attendanceTakingContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return stus;
    }

    public ArrayList<Group> listAttendance(String Group_name) {
        ArrayList<Group> listAttendance = new ArrayList<>();
        String sql = "select * from [Group] g inner join [Student] s on g.Student_id = s.Student_id "
                + "where g.Group_name like ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, Group_name);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                Group g = new Group();
                g.setGroup_id(rs.getInt("Group_id"));
                g.setGroup_name(rs.getString("Group_Name"));
                g.setCourse_id(rs.getString("Course_id"));
                g.setStudent_id(rs.getString("Student_id"));
                g.setInstructor_id(rs.getInt("Instructor_id"));
                Student s = new Student();
                s.setStudent_id(rs.getString("Student_id"));
                s.setFirstname(rs.getString("FirstName"));
                s.setMiddlename(rs.getString("MiddleName"));
                s.setLastname(rs.getString("LastName"));
                s.setDob(rs.getDate("DOB"));
                s.setGender(rs.getBoolean("Gender"));
                s.setAccount_id(rs.getInt("Account_id"));
                g.setStudents(s);
                listAttendance.add(g);
            }
        } catch (SQLException ex) {
            Logger.getLogger(attendanceTakingContext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(attendanceTakingContext.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(attendanceTakingContext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(attendanceTakingContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listClass;
    }

//    public ArrayList<String> listID(String Group_name) {
//        ArrayList<String> listID = new ArrayList<>();
//        String sql = "select Student_id from [Group] where Group_name like ?";
//        try {
//            PreparedStatement stm = connection.prepareStatement(sql);
//            stm.setString(1, Group_name);
//            ResultSet rs = stm.executeQuery();
//            while (rs.next()) {
//
//                listID.add(rs.getString(1));
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(attendanceTakingContext.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            try {
//                connection.close();
//            } catch (SQLException ex) {
//                Logger.getLogger(attendanceTakingContext.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        return listID;
//    }
    public String getLessionIDByGroupIdAndStudentID(int groupID, String studentID) {
        try {
            String sql = "select l.Lession_id from [Group] g\n"
                    + "inner join [Student] s on g.Student_id = s.Student_id\n"
                    + "inner join [Lession] l  on g.Group_id = l.Group_id\n"
                    + "where s.Student_id= ? and g.Group_id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, studentID);
            stm.setInt(2, groupID);
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
                return rs.getString("Lession_id");
            }
                    } catch (SQLException ex) {
            Logger.getLogger(attendanceTakingContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    public void update(String Student_id, int Lession_id, int status) {
        ArrayList<String> listCode = new ArrayList<>();

        String sql = "UPDATE Schedule SET status = ? where Student_id like ? and Lession_id = ? ";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, status);
            stm.setString(2, Student_id);
            stm.setInt(3, Lession_id);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(attendanceTakingContext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(attendanceTakingContext.class.getName()).log(Level.SEVERE, null, ex);
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
