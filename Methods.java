

public class Methods {
    public void sum(int num1 , int num2){
        int total = num1+num2;
        System.out.println(total);
    }
    public static void sub(int num1 , int num2){
        int totalsub = num1-num2;
        System.out.println(totalsub);
    }
    public static void multi(int num1 , int num2){
        int multi = num1*num2;
        System.out.println(multi);
    }
    public static void div(float num1 , float num2){
        float div = num1/num2;
        System.out.println(div);
    }
    public static void main(String[] args) {
        Methods ms = new Methods();
        ms.sum(12,5);
        ms.sub(10,5);
        ms.multi(2,3);
        ms.div(6,5);
    }
}
