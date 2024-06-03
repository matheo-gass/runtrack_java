import java.util.Scanner;

class Somme{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Premier Entier : ");
        int entier1 = Integer.parseInt(input.nextLine());
        System.out.println("Deuxième Entier : ");
        int entier2 = Integer.parseInt(input.nextLine());
        int somme=entier1+entier2;
        System.out.println("La somme est de "+somme);
    };
};