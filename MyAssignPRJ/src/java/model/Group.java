/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author ASUS G731G
 */
public class Group {
    private int group_id;
    private String group_name;
    private String course_id;
    private ArrayList<Student> students;
    private int structor_id;

    public Group() {
    }

    public Group(int group_id, String group_name, String course_id, ArrayList<Student> students, int structor_id) {
        this.group_id = group_id;
        this.group_name = group_name;
        this.course_id = course_id;
        this.students = students;
        this.structor_id = structor_id;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public int getStructor_id() {
        return structor_id;
    }

    public void setStructor_id(int structor_id) {
        this.structor_id = structor_id;
    }
    
    
}
