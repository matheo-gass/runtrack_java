class Tableau{
    public static int[] append(int[] array, int value){
        int[] res={};
        for (int i=0;i<array.length;i++){
            res[i]=array[i];
        };
        System.out.println("size of array")
        res[array.length]=value;
        return res;
    };
    public static int contains(int[] array, int value){
        if (array.length>0){
            for (int i=0;i<array.length;i++){
                if (array[i]==value){
                    System.out.println("the array contains "+value);
                    return 1;
                }
            };
        };
        return 0;
    };
    public static void main(String[] args){
        int[] monTableau={3,7,3,9,8};
        int[] occurences={};
        for (int i=0;i<monTableau.length;i++){
            if (contains(occurences,monTableau[i])==0){
                append(occurences,monTableau[i]);
            };
        };
    };
};