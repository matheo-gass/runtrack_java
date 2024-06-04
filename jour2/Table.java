import java.util.Scanner;
class Table{
    public static void main(String[] args){
        Scanner intinput=new Scanner(System.in);
        System.out.println("Entrer un entier: ");
        int entier=Integer.parseInt(intinput.nextLine());
        for (int i=0;i<=10;i++){
            System.out.println(i+" x "+entier+" = "+entier*i);
        };
    };
};