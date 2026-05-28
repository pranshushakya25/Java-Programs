
import java.util.Scanner;

public class ObjectAC {
    Scanner sc = new Scanner(System.in);

    // properties || state
    // instance variable || field variable 
    String BrandName;
    float power;
    float coolingcapacity;
    long price;

    // Behavious
    // Methods

    public void cool(){
        System.out.println(BrandName+" "+"cooling");
    }
    public void heat(){
        System.out.println(BrandName+" "+"heating");
    }
    public void printDetails(){
        System.out.println(BrandName+" "+coolingcapacity+" "+price+" "+power);
    }
    public static void main(String[] args){
        ObjectAC obj = new ObjectAC();
        obj.BrandName = "LG"; 
        obj.coolingcapacity=2100;
        obj.price = 70000;
        obj.power = 2;
        obj.cool();
        obj.printDetails();
        ObjectAC obj1 = new ObjectAC();
        obj1.BrandName = "TATA";
        obj1.coolingcapacity = 2100;
        obj1.price = 70000;
        obj1.power = 2;
        obj1.cool();
        obj1.printDetails();  
    }
}

