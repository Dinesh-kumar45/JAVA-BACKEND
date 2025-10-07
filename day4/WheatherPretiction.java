class WheatherPretiction{
    public static void main(String[] args) {
        int temp=42;
        if(temp>=35)
        {
            System.out.println("Wheather : Hot Day");
        }
        else if(temp>=25)
        {
            System.out.println("Wheather : Warm Day");
        }
        else if (temp>=15) {
            System.out.println("Wheather : Cool Day ");
        }
        else{
            System.out.println("Wheather : Cold Day");
        }
    }
}