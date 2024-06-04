import java.util.Scanner;
class Factorielle{
    public static void main(String[] args){
        Scanner intinput=new Scanner(System.in);
        System.out.println("Entrer un entier: ");
        int entier=Integer.parseInt(intinput.nextLine());
        System.out.println(entier+"! = "+entier);
        int res=1;
        for (int i=1;i<entier;i++){
            res+=res*i;
        };
        System.out.println("La factorielle de "+entier+" est: "+res);
    };
};