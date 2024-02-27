/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author srroj
 */
public class User {
    
    private int id;
    private String name;
    private String lastName;
    private String document;
    private String mail;
    private String password;
    private String role;

    public User() {
    }

    public User(int id, String name, String lastName, String document, String mail, String password, String role) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.document = document;
        this.mail = mail;
        this.password = password;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    
    
    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", lastName=" + lastName + ", document=" + document + ", mail=" + mail + ", password=" + password + ", role=" + role + '}';
    }
    
    public String logIn(){
        return "";
    }
    public String logOut(){
        return "";
        
    }public String singUp(){
        return "";
        
    }public String seeFunction(){
        return "";
        
    }
     
}
