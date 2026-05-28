
import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // StringBuffer sb = new StringBuffer();
        StringBuffer name = new StringBuffer("Aman");
        System.out.println(name);
        name.append(" kumar");
        System.out.println(name);
        name.insert(4, " CSE");
        System.out.println(name);
        name.replace(5,8," cse");
        System.out.println(name);
        StringBuilder city = new StringBuilder("mathura");
        city.append(" Vridavan");
        System.out.println(city);
        StringBuffer sb = new StringBuffer("Hey");
        System.out.println(sb.capacity());
    }
}
