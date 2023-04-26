import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println(walk(4,15));
        System.out.println(walk(18,25));
        System.out.println(walk(50,5));
        System.out.println(walk(35,-15));
        System.out.println(walk(22,31));
        System.out.println(generateRandomAge());

    }


    public static String walk(int age, int temperature) {
        if (age >= 20 && age <= 40 && temperature >= -20 && temperature <= 30) {
            return  "Можно идти гулять";
        } else if (age <= 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age >= 40 && temperature >= -10 && temperature <= 25) {
           return  "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
    public static int generateRandomAge(){
        Random rand = new Random();
        int randomNumber = rand.nextInt(100);
       return randomNumber;
    }
}
