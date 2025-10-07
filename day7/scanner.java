
import java.util.Scanner;


class scanner{
    public static void main(String[] args) {
        Scanner dk=new Scanner(System.in);
       /*  System.out.println("Enter Your Name : ");
        String name=dk.nextLine(); 

        System.out.println("Enter Your Age : ");
        int age=dk.nextInt();

        System.out.println("Enter your Percentage : ");
        double percentage=dk.nextDouble();

        System.out.println("--- User Details ---");
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Percentage : "+percentage);
 */

      //Find the largest number

      System.out.println("Enter two numbers");
      int a=dk.nextInt();
      int b=dk.nextInt();
      System.out.println(a>b ? "A is Largest":"B is Largest");


    }
}