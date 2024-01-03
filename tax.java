import java.util.Scanner;
public class tax {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your Income: ");
    int income = sc.nextInt();
    double tincome;

    if(income<=250000){
        System.out.println("NO TAX");
        tincome = income-(income*0);
        System.out.println("Income after tax = "+tincome);
    }
    else if(income>250000 && income<=500000){
        System.out.println("5% TAX");
        tincome = income-(income*0.05);
        System.out.println("Income after tax = "+tincome);
    }
    else if(income>500000 && income<=1000000){
        System.out.println("20% TAX");
        tincome = income-(income*0.2);
        System.out.println("Income after tax = "+tincome);
    }
    else{
        System.out.println("30% TAX");
        tincome = income-(income*0.3);
        System.out.println("Income after tax = "+tincome);
    }
 }   
}
