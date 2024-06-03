import java.util.Scanner;

class Heure{
    public static void main(String[] args){
        Scanner heureInput = new Scanner(System.in);
        System.out.println("Entrez une durée en minutes : ");
        String minutes=heureInput.nextLine();
        int minutesTotales = Integer.parseInt(minutes)%60;
        int heuresTotales = Integer.parseInt(minutes)/60;
        System.out.println(minutes+" minutes est équivalent à "+heuresTotales+" heure(s) et à "+minutesTotales+" minute(s).");
    };
};