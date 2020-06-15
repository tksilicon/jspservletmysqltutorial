
package com.unionbank.jspservletmysqltutorial.dao;

/**
 * TUser.java
 * This is a model class represents a User entity
 * @author Ramesh Fadatare
 *
 */
public class TUser {
    protected int id;
    protected String name;
    protected String email;
    protected String country;

    public TUser() {}

    public TUser(String name, String email, String country) {
        super();
        this.name = name;
        this.email = email;
        this.country = country;
    }

    public TUser(int id, String name, String email, String country) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.country = country;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
}