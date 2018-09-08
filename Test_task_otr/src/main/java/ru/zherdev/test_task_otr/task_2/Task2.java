package ru.zherdev.test_task_otr.task_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Alexandr
 */
public class Task2 {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String name = "";
        Map<String, ArrayList<String>> book = new HashMap<String, ArrayList<String>>();
        ArrayList<String> telephones = new ArrayList<>();
        
        telephones.add("+8 800 2000 500");
        telephones.add("+8 800 200 600");
        book.put("Ivanov I.I.", telephones);
        
        telephones = new ArrayList<String>();
        telephones.add("+8 800 2000 700");
        book.put("Petrov P.P.", telephones);
        
        telephones = new ArrayList<String>();
        telephones.add(" +8 800 2000 800");
        telephones.add("+8 800 2000 900");
        telephones.add("+8 800 2000 000");
        book.put("Sidorov S.S.", telephones);

        System.out.print("Enter full name: ");
        name = in.nextLine();
        
        if(!book.containsKey(name)){
            System.out.println("The person was not found.");
        }
        else{
            ArrayList<String> list = book.get(name);
            for(int i = 1;i<=list.size();i++){
                System.out.println(i+". "+list.get(i-1));
            }
        }
    }
}
