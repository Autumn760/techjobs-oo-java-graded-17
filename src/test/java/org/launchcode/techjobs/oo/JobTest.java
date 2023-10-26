package org.launchcode.techjobs.oo;


import org.junit.Test;

import javax.naming.Name;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    //TODO: Test the Empty Constructor
    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(job1.getId(), job2.getId());
    }

    //TODO:Test the Full Constructor
    @Test
    public void testJobConstructorSetsAllFields(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(job1.getName() instanceof String);
        assertTrue(job1.getEmployer() instanceof Employer);
        assertTrue(job1.getLocation() instanceof Location);
        assertTrue(job1.getPositionType() instanceof PositionType);
        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Product tester", job1.getName());
        assertEquals("ACME", job1.getEmployer().getValue());
        assertEquals("Desert", job1.getLocation().getValue());
        assertEquals("Quality control", job1.getPositionType().getValue());
        assertEquals("Persistence", job1.getCoreCompetency().getValue());
    }

    //TODO:Test the equals method
    @Test
    public void testJobsForEquality(){
        Job job1 = new Job("Software Developer", new Employer("TechCo"), new Location("City"), new PositionType("Full-time"), new CoreCompetency("Java"));
        Job job2 = new Job("Software Developer", new Employer("TechCo"), new Location("City"), new PositionType("Full-time"), new CoreCompetency("Java"));

        assertFalse(job1.equals(job2));
    }

}


