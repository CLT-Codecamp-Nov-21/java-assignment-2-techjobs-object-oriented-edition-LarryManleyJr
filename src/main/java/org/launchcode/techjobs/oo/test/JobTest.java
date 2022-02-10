package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;



/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId () {
    JobTest firstJob = new JobTest();
    JobTest secondJob = new JobTest();
    assertNotEquals(firstJob, secondJob);
    }


    @Test
    public void testJobsForEquality() {

    }

    @Test
    public void testJobConstructorSetsAllFields() {

    }

}
