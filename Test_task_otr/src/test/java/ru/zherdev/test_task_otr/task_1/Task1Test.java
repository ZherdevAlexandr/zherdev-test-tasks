package ru.zherdev.test_task_otr.task_1;

import java.io.IOException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alexandr
 */
public class Task1Test {
    String ip1;
    String ip2;
    String badIp;
    
    public Task1Test() {
    }
    
    @Before
    public void setUp() {
        ip1 = "192.168.0.1";
        ip2 = "192.168.0.5";
        badIp = "sd.123,.786.0.1";
    }
    
    @After
    public void tearDown() {
        ip1 = null;
        ip2 = null;
    }

    /**
     * Test of checkIpFormat method, of class Task1.
     */
    @Test
    public void testCheckIpFormat() {
        System.out.println("==== Test checkIpFormat method ====");
        
        assertEquals(true, Task1.checkIpFormat(ip1));
        assertEquals(false, Task1.checkIpFormat(badIp));
        System.out.println("success");
    }

    /**
     * Test of getNodeValue method, of class Task1.
     */
//    @Test(expected = IOException.class)
    @Test
    public void testGetNodeValue() throws IOException {
        System.out.println("==== Test getNodeValue method ====");
        
        String[] ip = new String[4];
        ip = ip1.split("\\.");
        int nodeValue = Integer.valueOf(ip[ip.length-1]);
        assertEquals(nodeValue, Task1.getNodeValue(ip1));
        // check exception for ip format
        try{
            Task1.getNodeValue(badIp);
        }
        catch(IOException e){
            assertEquals("Your ip has wrong ip format!", e.getMessage());
            System.out.println("success");
        }
    }

    /**
     * Test of printIp method, of class Task1.
     */
    @Test
    public void testPrintIp() throws IOException {
        System.out.println("==== Test printIp ====");
        String ip = ip2;
        int minNode = 0;
        int maxNode = 0;
        
        //wrong ip range
        minNode = Task1.getNodeValue(ip2);
        maxNode = Task1.getNodeValue(ip1);
        System.out.println("We should get message with wrong ip range...");
        Task1.printIp(ip, minNode, maxNode);
        
        //right execution
        minNode = Task1.getNodeValue(ip1);
        maxNode = Task1.getNodeValue(ip2);
        System.out.println("We should get ip list from "+ip1+" to "+ip2);
        Task1.printIp(ip, minNode, maxNode);
        
        System.out.println("success");
    }
    
}
