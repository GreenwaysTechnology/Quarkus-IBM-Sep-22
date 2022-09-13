package com.ibm.ds.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Person extends PanacheEntity {
    //entity fields
    public String name;
    public LocalDate birthDate;

    //update entity fields
    //store all names in smaller case only
    public void setName(String name) {
        this.name = name.toLowerCase();
    }

    //get all names in uppercase
    public String getName() {
        return name.toUpperCase();
    }

    //extra methods
    public static Person findByName(String name) {
        return find("name", name).firstResult();
    }

    public static void deleteStefs() {
        delete("name", "Stef");
    }
}
