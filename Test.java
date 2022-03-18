
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Degiskenler olustur
        int age ;


        Scanner input = new Scanner(System.in);
        System.out.println("Dogum Yilinizi Giriniz : ");
        age = input.nextInt();
        age = age%12;


        if (age == 0){
            System.out.println("Çin Zodyağı Burcunuz : Maymun");
        }else if (age == 1){
            System.out.println("Çin Zodyağı Burcunuz : Horoz");
        }else if (age == 2){
            System.out.println("Çin Zodyağı Burcunuz : Kopek");
        }else if (age == 3){
            System.out.println("Çin Zodyağı Burcunuz : Domuz");
        }else if (age == 4){
            System.out.println("Çin Zodyağı Burcunuz : Fare");
        }else if (age == 5){
            System.out.println("Çin Zodyağı Burcunuz : Okuz");
        }else if (age == 6){
            System.out.println("Çin Zodyağı Burcunuz : Kaplan");
        }else if (age == 7){
            System.out.println("Çin Zodyağı Burcunuz : Tavsan");
        }else if (age == 8){
            System.out.println("Çin Zodyağı Burcunuz : Ejderha");
        }else if (age == 9){
            System.out.println("Çin Zodyağı Burcunuz : Yilan");
        }else if (age == 10){
            System.out.println("Çin Zodyağı Burcunuz : At");
        }else if (age == 11){
            System.out.println("Çin Zodyağı Burcunuz : koyun");
        }







    }
}
