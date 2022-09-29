package org.nomfamille.exo3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.*;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CopieFichier {


    /* -------------- PAS DE TESTS -------------*/


    public static void main(String[] args) throws IOException {
        if(args.length == 0)
            System.err.print("Attention! Il n’y a aucun paramètre en ligne de commande.");
        else{
            System.out.print(args[0]);
            //Copy File content to String
            String s = new String(Files.readAllBytes(Paths.get(args[0])));
            System.out.print(s);
        }
        //Create
        File file = new File("monNom.txt");
        file.createNewFile();
        //Write
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Lazcano Alexis");
        fileWriter.close();
    }
}
