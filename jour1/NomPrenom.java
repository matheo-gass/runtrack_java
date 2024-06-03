import java.util.Scanner;

class NomPrenom{
    public static void main(String[] args){
        Scanner nomInput = new Scanner(System.in);
        System.out.println("Votre nom: ");
        String nom=nomInput.nextLine();
        Scanner matheoInput = new Scanner(System.in);
        System.out.println("Votre prénom: ");
        String prenom=matheoInput.nextLine();
        String fullName=prenom+" "+nom;
        System.out.println(fullName);
    };
};