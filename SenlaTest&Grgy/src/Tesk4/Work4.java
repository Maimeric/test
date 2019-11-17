package Tesk4;

public class Work4 {
    public static int CountRepeatWords(String text, String word){
        int count=0;
        String words[] = text.split("\\W+" );
        for (int i = 0; i < words.length; i++) {
            if (words[i].toLowerCase().equals(word.toLowerCase()))
                count++;
        }
        return count++;
    }
}
