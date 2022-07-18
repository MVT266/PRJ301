/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author acer
 */
public class Schedule {
    String student_id;
    int lession_id;
    boolean status;

    public Schedule(String student_id, int lession_id, boolean status) {
        this.student_id = student_id;
        this.lession_id = lession_id;
        this.status = status;
    }

    public Schedule() {
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public int getLession_id() {
        return lession_id;
    }

    public void setLession_id(int lession_id) {
        this.lession_id = lession_id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
