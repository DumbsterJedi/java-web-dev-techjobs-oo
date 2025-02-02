package org.launchcode.techjobs_oo;

import java.util.ArrayList;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job(){
        id = nextId;
        nextId++;
    }

    public Job( String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public static void resetNextId(){
        nextId = 1;
    }

        public String getName() {return name;}


    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
                    return employer;
            }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }



    @Override
    public String toString(){


        if(this.getName() == null){
            return "OOPS! This job does not seem to exist.";
        } else {
            return  "\n" + "ID: " + this.id + "\n" +
                    "Name: " + this.getName() + "\n" +
                    "Employer: " +this.employer.getValue() + "\n" +
                    "Location: " + this.location.getValue() + "\n" +
                    "Position Type: " + this.positionType.getValue() + "\n" +
                    "Core Competency: " + this.coreCompetency.getValue() + "\n";
        }
    }

    public static void main(String[] args) {
        Job testJob2 = new Job("", new Employer(),new Location(),new PositionType(),new CoreCompetency());
        System.out.println(testJob2.toString());
    }
    }
