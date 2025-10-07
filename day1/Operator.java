
class Operator {

    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 20;

//ARITHMETIC OPERATOR
        System.out.println("ARITHMETIC OPERATOR");
        System.out.println("***********************");
        int num3 = num1 + num2;
        System.out.println(num3);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);

//ASSIGNMENT OPERATOR
        System.out.println("ASSIGNMENT OPERATOR");
        System.out.println("***********************");
        num1 += num2;
        System.out.println(num1);
        num1 -= num2;
        System.out.println(num1);
        num1 *= num2;
        System.out.println(num1);
        num1 /= num2;
        System.out.println(num1);
        num1 %= num2;
        System.out.println(num1);

//COMPARISON OPERATOR
        int mark1 = 90;
        int mark2 = 85;
        System.out.println("COMPARISON OPERATOR");
        System.out.println("***********************");
        System.out.println(mark1 > mark2);
        System.out.println(mark1 >= mark2);
        System.out.println(mark1 <= mark2);
        System.out.println(mark1 == mark2);
        System.out.println(mark1 != mark2);

//LOGICAL OPERATOR
        System.out.println("LOGICAL OPERATOR");
        System.out.println("***********************");
        System.out.println(((mark1 > 50) && (mark2 > 50)));
        System.out.println(((mark1 < 50) || (mark2 == 50)));
        System.out.println((!(mark1 > 50)));

//INCREMENT AND DECREMENT OPERATOR
        System.out.println("INCREMENT AND DECREMENT OPERATOR");
        System.out.println("*************************************");

        int x = 45;
        int y = 20;
        // int check=++x;  pre increment check = 46
        int check=x++;

        System.out.println(x++);
        System.out.println(check);

        // int value=y--; post decrement value = 20
        int value=--y;

        System.out.println(y--);
        System.out.println(value);

    }
}
