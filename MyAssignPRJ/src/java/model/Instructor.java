/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;

/**
 *
 * @author ASUS G731G
 */
public class Instructor {
    private int instructor_id;
    private String instructor_name;
    private String code;
    private Date dob;
    private boolean gender;
    private String account;

    public Instructor() {
    }

    public Instructor(int instructor_id, String name, String code, Date dob, boolean gender, String account) {
        this.instructor_id = instructor_id;
        this.instructor_name = name;
        this.code = code;
        this.dob = dob;
        this.gender = gender;
        this.account = account;
    }

    public int getInstructor_id() {
        return instructor_id;
    }

    public void setInstructor_id(int instructor_id) {
        this.instructor_id = instructor_id;
    }

    public String getInstructor_name() {
        return instructor_name;
    }

    public void setInstructor_name(String instructor_name) {
        this.instructor_name = instructor_name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
    
}
