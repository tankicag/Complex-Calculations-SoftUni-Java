import java.util.Scanner;

public class Animal_Type {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String animal = scan.nextLine();

        switch (animal){
            case "dog" :
                System.out.println("mammal");
                break;

            case "crocodile":
            case "snake":
            case "tortoise":
                System.out.println("reptile");
                break;

            default:
                System.out.println("unknown");
                break;
        }
    }
}

