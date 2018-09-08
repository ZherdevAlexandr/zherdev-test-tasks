package ru.zherdev.test_task_otr.task_1;

import java.util.Scanner;

/**
 *
 * @author Alexandr
 */
public class Task1 {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] ip = new String[4];
        Integer minNode = 0;
        Integer maxNode = 0;
        
        System.out.println("Choose ip range...");
        
        System.out.print("Enter first ip: ");
        ip = in.next().split("\\.");
        minNode = Integer.valueOf(ip[ip.length-1]);
        
        System.out.print("\nEnter second ip: ");
        ip = in.next().split("\\.");
        maxNode = Integer.valueOf(ip[ip.length-1]);
        
        for(int i=minNode+1;i<=maxNode-minNode;i++){
            System.out.println(ip[0]+"."+ip[1]+"."+ip[2]+"."+i);
        }        
    }
}
