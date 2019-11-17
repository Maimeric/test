package Task5;

public class Main {
    public static void main(String[] args) {
        try {
            Tesk2.IOC.outputStr("Input final number of cycle");
            int n = Tesk2.IOC.InputInt();
            if (n <= 100 && n >= 0) {
                for (int i = 0; i <= n; i++)
                    if (Work5.isPalindrome(i) == true)
                        Tesk2.IOC.outputStr(i + " ");
            }
            else {
                Tesk2.IOC.outputStr("Wrong number");
            }
        }catch (Exception error){
            Tesk2.IOC.outputStr("Error");
        }
    }
}
