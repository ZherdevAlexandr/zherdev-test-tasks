package ru.zherdev.test_task_otr.task_1;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Alexandr
 */
public class Task1 {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String ip = "";
        Integer minNode = 0;
        Integer maxNode = 0;
        
        System.out.println("Choose ip range...");
        try{
            System.out.print("Enter first ip: ");
            ip = in.next();
            minNode = getNodeValue(ip);
            
            System.out.print("\nEnter second ip: ");
            ip = in.next();
            maxNode = getNodeValue(ip);
            
            printIp(ip, minNode, maxNode);
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    public static boolean checkIpFormat(String str){
        boolean result = str.matches("(\\d{3})\\.(\\d{3})\\.(\\d{1,3})\\.(\\d{1,3})");
        return result;
    }
    
    public static int getNodeValue(String str) throws IOException{
        String[] ip = new String[4];
        int nodeValue = -1;
        
        if (!checkIpFormat(str)) throw  new IOException("Your ip has wrong ip format!");
        ip = str.split("\\.");
        nodeValue = Integer.valueOf(ip[ip.length-1]);
        
        return nodeValue;
    }
    
    public static void printIp(String ip, int minNode, int maxNode){
        String[] currentIp = ip.split("\\.");
        
        if (minNode<maxNode){
                for(int i=minNode+1;i<=maxNode-minNode;i++){
                    System.out.println(currentIp[0]+"."+currentIp[1]+"."+currentIp[2]+"."+i);
                }
            }
            else{
                System.out.println("Wrong range! The first ip should precede to the second ip.");
            }
    }
}
