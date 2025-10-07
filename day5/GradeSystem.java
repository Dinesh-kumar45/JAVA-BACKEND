class GradeSystem
{
    public static void main(String[] args) {
        int mark =86;
        String grade=(mark>=90)?"A Grade"
                    :(mark>=70)?"B Grade"
                    :(mark>=60)?"C Grade"
                    :(mark>=35)?"PASS":"FAIL";

        System.out.println(mark+" marks "+grade);            
    }
}