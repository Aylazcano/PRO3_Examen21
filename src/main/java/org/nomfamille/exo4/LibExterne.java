package org.nomfamille.exo4;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class LibExterne {


    /* -------------- PAS DE TESTS -------------*/


    public static void main(String[] args) throws IOException {
        Document document = (Document) Jsoup.connect("https://departement-info-cem.github.io/3N5-Prog3/testbot/index.html").get();
        Elements li = document.select("li");
        System.out.print(li.toString());

    }
}
