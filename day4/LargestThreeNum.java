class LargestThreeNum{
    public static void main(String[] args) {
        int num_1=45;
        int num_2=18;
        int num_3=100;
        System.out.println("       Largest of Three Numbers  ");
        System.out.println("<------------------------------->");
        if((num_1>num_2)&&(num_1>num_3)){
            System.out.println(num_1+"is Largest Number ");
        }
        else if((num_2>num_1)&&(num_2>num_3)){
             System.out.println(num_2+" is Largest Number ");
        }
        else{
            System.out.println(num_3+"is Largest Number ");
        }
    }
}