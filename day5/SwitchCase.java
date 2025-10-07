class SwitchCase{
    public static void main(String[] args) {
        System.out.println("=========================");
        System.out.println("Switch Case");
        System.out.println("=========================");
        int num1=10,num2=20;
        String opr="*";
        switch (opr) {
            case "+":{
                int ans=num1+num2;
                System.out.println(ans);
                break;
            }
            case "-":{
                int ans=num1-num2;
                System.out.println(ans);
                break;
            }
            case "*":{
                int ans=num1*num2;
                System.out.println(ans);
                break;
            }
            case "/":{

                int ans=num1/num2;
                System.out.println(ans);
                break;
            }
                
            default:
               System.out.println("ENTER THE VALUE +,-,*,/");
               break;
        }
    }
}