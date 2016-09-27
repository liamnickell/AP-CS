public class PlusOut {

    public static void main(String[] args) {
        System.out.println(plusOut("asdfasddasdfasdff", "as"));
    }

    public static String plusOut(String str, String word) {
        String newStr = "";
        for(int i=0; i<str.length()-word.length()+1; i++) {
            if(str.substring(i, i+word.length()).equals(word)) {
                newStr += str.substring(i, i+word.length());
                i += word.length()-1;
            } else {
                newStr += "+"
            }
        }

        while(newStr.length() < word.length()) {
            newStr += "+";
        }

        return newStr;
    }

}