package Tesk2;
public class Nod_Nok {
    public static int NOD(int numb1, int numb2){
        return numb2 == 0 ? numb1 : Nod_Nok.NOD(numb2,numb1 % numb2);
    }
    public static int NOK(int numb1, int numb2, int NOD){
        return numb1/NOD*numb2;
    }
}
