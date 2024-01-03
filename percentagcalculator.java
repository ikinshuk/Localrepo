import java.util.Scanner;
public class percentagcalculator {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("To Calculate Your Percentage, Please Enter Following Subject's Marks");
    System.out.print("MATHS: ");
    int maths = sc.nextInt();
    System.out.print("SST: ");
    int sst = sc.nextInt();
    System.out.print("SCIENCE: ");
    int science = sc.nextInt();
    System.out.print("ENGLISH: ");
    int english = sc.nextInt();
    System.out.print("COMPUTER: ");
    int computer = sc.nextInt();

    int sum = maths+science+sst+english+computer;
    float percentage = sum * 100 /500;

    System.out.print("PERCENTAGE= "+percentage);

}
    
}
