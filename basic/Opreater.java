package basic;

import java.util.Scanner;

public class Opreater {
    public static void main(String[] args) {
        int a,b;
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your name: ");
        String name = sc.nextLine();
    System.out.println("Enter number :Shree");
    a = sc.nextInt();
    b = sc.nextInt();

    System.out.println("A+B="+(a+b));
    System.out.println("A-B="+(a-b));
    System.out.println("A*B="+a*b);
    System.out.println("A/B="+a/b);
    System.out.println("A%B="+a%b);


    }

}
