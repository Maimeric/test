package Tesk3;

public class Main {
    public static void main(String[] args) {
        try {
            Tesk2.IOC.outputStr("Input ");
            String str=Tesk2.IOC.InputStr();
            if(Work3.ProvLenghts(str)){
                Tesk2.IOC.outputStr("Numb of words= "+Work3.NumbOfWords(str));
                if (Character.isLetter(str.charAt(0)))
                    System.out.print(Character.toUpperCase(str.charAt(0)));
                for (int i = 1; i < str.length(); i++) {
                    if (str.charAt(i - 1) == ' ' && Character.isLetter(str.charAt(i)))
                        System.out.print(Character.toUpperCase(str.charAt(i)));
                    else
                        System.out.print(str.charAt(i));
                }
            }else
                Tesk2.IOC.outputStr("Error");
        }catch (Exception error){
            Tesk2.IOC.outputStr("Error");
        }
    }
}
