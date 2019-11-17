package com.company;
    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        try{
            OutPut.outputStr("Input number: ");
            int  numb = OutPut.Input();
            boolean flag;
           flag =work.EvenOrNotEven(numb);
           if(flag)
               OutPut.outputStr("Number is even.");
           else
               OutPut.outputStr("Number isn't even.");
           flag= work.SimpledOrDifficult(numb);
            if(flag)
                OutPut.outputStr("Number is simpel.");
            else
                OutPut.outputStr("Number isn't simpel.");
        }catch (Exception e){
            OutPut.outputStr("Error");
        }
    }
}
