class Tableau{
    public static void main(String[] args){
        int[] monTableau={3,7,3,9,8};
        int[] occurences={0,0,0,0,0,0,0,0,0,0};
        for (int i=0;i<monTableau.length;i++){
            occurences[monTableau[i]]++;
        };
        for (int i=0;i<10;i++){
            System.out.println("Nombre d'apparitions de "+i+": "+occurences[i]);
        };
    };
};