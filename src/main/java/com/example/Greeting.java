package com.example;

import java.io.Serializable;

/**
 * Created by rjain on 4/15/17.
 */

public class Greeting implements Serializable {
    private static final long serialVersionUID = -322387622368988984L;
    private String name;
    private String message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}