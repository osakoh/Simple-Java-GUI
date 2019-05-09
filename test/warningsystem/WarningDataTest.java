/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warningsystem;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Osas
 */
public class WarningDataTest {
    
    public WarningDataTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getWarningLevel method, of class WarningData.
     */
    @Test
    public void testGetWarningLevel() {
        System.out.println("getWarningLevel");
        WarningData instance = new WarningData();
        int expResult = 0;
        int result = instance.getWarningLevel();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetWarningLevelMoreThan3() {
        System.out.println("testGetWarningLevelMoreThan3");
        WarningData instance = new WarningData();
        instance.setWarningLevel(5);
        int expResult = 0;
        int result = instance.getWarningLevel();
        assertEquals(expResult, result);
    }
    
      @Test
    public void testGetWarningLevelLessThan0() {
        System.out.println("testGetWarningLevelLessThan0");
        WarningData instance = new WarningData();
        instance.setWarningLevel(-2);
        int expResult = 0;
        int result = instance.getWarningLevel();
        assertEquals(expResult, result);
    }

    /**
     * Test of setWarningLevel method, of class WarningData.
     */
    @Test
    public void testSetWarningLevel() {
        System.out.println("setWarningLevel");
        int warningLevel = 0;
        WarningData instance = new WarningData();
        instance.setWarningLevel(warningLevel);
    }
    
}
