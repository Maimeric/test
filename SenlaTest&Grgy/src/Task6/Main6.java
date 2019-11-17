package Task6;

import Tesk2.IOC;

public class Main6{
    public static void main(String[] args) {
        try {
            Tesk2.IOC.outputStr("How much things do u have?");
            int n = Tesk2.IOC.InputInt();
            int[] mas1 = new int[n];
            int[] mas2 = new int[n];
            for (int i = 0; i < n; i++) {
                Tesk2.IOC.outputStr("Weight of " + (i+1) + " thing:"); mas1[i] = IOC.InputInt();
                Tesk2.IOC.outputStr("Cost of " + (i+1) + " thing:"); mas2[i] = Tesk2.IOC.InputInt();
            }
            IOC.outputStr("The carrying capacity of your pack:");
            int carrying_capacity = Tesk2.IOC.InputInt();
            IOC.outputStr("Max value of things that u can take:" + Work6.pack(mas1,mas2,carrying_capacity));
        }catch (Exception error){
            IOC.outputStr("Error");
        }
    }
}
