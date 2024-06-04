import java.util.Scanner;
class PremierDernier{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Entrer un numéro: ");
        String entier=input.nextLine();
        System.out.println("Le premier chiffre de "+entier+" est: "+entier.charAt(0));
        System.out.println("Le dernier chiffre de "+entier+" est: "+entier.charAt(entier.length()-1));
    };
};