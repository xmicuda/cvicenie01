package sk.stuba.fei.uim.oop;
import java.util.Scanner;

public class App{
    public static void main(String[] args){
        System.out.print("What is your name? ");

        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.print("Hello, "+name+", nice to meet you!");

    }
}
