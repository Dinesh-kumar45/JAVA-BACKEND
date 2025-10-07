class Pattern{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
        for(int j=1;j<=5;j++)
        {
            System.out.print("*");
        }
        System.out.println();
        }System.out.println("*****************************");

        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print(i);
            }
            System.out.println("");
        }System.out.println("*****************************");
        
        for(int i=5;i>=0;i--){
            for(int j=1;j<=5;j++){
                System.out.print(i);
            }
            System.out.println();
        }System.out.println("*****************************");
       

       for(char i='A';i<='F';i++){
        for(char j='A';j<='F';j++){
            System.out.print(i);
        }
        System.out.println("");
       }
       System.out.println("*****************************");

       for(char i='A';i<='E';i++){
        for(char j='A';j<='E';j++){
            System.out.print(j);
        }
        System.out.println("");
       }
       System.out.println("*****************************");
       
    //    char temp='A';
    //    for(char i='A';i<='E';i++){
    //     for(char j='A';j<='E';j++){
    //         System.out.print(temp + " ");
    //         temp++;
    //     }
    //     System.out.println("");
    //    }

       char temp='A';
       for(int i=1;i<=7;i++){
        for(int j=1;j<=7;j++){
            System.out.print(temp + " ");
            temp++;
        }
        System.out.println("");
       }
       System.out.println("*****************************");

       for(char i='E';i>='A';i--){
        for(char j='A';j<='E';j++){
            System.out.print(i);
        }System.out.println("");
       }
       System.out.println("*****************************");

       for(char i='E';i>='A';i--){
        for(char j='E';j>='A';j--){
            System.out.print(j);
        }
        System.out.println("");
       }

       int tem=1;
       for(int i=1;i<=5;i++){
        for(int j=1;j<=5;j++){
            System.out.print(tem +" ");
            tem++;
        }
        System.out.println("");
       }System.out.println("*****************************");


       int x=1;

       for(int i=1;i<=5;i++){
        for(int j=1;j<=5;j++){
            System.out.print(x +" ");
            x+=2;        
        }
        System.out.println("");
       }System.out.println("*****************************");

       for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }System.out.println("");
       }System.out.println("-------------------------------");

       for(int i=5;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }System.out.println("");
       }System.out.println("-------------------------------");


       for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            System.out.print(i);
        }System.out.println("");
       }
       for(int i=5;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print(i);
        }
        System.out.println("");
       }


 
    }
}