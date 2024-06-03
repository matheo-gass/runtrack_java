class Facture{
    public static void main(String[] args){
        float   prix=49.99f;
        int     quantite=3;
        int     tva=20;
        //float   tax_prices=(prix/tva)*100;
        //float   tarifHT=prix*quantite;
        System.out.println("Le montant total est : "+quantite*prix);
        System.out.println("Le montant de la taxe est : "+quantite*(prix*tva/100));
        System.out.println("Le montant total à payer est : "+quantite*(prix+(prix*tva/100)));
    };
};