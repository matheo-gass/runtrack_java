import java.util.Scanner;
class Numero{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Entrer un numéro: ");
        String entier=input.nextLine();
        System.out.println("La longeur de "+entier+" est de: "+entier.length());
    };
};