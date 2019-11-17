package com.company;

public class work {
    public static boolean EvenOrNotEven(int numb){
        if(numb%2==0)
           return true;
        else
            return false;
    }

    public static boolean SimpledOrDifficult(int numb){
        for(int i=2;i<=Math.sqrt(numb);i++){
            if(numb%i==0)
               return false;
        }
        return true;
    }
}
