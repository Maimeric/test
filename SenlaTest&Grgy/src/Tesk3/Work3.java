package Tesk3;
import java.util.regex.Pattern;
public class Work3 {
    public static boolean ProvLenghts(String str){
        if (str.length()==0)
            return false;
        return true;
    }
    public static int NumbOfWords(String str){
        int count=0;
        Pattern pattern = Pattern.compile("\\s*(\\s|,|!|\\.|\\?)\\s*");
        String[] words = pattern.split(str);
        for(String word:words)
            count++;
        return count;
    }
}
