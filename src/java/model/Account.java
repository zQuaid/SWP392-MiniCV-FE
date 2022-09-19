<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;


=======
package Model;

import java.util.Date;
>>>>>>> bb2b0d4d442621bdcce2b581436a860ed224156b

/**
 *
 * @author Admin
 */
public class Account {
<<<<<<< HEAD
=======

>>>>>>> bb2b0d4d442621bdcce2b581436a860ed224156b
        private int id;
        private String username;
        private String password;
        private String firstName;
        private String lastName;
        private String email;
<<<<<<< HEAD
        private int phone;
=======
        private String phone;
>>>>>>> bb2b0d4d442621bdcce2b581436a860ed224156b
        private String address;
        private boolean gender;
        private Date dob;
        private String roleID;
        private int bonusPoint;
        private String trust;
        private String salary;
<<<<<<< HEAD
        private int citizenID;
=======
        private String citizenID;
>>>>>>> bb2b0d4d442621bdcce2b581436a860ed224156b
        private String workingShift;
        private String accImage;

    public Account() {
    }

<<<<<<< HEAD
    public Account(int id, String username, String password, String firstName, String lastName, String email, int phone, String address, boolean gender, Date dob, String roleID, int bonusPoint, String trust, String salary, int citizenID, String workingShift, String accImage) {
=======
    public Account(int id, String username, String password, String firstName, String lastName, String email, String phone, String address, boolean gender, Date dob, String roleID, int bonusPoint, String trust, String salary, String citizenID, String workingShift, String accImage) {
>>>>>>> bb2b0d4d442621bdcce2b581436a860ed224156b
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
<<<<<<< HEAD
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.dob = dob;
        this.roleID = roleID;
        this.bonusPoint = bonusPoint;
        this.trust = trust;
        this.salary = salary;
        this.citizenID = citizenID;
        this.workingShift = workingShift;
        this.accImage = accImage;
=======
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.dob = dob;
        this.roleID = roleID;
        this.bonusPoint = bonusPoint;
        this.trust = trust;
        this.salary = salary;
        this.citizenID = citizenID;
        this.workingShift = workingShift;
        this.accImage = accImage;
    }

    public Account(String username, String password, String firstName, String lastName, String phone, boolean gender, String email, String roleID) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.gender = gender;
        this.email = email;
        this.roleID = roleID;
>>>>>>> bb2b0d4d442621bdcce2b581436a860ed224156b
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

<<<<<<< HEAD
    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
=======
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
>>>>>>> bb2b0d4d442621bdcce2b581436a860ed224156b
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
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

<<<<<<< HEAD
    public int getCitizenID() {
        return citizenID;
    }

    public void setCitizenID(int citizenID) {
=======
    public String getCitizenID() {
        return citizenID;
    }

    public void setCitizenID(String citizenID) {
>>>>>>> bb2b0d4d442621bdcce2b581436a860ed224156b
        this.citizenID = citizenID;
    }

    public String getWorkingShift() {
        return workingShift;
    }

    public void setWorkingShift(String workingShift) {
        this.workingShift = workingShift;
    }

    public String getAccImage() {
        return accImage;
    }

    public void setAccImage(String accImage) {
        this.accImage = accImage;
    }
<<<<<<< HEAD
        
        
=======
>>>>>>> bb2b0d4d442621bdcce2b581436a860ed224156b
}
