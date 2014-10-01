package org.wiztools.appupdate;

import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author subwiz
 */
public class JsonConvertTest {
    
    public JsonConvertTest() {
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
     * Test of getVersionUrl method, of class JsonConvert.
     */
    @Test
    public void testGetVersionUrl_Reader() throws Exception {
        System.out.println("getVersionUrl");
        Reader is = new FileReader("src/test/resources/file.json");
        JsonConvert instance = new JsonConvert();
        VersionUrl expResult = new VersionUrlImpl(
                new VersionImpl("3.4.0"),
                "http://www.example.com/app-version.tgz",
                new VersionImpl("3.3"));
        VersionUrl result = instance.getVersionUrl(is);
        assertEquals(expResult, result);
    }

    /**
     * Test of getVersionUrl method, of class JsonConvert.
     */
//    @Test
//    public void testGetVersionUrl_InputStream() {
//        System.out.println("getVersionUrl");
//        InputStream is = null;
//        JsonConvert instance = new JsonConvert();
//        VersionUrl expResult = null;
//        VersionUrl result = instance.getVersionUrl(is);
//        assertEquals(expResult, result);
//    }
    
}
