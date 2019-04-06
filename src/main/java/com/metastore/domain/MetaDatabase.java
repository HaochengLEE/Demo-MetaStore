package com.metastore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author lihaocheng
 * @create 2019-04-06 00:06
 * 元数据
 **/

@Entity
@Table
public class MetaDatabase {

    @Id
    @GeneratedValue
    //database id
    private Integer id;

    //database name
    private String name;

    //database filesystem
    private String location;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
