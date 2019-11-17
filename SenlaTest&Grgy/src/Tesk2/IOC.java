package Tesk2;
        import java.util.Scanner;
public class IOC {
    public static void outputStr(String str){
        System.out.println(str);
    }
    public static void outputNumb(int str){
        System.out.println(str);
    }
    public static int InputInt(){
        Scanner in = new Scanner(System.in);
        return  in.nextInt();
    }
    public static String InputStr(){
        Scanner in = new Scanner(System.in);
        return  in.nextLine();
    }
}
