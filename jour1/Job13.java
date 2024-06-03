import java.util.Scanner;

class Job13{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Entier : ");
        int entier = Integer.parseInt(input.nextLine());
        int index=1;
        while (index!=entier){
            System.out.println(index);
            index++;
        };
        System.out.println(entier);
    };
};