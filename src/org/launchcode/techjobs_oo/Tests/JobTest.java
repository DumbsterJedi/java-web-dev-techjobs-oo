package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.launchcode.techjobs_oo.*;

public class JobTest {
//    Job Job1;
//    Job Job2;
//    @Before
//    public void createTestJobObjs(){
//        Job1 = new Job();
//        Job2 = new Job();
//    }

    @Test
    public void testSettingJobId(){
    Job testJob1 = new Job();
    Job testJob2 = new Job();
    assertEquals(testJob2.getId(),testJob1.getId()+1);};

    @Test
    public void testSettingJobIdTrue(){
        Job testJob1 = new Job();
        Job testJob2 = new Job();
        assertFalse(testJob1.equals(testJob2));};

    @Test
    public void testJobConstructorSetsAllFields(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(testJob.getId(),1); //this is broken when used with other tests

        assertEquals(testJob.getName(),"Product tester");
        assertTrue(testJob instanceof Job);

        assertEquals(testJob.getEmployer().getValue(),"ACME");
        assertTrue(testJob.getEmployer() instanceof Employer);

        assertEquals(testJob.getLocation().getValue(),"Desert");
        assertTrue(testJob.getLocation() instanceof Location);

        assertEquals(testJob.getPositionType().getValue(),"Quality control");
        assertTrue(testJob.getPositionType() instanceof PositionType);

        assertEquals(testJob.getCoreCompetency().getValue(),"Persistence");
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);

    };

    @Test
    public void testJobsForEquality(){
        Job testJob1 = new Job("Competitive Driving", new Employer("Worthouse"),new Location("North America"),new PositionType("Driver"),new CoreCompetency("Drifting"));
        Job testJob2 = new Job("Competitive Driving", new Employer("Worthouse"),new Location("North America"),new PositionType("Driver"),new CoreCompetency("Drifting"));
        assertFalse(testJob1.equals(testJob2));
    };

    @Test
    public void testToString(){
        Job testJob1 = new Job("Competitive Driver", new Employer("Worthouse"),new Location("North America"),new PositionType("Driver"),new CoreCompetency("Drifting"));
        Job testJob2 = new Job("Competitive Driver", new Employer(),new Location(),new PositionType(),new CoreCompetency());
        Job testJob3 = new Job();
        assertEquals(testJob1.toString(), "\n" + "ID: 1\n" +
                "Name: Competitive Driver\n" +
                "Employer: Worthouse\n" +
                "Location: North America\n" +
                "Position Type: Driver\n" +
                "Core Competency: Drifting"+ "\n"
        );

        assertEquals(testJob2.toString(),"\n" + "ID: 2\n" +
                "Name: Competitive Driver\n" +
                "Employer: Data not available\n" +
                "Location: Data not available\n" +
                "Position Type: Data not available\n" +
                "Core Competency: Data not available"+ "\n");

        assertEquals(testJob3.toString(),"OOPS! This job does not seem to exist.");
    };
}
