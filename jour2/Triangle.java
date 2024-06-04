import java.util.Scanner;
class Triangle{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Entrer un numéro: ");
        int entier=Integer.parseInt(input.nextLine());
        for (int i=0;i<=entier;i++){
            System.out.println("*".repeat(i));
        };
    };
};