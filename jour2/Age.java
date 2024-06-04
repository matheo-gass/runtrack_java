import java.util.Scanner;
class Age{
    public static void main(String[] args){
        Scanner intinput=new Scanner(System.in);
        System.out.println("Entrer votre age: ");
        int age=Integer.parseInt(intinput.nextLine());
        if (age>67){
            System.out.println("Vous ne pouvez plus travailler.");
            return;
        };
        if (age>55){
            System.out.println("Vous pouvez travailler, mais vous aurez des difficultés à trouver de l'emploi.");
            return;
        };
        if (age>=16){
            System.out.println("Vous pouvez travailler.");
            return;
        }else{
            System.out.println("Vous ne pouvez pas encore travailler.");
            return;
        }
    };
};