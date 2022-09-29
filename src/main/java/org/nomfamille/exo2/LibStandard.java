package org.nomfamille.exo2;

import javax.lang.model.element.Element;
import java.util.*;

public class LibStandard {


    /* -------------- MODIFIEZ UNIQUEMENT LE CODE, PAS LES TESTS -------------*/


    public static List<Integer> nFoisN(int max) {
        List<Integer> returnN = new ArrayList<>();
        for(int i = 1; i <= max; i++)
            for(int j = 1; j <= i; j++)
                returnN.add(i);
        return returnN;
    }

    public static List<Integer> triCroissant(List<Integer> source) {
        List set = new ArrayList();
        for (int i: source) {
            set.add(i);
        }
        Collections.sort(set);
        return set;
    }

}
