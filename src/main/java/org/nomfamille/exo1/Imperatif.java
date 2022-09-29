package org.nomfamille.exo1;

public class Imperatif {


   /* -------------- MODIFIEZ UNIQUEMENT LE CODE, PAS LES TESTS -------------*/


    public static String rectangle(int hauteur, int largeur){
        String returnRectangle = "";
        for(int y = 0; y < hauteur; y++){//hauteur
            if(y == 0 || y == hauteur-1){
                for(int x = 0; x < largeur; x++){//Hauteur 0 et int hauteur
                    returnRectangle += "#";
                }
                returnRectangle += "\n";
            }
            else{
                returnRectangle += "#";
                for (int x = 1; x < largeur-1; x++){
                    returnRectangle += " ";
                }
                returnRectangle += "#\n";
            }
        }
        return returnRectangle;
    }

    public static Integer premiersEntiers(int max){
        if(max <= 0){throw new IllegalArgumentException();}
        else{
            String premiersEntiers = "";
            int produit = 1;
            for(int i = 1; i <= max; i++){
                premiersEntiers += i + " ";
                produit *= i;
            }
            System.out.print(premiersEntiers/*.substring(premiersEntiers.length(),-1)*/);
            return produit;
        }
    }


}
