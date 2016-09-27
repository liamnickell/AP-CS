public class ZipZap {

    public static void main(String[] args) {
        System.out.println(zipZap("asdfzipfjcs"));
    }

    public static String zipZap(String str) {
        String newStr = str;
        int num = 0;

        for(int i = 0; i < str.length()-2; i++) {
            if(str.charAt(i) == 'z' && str.charAt(i+2) == 'p') {
                num++;
            }
        }

        if(num > 0) {
            newStr = "";
            for(int i = 0; i < str.length()-2; i++) {
                if(str.charAt(i) == 'z' && str.charAt(i+2) == 'p') {
                    newStr += "zp";
                    i += 2;
                    num--;
                } else if(num == 0) {
                    newStr += str.substring(i);
                    i = str.length();
                } else {
                    newStr += str.substring(i, i+1);
                }
            }
        }

        return newStr;
    }

}