package com.example.demo.model;

import com.example.demo.service.TestService;

import java.io.Serializable;

/**
 * Created by Cmglz on 2017/7/8.
 */
public class TestModel implements Serializable {
    public int id;
    public String cat;

    public TestModel(){
        id=1;
        cat="mouse";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }
}
