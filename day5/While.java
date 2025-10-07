
class While {
    public static void main(String[] args) {
        System.out.println("*************************");
        System.out.println("While Loop");
        System.out.println("*************************");
         System.out.println("Odd or Even");
        int a = 1;
        while (a <= 10) {
            if (a % 2 == 0) {
                System.out.println(a + " is Even Number");
            } else {
                System.out.println(a + " is Odd Number");
            }
            a++;
        }
        System.out.println("*************************");

        System.out.println("Multiplication of ");

        int Number = 6;
        int i = 1;

        while (i <= 10) {
            System.out.println(Number + " x " + i + " = " + Number * i);
            i++;
        }

        System.out.println("*************************");
        System.out.println("Factorial of 9");

        int fact = 1;
        int b = 1;
        while (b <= 9) {
            fact *= b;
            b++;
        }
        System.out.println("Factorial Num of 9 is : " + fact);

        System.out.println("*************************");

        System.out.println("Palindrome or Not");

        int num = 121;
        int defaul = num;
        int rev = 0;
        while (num > 0) {
            int dig = num % 10;
            rev = (rev * 10) + dig;
            num = num / 10;

        }
        if (defaul == rev) {
            System.out.println(defaul + "is palindrome");
        } else {
            System.out.println(defaul + "is not a palindrome");
             System.out.println("*************************");

        }

    }
}
