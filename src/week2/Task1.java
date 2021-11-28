package week2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//        Cast byte to short type, print both variables
//        Cast short to int type, print both variables
//        Cast int to long, print both variables
//        Cast long to float, print both variables
//        Cast float to double type, print both variables
        Scanner scanner = new Scanner(System.in);
        byte i = scanner.nextByte();
        short x = i;
        System.out.println(x);
        short y = scanner.nextShort();
        int z = y;
        System.out.println(y);
        int a = scanner.nextInt();
        long b = a;
        System.out.println(a);
        long t = scanner.nextLong();
        float p = t;
        System.out.println(t);
        float r = scanner.nextFloat();
        double q = r;
        System.out.println(r);




    }
}
