import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1 = keyboard.nextInt();
        var bo = true;
        while(bo){
            int num2 = keyboard.nextInt();
            int summe = num1 += num2;
            if (num2 == 0){
                System.out.println("Summe " + summe);
                bo = false;
            }
        }
    }
}