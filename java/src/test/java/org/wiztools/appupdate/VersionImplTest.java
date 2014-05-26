package org.wiztools.appupdate;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author subhash
 */
public class VersionImplTest {
    
    public VersionImplTest() {
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
     * Test of getMajor method, of class VersionImpl.
     */
    @Test
    public void testGetMajor() {
        System.out.println("getMajor");
        VersionImpl instance = new VersionImpl("3.4.5");
        int expResult = 3;
        int result = instance.getMajor();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMinor method, of class VersionImpl.
     */
    @Test
    public void testGetMinor() {
        System.out.println("getMinor");
        VersionImpl instance = new VersionImpl("3.4.5");
        int expResult = 4;
        int result = instance.getMinor();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPatch method, of class VersionImpl.
     */
    @Test
    public void testGetPatch() {
        System.out.println("getPatch");
        VersionImpl instance = new VersionImpl("3.4.5");
        int expResult = 5;
        int result = instance.getPatch();
        assertEquals(expResult, result);
    }

    /**
     * Test of isLessThan method, of class VersionImpl.
     */
    @Test
    public void testIsLessThan() {
        System.out.println("isLessThan");
        Version v = new VersionImpl("3.4.2");
        VersionImpl instance = new VersionImpl("3.4.1");
        boolean expResult = true;
        boolean result = instance.isLessThan(v);
        assertEquals(expResult, result);
    }

    /**
     * Test of isGreaterThan method, of class VersionImpl.
     */
    @Test
    public void testIsGreaterThan() {
        System.out.println("isGreaterThan");
        Version v = new VersionImpl("3.4.1");
        VersionImpl instance = new VersionImpl("3.4.1");
        boolean expResult = false;
        boolean result = instance.isGreaterThan(v);
        assertEquals(expResult, result);
    }
    
}
