package com.example.demo.model;

import javax.persistence.*;

public class Role {
    @Id
    @Column(name = "role_id")
    private String roleId;

    private Integer power;

    /**
     * @return role_id
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * @return power
     */
    public Integer getPower() {
        return power;
    }

    /**
     * @param power
     */
    public void setPower(Integer power) {
        this.power = power;
    }
}