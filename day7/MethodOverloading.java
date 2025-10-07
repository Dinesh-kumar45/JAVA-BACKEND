class MethodOverloading{
    static int add(int a, int b){
        return a+b;    
    }
    static double add(double a, double b){
        return a+b;
    }
    static String add(String a, String b){
        return a+b;
    }
    public static void main(String[] args) {
        int num1=add(20, 25);
        double num2=add(20.0, 25.0);
        String num3=add("20", "25");

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        
    }
}