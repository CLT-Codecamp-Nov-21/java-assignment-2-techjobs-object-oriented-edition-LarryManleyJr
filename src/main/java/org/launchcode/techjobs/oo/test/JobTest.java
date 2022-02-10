package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;
import org.launchcode.techjobs.oo.*;


/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId () {
    Job firstJob = new Job();
    Job secondJob = new Job();
    assertNotEquals(firstJob, secondJob);
    }


    @Test
    public void testJobsForEquality() {
        Job thirdJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job fourthJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(thirdJob.equals(fourthJob));

    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job fifthJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(fifthJob.getName() instanceof String);
        assertTrue(fifthJob.getEmployer() instanceof Employer);
        assertTrue(fifthJob.getLocation() instanceof Location);
        assertTrue(fifthJob.getPositionType() instanceof PositionType);
        assertTrue(fifthJob.getCoreCompetency() instanceof CoreCompetency);

        assertEquals("Product tester", fifthJob.getName());
        assertEquals("ACME", fifthJob.getEmployer().getValue());
        assertEquals("Desert", fifthJob.getLocation().getValue());
        assertEquals("Quality control", fifthJob.getLocation().getValue());
        assertEquals("Persistence", fifthJob.getLocation().getValue());
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job sixthJob = new Job ("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals('\n', sixthJob.toString().charAt(0));
        assertEquals('\n', sixthJob.toString().charAt(sixthJob.toString().length()-1));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job seventhJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String stringTest = "\nID: " + seventhJob.getId() +
                             "\nName: Product tester" +
                             "\nEmployer: ACME" +
                             "\nLocation: Desert" +
                             "\nPosition Type: Quality Control" +
                             "\nCore Competency: Persistence" +
                             "\n";
        assertEquals(stringTest, seventhJob.toString());
    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job eigthJob = new Job("test", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        assertEquals("\nID: " + eigthJob.getId() +
                             "\nName: " + eigthJob.getName() +
                             "\nEmployer: Data not available" +
                                "\nLocation: Data not available" +
                               "\nPosition Type: Data not available" +
                                 "\nCore Competency: Data not available" +
                                "\n", eigthJob.toString());
    }
}
