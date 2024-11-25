package com.purple.Purple.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="admins")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="full_name")
    private String fullName;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;


    public Admin(){
        
    }
    public Admin(String fullName,String email,String password){
        this.fullName=fullName;
        this.email=email;
        this.password=password;
    }

   



    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
   


    @Override
    public String toString() {
        return "Admins [id=" + id + ", fullName=" + fullName + ", email=" + email + ", password=" + password + "]";
    }
}
