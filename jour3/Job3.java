class Tableau{
    public static void main(String[] args){
        String[] monTableau={"Josette","John","Myrtille","Marc"};
        for (int i=0;i<monTableau.length;i++){
            System.out.println("Valeur "+i+1+": "+monTableau[i]);
        };
        System.out.println();
        monTableau[2]="Mireille";
        for (int i=0;i<monTableau.length;i++){
            System.out.println("Valeur "+i+1+": "+monTableau[i]);
        };
    };
};