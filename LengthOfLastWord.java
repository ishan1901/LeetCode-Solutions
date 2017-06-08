public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        if (words.length == 0) {return 0;}
        int i = 0;
        while(i < words.length - 1) {i++;}
        return words[i].length();
    }
}
