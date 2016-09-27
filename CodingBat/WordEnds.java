public class WordEnds {

    public static void main(String[] args) {
        System.out.println(wordEnds("hvu4hb248aksfhb35", "hb"));
    }

    public static void wordEnds(String str, String word) {
        String newStr = "";
        for(int i = word.length(); i < str.length()-word.length()+1; i++) {
            if(str.substring(i-word.length(), i).equals(word)) {
                newStr += str.substring(i, i+1);
            } 
            
            if(str.substring(i, i+word.length()).equals(word)) {
              newStr += str.substring(i-1, i);
            }
        }

        return newStr;
    }

}