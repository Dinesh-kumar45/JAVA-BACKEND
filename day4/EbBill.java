class EbBill{
    public static void main(String[] args) {
        int units=850;
        double bill=0;
        if(units<=100){
            bill=units*0;
        }else if (units<=200) {
            bill=(100*0)+(units - 100)*2.25;
        }else if (units<=500){
            bill=(100*0)+(100*2.25)+(units -200)*4.50;
        }
        else{
            bill=(100*0)+(100*2.25)+(300*4.50)+(units - 500)*6.00;
        }
         System.out.println("Total EB Bill = " + bill);

    }
}