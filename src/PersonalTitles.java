import java.util.Scanner;

public class PersonalTitles {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double age = Double.parseDouble(scan.nextLine());

        char gender = scan.nextLine().charAt(0);

        if (gender == 'm') {

            if (age < 16) {
                System.out.println("Master");
            }
            else {

                System.out.println("Mr.");
            }
        } else if (gender == 'f') {

            if (age < 16) {
                System.out.println("Miss");

            } else {
                System.out.println("Ms.");
            }
        }

    }
}
