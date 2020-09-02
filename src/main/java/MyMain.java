
import java.util.Scanner;
public class MyMain {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        System.out.print("What is your name? ");
        String name= scan.next();
        System.out.println("Hello " + name + " it is very nice to meet you! ");
        System.out.print("What is your favorite food " + name + " ?");
        String food= scan.next();
        System.out.println("I like  " + food + " too! ");
        System.out.print("What is your favorite thing to do for fun " + name + " ?");
        String hobby= scan.next();
        System.out.println("Oh, I like  " + hobby + " as well! ");
        System.out.print("What is your favorite subject in school " + name + " ?");
        String subject= scan.next();
        System.out.println("Oh, I don't really like  " + subject + " but it's ok! ");
        System.out.print("What is your favorite animal " + name + " ?");
        String animal= scan.next();
        System.out.println("Wow, I like  " + animal + " too! ");
    }
}
