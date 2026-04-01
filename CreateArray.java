public class CreateArray {
    public static void main(String[] args) {
        
        int arrInt[] = new int[6];
        System.out.println(arrInt.length);
        arrInt[0] = 21;
        arrInt[1] = 45;
        arrInt[2] = 67;
        arrInt[3] = 893;
        arrInt[4] = 98;
        arrInt[5] = 121;

        // System.out.println(arrInt[0]+" ");
        // System.out.println(arrInt[1]+" ");
        // System.out.println(arrInt[2]+" ");
        // System.out.println(arrInt[3]+" ");
        // System.out.println(arrInt[4]+" ");
        // System.out.println(arrInt[5]+" ");

        for(int index=0;index<arrInt.length;index++){
            System.out.println(arrInt[index]+" ");
        }
    }
}
