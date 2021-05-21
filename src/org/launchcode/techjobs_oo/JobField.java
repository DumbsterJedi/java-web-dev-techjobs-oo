package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {
    int id;
    int nextId;
    String value;


    public JobField() {
        id = nextId;
        nextId++;
    }
    public JobField( String value) {
        this();
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        if(value == null || value.equals("")){
            return "Data not available";
        } else {
            return value;
        }
    }

    public void setValue(String value) {
        this.value = value;
    }
}


