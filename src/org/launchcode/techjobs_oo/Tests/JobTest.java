package org.launchcode.techjobs_oo.Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.launchcode.techjobs_oo.*;

public class JobTest {
    Job testJob;
    Job testJob1;
    Job testJob2;
    Job testJob3;
    Job testJob4;
    @Before
    public void createTestJobObjs(){
        testJob1 = new Job("Interplanetary Animal Hygienist", new Employer("Blubbos"),new Location("Europa"),new PositionType("2nd 2nd Assistant Space Whale Scrubber"),new CoreCompetency("Using a giant toothbrush"));
        testJob2 = new Job("Interplanetary Animal Hygienist", new Employer(""),new Location(),new PositionType(),new CoreCompetency());
        testJob3 = new Job();
        testJob4 = new Job("Interplanetary Animal Hygienist", new Employer("Blubbos"),new Location("Europa"),new PositionType("2nd 2nd Assistant Space Whale Scrubber"),new CoreCompetency("Using a giant toothbrush"));
        testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }
    @After
    public void resetId(){
        Job.resetNextId();
    }

    @Test
    public void testSettingJobId(){
        assertEquals(testJob1.getId()+1,testJob2.getId());};

    @Test
    public void testSettingJobIdTrue(){
        assertFalse(testJob1.equals(testJob2));};

    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals(5,testJob.getId());

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
        assertFalse(testJob1.equals(testJob4));
    };

    @Test
    public void testToString(){
        assertEquals( "\n" + "ID: 1\n" +
                        "Name: Interplanetary Animal Hygienist\n" +
                        "Employer: Blubbos\n" +
                        "Location: Europa\n" +
                        "Position Type: 2nd 2nd Assistant Space Whale Scrubber\n" +
                        "Core Competency: Using a giant toothbrush"+ "\n"
                ,testJob1.toString());

        assertEquals("\n" + "ID: 2\n" +
                "Name: Interplanetary Animal Hygienist\n" +
                "Employer: Data not available\n" +
                "Location: Data not available\n" +
                "Position Type: Data not available\n" +
                "Core Competency: Data not available"+ "\n",testJob2.toString());

        assertEquals("OOPS! This job does not seem to exist.",testJob3.toString());
    };
}
