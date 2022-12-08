import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        int alter = keyboard.nextInt();
        if (alter <= 1){
            System.out.println("Normaler Puls = 120 bis 140");
        } else if (alter <= 4) {
            System.out.println("Normaler Puls = 100 bis 120" );
        } else if (alter <= 17) {
            System.out.println("Normaler Puls = 80 bis 100");
        } else if (alter >= 18) {
            System.out.println("Normaler Puls = 60 bis 80");
        }
    }
}
