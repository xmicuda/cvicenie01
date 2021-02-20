package sk.stuba.fei.uim.oop;
import java.util.Scanner;

public class App{
    public static void main(String[] args){
        System.out.print("What is the input string? ");

        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.print(name+" has "+name.length()+" characters.");

    }
}
