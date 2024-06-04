class Boucle{
    public static void main(String[] args){
        int somme=0;
        for (int i = 1;i<=100;i++){
            if (i%2==0){
                somme+=i;
            };
        };
        System.out.println("La somme des nombre pairs entre 1 à 100 est de : "+somme);
    };
}