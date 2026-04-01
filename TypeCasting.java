public class TypeCasting {
    public static void main(String[] args) {
         byte byteNumber = (byte) 123;
         int intNumber = byteNumber;
         System.out.println(intNumber);

         long longNumber = 12345;
         short shortNumber = (short)longNumber;
         System.out.println(shortNumber);
    }
}
