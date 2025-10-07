
import java.util.Scanner;


class  StudentResult{
    public static void main(String[] args) {
        Scanner mark = new Scanner(System.in);
         System.out.println("************************");
        System.out.println("STUDENT MARK LIST");
        System.err.println("                         ");
        System.out.println("************************");
        System.out.println(" ENTER TAMIL MARK : ");
        int tamil= mark.nextInt();
        System.out.println(" ENTER ENGLISH MARK : ");
        int english= mark.nextInt();
        System.out.println(" ENTER MATHS MARK : ");
        int maths= mark.nextInt();
        System.out.println(" ENTER SCIENCE MARK : ");
        int science= mark.nextInt();
        System.out.println(" ENTER SOCIAL MARK : ");
        int social= mark.nextInt();

        int total=tamil+english+maths+science+social;
        Double average=total/5.0;
        System.out.println("TOTAL : "+total);
        System.out.println("AVERAGE : "+average);

        if((tamil>=35)&&(english>=35)&&(maths>=35))
        {
            System.out.println(" RESULT : PASS ");
            if(average>=90){
                System.out.println(" GRADE : O ");
            } 
            else if(average>=80){
                System.out.println(" GRADE : A+ ");
            }
            else if(average>=70){
                System.out.println(" GRADE : A ");
            }
            else if(average>=60){
                System.out.println(" GRADE : B ");
            }
            else{
                System.out.println(" GRADE : C ");
            }
        }
        else{
            System.out.println(" RESULT : FAIL ");
        }
    }
}