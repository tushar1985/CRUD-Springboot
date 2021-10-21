package com.emp.myemp.model;



import javax.persistence.*;


@Entity
public class user {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column
    private String fname;
    @Column
    private String lname;
    @Column
    private int age;
    @Column
    private String Occupation;

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return Occupation;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOccupation(String occupation) {
        Occupation = occupation;
    }

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }

}
