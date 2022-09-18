/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author citih
 */
public class Account {

    private int userid;
    private String username, password, firstname, lastname, email;
    private int phone;
    private String address;
    private boolean gender;
    private Date DOB;
    private int roleId;
    private int bonuspoint;
    private String trust, salary;
    private int citizenid;
    private String workinshift, accimage;

    public Account() {
    }

    public Account(int userid, String username, String password, String firstname, String lastname, String email, int phone, String address, boolean gender, Date DOB, int roleId, int bonuspoint, String trust, String salary, int citizenid, String workinshift, String accimage) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.DOB = DOB;
        this.roleId = roleId;
        this.bonuspoint = bonuspoint;
        this.trust = trust;
        this.salary = salary;
        this.citizenid = citizenid;
        this.workinshift = workinshift;
        this.accimage = accimage;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getBonuspoint() {
        return bonuspoint;
    }

    public void setBonuspoint(int bonuspoint) {
        this.bonuspoint = bonuspoint;
    }

    public String getTrust() {
        return trust;
    }

    public void setTrust(String trust) {
        this.trust = trust;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public int getCitizenid() {
        return citizenid;
    }

    public void setCitizenid(int citizenid) {
        this.citizenid = citizenid;
    }

    public String getWorkinshift() {
        return workinshift;
    }

    public void setWorkinshift(String workinshift) {
        this.workinshift = workinshift;
    }

    public String getAccimage() {
        return accimage;
    }

    public void setAccimage(String accimage) {
        this.accimage = accimage;
    }
    

}
