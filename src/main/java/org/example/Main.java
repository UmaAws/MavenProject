package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main1(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome! ");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }

    public static void main2(String[] args) {
        List<String> lists = new ArrayList<>();

        lists.add("1");
        lists.add("2");
        lists.add("3");
        lists.add("2");
        System.out.println("lists before set"+lists);
        Set<String> set = new HashSet<>(lists);
        System.out.println("lists after set"+set);

    }

    public static void main3(String[] args) {
        String str = "i am the robot";
     //String[] ch = str.split(" ");
     for (int i=0 ; i<str.length(); i++){
         char[] c = new char[]{str.charAt(i)};
         System.out.println(c);
     }
//     for (char c1 : c){
//
//     }
    }

    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();

        lists.add("1");
        lists.add("2");
        lists.add("3");
        lists.add("2");
        System.out.println("lists before set"+lists);

        List<String> list = lists.stream().toList();

        System.out.println("lists after set"+list);
    }
}