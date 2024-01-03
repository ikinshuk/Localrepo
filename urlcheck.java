import java.util.Scanner;
public class urlcheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Website URL: ");
        String website = sc.next();

        if(website.endsWith(".com")){
            System.out.println("Commercial Website");
        }
        else if(website.endsWith(".org")){
            System.out.println("Organization Website");
        }
        else if(website.endsWith(".in")){
            System.out.println("Indian Website");
        }
        else{
            System.out.println("Invalid Input");
        }
    }
    
}
