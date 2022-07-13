/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class Student {
    private String student_id;
    private String firstname;
    private String middlename;
    private String lastname;
    private Date dob;
    private boolean gender;
    private String account;
    private ArrayList<Student> stus = new ArrayList<>();

    public Student() {
    }

    public Student(String student_id, String firstname, String middlename, String lastname, Date dob, boolean gender, String account) {
        this.student_id = student_id;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.dob = dob;
        this.gender = gender;
        this.account = account;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public ArrayList<Student> getStus() {
        return stus;
    }

    public void setStus(ArrayList<Student> stus) {
        this.stus = stus;
    }

    public String getStudent_id() {
        return student_id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public Date getDob() {
        return dob;
    }

    public boolean isGender() {
        return gender;
    }

    public String getAccount() {
        return account;
    }
    
    
    
}
