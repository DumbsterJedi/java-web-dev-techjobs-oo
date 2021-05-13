package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.launchcode.techjobs_oo.*;

public class JobTest {
    Job Job1;
    Job Job2;
    @Before
    public void createTestJobObjs(){
        Job1 = new Job();
        Job2 = new Job();
    }

    @Test
    public void testSettingJobId(){assertEquals(Job2.getId(),Job1.getId()+1);}
    public void testSettingJobIdTrue(){assertFalse(Job1.equals(Job2));}

    @Test
    public void testJobConstructorSetsAllFields(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
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

        assertEquals(testJob.getId(),3);
    }
}
