/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dd1.Motor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author julienkessels
 */
public class MotorTest {
        Motor mot;

    public MotorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        mot = new Motor(50);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void speedTest() {
        assertEquals(50, mot.speed);
    }
    
     @Test
    public void speedIndicatorTest() {
        assertEquals(mot.speedIndicator, mot.speed);
    }
}
