package com.example.demo.model;

import javax.persistence.*;

@Table(name = "`user`")
public class User {
    public User() {
    }

    public User(User user) {
        this.username = user.username;
        this.password = user.password;
        this.homeId = user.homeId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String username;

    private String password;

    @Column(name = "home_id")
    private Integer homeId;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return home_id
     */
    public Integer getHomeId() {
        return homeId;
    }

    /**
     * @param homeId
     */
    public void setHomeId(Integer homeId) {
        this.homeId = homeId;
    }
}