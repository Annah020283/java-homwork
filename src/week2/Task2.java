package week2;

import java.util.Scanner;

public class Task2 {
    //    Cast double to float,print both variables
//    Cast float to long, print both variables
//    Cast long to int, print both variables
//    Cast int to short, print both results
//    Cast short to byte, print both results
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        float y = (float) x;
        System.out.println(x);
        System.out.println(y);
        float r = scanner.nextLong();
        long q = (long) r;
        System.out.println(r);
        System.out.println(q);
        long u = scanner.nextLong();
        int p = (int) u;
        System.out.println(u);
        System.out.println(q);
        int w = scanner.nextInt();
        short o = (short) w;
        System.out.println(w);
        System.out.println(o);
        short l = scanner.nextShort();
        byte b = (byte) y;
        System.out.println(l);
        System.out.println(b);


    }

}
