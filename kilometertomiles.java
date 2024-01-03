import java.util.Scanner;
public class kilometertomiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Kilometers: ");
        float km = sc.nextFloat();

        double miles = km * 0.621371;

        System.out.println(km+ " Kilometers = " +miles+ " Miles");
    }
}
