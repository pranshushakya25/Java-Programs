
public class StringBufferBasic {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        sb1.append("StringBuilder");
        System.out.println(sb1);
        StringBuilder sb = new StringBuilder("aman");
        System.out.println(sb.reverse());
        System.out.println(sb.capacity());
        System.out.println(sb);
        sb.append("kumar");
        System.out.println(sb);
        sb.insert(4,"Words");
        System.out.println(sb);
        sb.replace(0,3, "key");
        System.out.println(sb);
        StringBuffer s = new StringBuffer();
        int cap = s.capacity();
        System.out.println(cap); 
    }
}