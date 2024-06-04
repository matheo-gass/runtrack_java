import java.util.Scanner;
class Somme{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Entrer un numéro: ");
        String entier=input.nextLine();
        int res=0;
        for (int i=0;i<entier.length();i++){
            res+=Integer.parseInt(""+entier.charAt(i));
        };
        System.out.println("La somme des chiffres de "+entier+" est de "+res);
    };
};