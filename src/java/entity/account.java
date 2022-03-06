/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Hi
 */
public class account {
     int uID;
     String email;
     String code;
     String firstname,lastname,password,phonenumber;
     boolean isAdmin;
     String nOt;

    public account() {
    }
     
     

    public account(int uID, String email, String firstname, String lastname, String password, String phonenumber, boolean isAdmin, String nOt) {
        this.uID = uID;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.phonenumber = phonenumber;
        this.isAdmin = isAdmin;
        this.nOt=nOt;
    }

    public account(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getuID() {
        return uID;
    }

    public String getnOt() {
        return nOt;
    }

    public void setnOt(String nOt) {
        this.nOt = nOt;
    }

    

    public void setuID(int uID) {
        this.uID = uID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "account{" + "uID=" + uID + ", email=" + email + ", firstname=" + firstname + ", lastname=" + lastname + ", password=" + password + ", phonenumber=" + phonenumber + ", isAdmin=" + isAdmin + '}';
    }
    
    
}
