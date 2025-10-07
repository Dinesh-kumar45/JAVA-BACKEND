class Simpleintr{

public static void main(String[] args) {
    
    int Pa=1000000;
    int Ri=7;
    int Ry=10;

    int totalIntrest=(Pa*Ri*Ry)/100;
    System.out.println("Intrest Earned : "+totalIntrest);
    System.out.println("Principle Amount : "+Pa);
    System.out.println("Total Value : "+(totalIntrest+Pa));
}
}

