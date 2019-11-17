package Tesk2;
public class Main {

    public static void main(String[] args) {
        try {
            IOC.outputStr("Input 2 numbers: \n 1: ");
            int numb1=IOC.InputInt();
            IOC.outputStr("2: ");
            int numb2=IOC.InputInt();
            int Nod=Nod_Nok.NOD(numb1,numb2);
            IOC.outputStr("NOD: ");
            IOC.outputNumb(Nod);
            IOC.outputStr("NOK: ");
            IOC.outputNumb(Nod_Nok.NOK(numb1,numb2,Nod));
        }catch (Exception e){
            IOC.outputStr("Error");
        }
    }
}
