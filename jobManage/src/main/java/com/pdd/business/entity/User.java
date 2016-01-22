package com.pdd.business.entity;

import java.io.Serializable;

/**
 * Created by liugd on 16/1/15.
 */
public class User implements Serializable {
    private static final long serialVersionUID = 3096154202413606831L;
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
