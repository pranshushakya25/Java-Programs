public class StringBufferPalindrome {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        str.append("abaaba");
        int st = 0;
        int end = str.length()-1;
        // while(st<end){
        //     str.charAt(st) != str.charAt(end);
        //         return;
        //     }
        // }
        String s = new String();
        s = s+"ab";
        s = s.concat("abaf");
        System.out.println(s);
    }
}
