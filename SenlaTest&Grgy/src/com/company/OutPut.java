package com.company;

import java.util.Scanner;

public class OutPut {
        public static void outputStr(String str){
        System.out.println(str);
    }
    public static void outputNumb(int str){
        System.out.println(str);
    }
    public static int Input(){
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}
