
class De{
    public static void main(String[] args){
        int res_nb=0;
        System.out.println("Voici toute les combinaisons possible avec trois lancés de dé");
        for (int i=1;i<=6;i++){
            for (int j=1;j<=6;j++){
                for (int k=1;k<=6;k++){
                    System.out.println("Premier dé: "+i+", Deuxième dé: "+j+", Troisième dé: "+k);
                    res_nb++;
                };
            };
        };
        System.out.println("Le nombre de combinaisons possible avec trois lancés de dé est de "+res_nb);
    };
};