package week2;


import java.util.Random;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Random random = new Random();
        int x = random.nextInt();
        if (x<0) {
            x = x*-1;

        }
        int y = x%6+2;
        System.out.println(y);

    }
}
