import java.util.Scanner;
public class indivisualpercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in MATHS: ");
        int maths = sc.nextInt();
         System.out.print("Enter marks in SCIENCE: ");
        int science = sc.nextInt();
         System.out.print("Enter marks in ENGLISH: ");
        int english = sc.nextInt();

        int percentage = ((maths+science+english)*100)/300;
        System.out.println("Toatal Percentage = "+percentage+"%");

        if(maths>=33 && science>=33 && english >=33 && percentage>=40){
            System.out.println("Result = PASS");
        }
        else{
            System.out.println("Result = FAIL");
        }
    }
    
}
