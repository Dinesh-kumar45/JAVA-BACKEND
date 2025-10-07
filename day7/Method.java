class Method{
    
        //Without Args and without Return

        static void add(){
            int a=5;
            int b=10;
            System.out.println(a+b);

        }
        //With args and without return

        static void mul(int a,int b){
            System.out.println(a*b);
        }

        //Without args and with return

        static int  div(){
            int a=100;
            int b=5;
            return a/b;
        }
        //with arg, with return

        static int sub(int a,int b){
            return a-b;
        }

        
        public static void main(String[] args) {
        add();
        mul(5,9);
        System.out.println(div());
        System.out.println(sub(50, 5));



      }
    }
      