package Tesk4;

public class Main4 {
    public static void main(String[] args) {
        int count = 0;
        Tesk2.IOC.outputStr("Input your text");
        String text =  Tesk2.IOC.InputStr();
        Tesk2.IOC.outputStr("Input your word");
        String word =  Tesk2.IOC.InputStr();
        Tesk2.IOC.outputStr("This word occur " + Work4.CountRepeatWords(text,word) + " times");
    }
}
