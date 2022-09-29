package org.nomfamille.exo1;
import org.junit.Assert;
import org.junit.Test;

public class TestImperatif
{
    @Test(timeout = 1000)
    public void testA(){
        String ls = "\n";
        String taille4x6 =
                        "######"+ls+
                        "#    #"+ls+
                        "#    #"+ls+
                        "######"+ls;
        System.out.println(taille4x6);
        System.out.println(Imperatif.rectangle(4,6));
        Assert.assertEquals("Les deux String devraient être égales", taille4x6, Imperatif.rectangle(4,6));
        String taille6x3 =
                        "###"+ls+
                        "# #"+ls+
                        "# #"+ls+
                        "# #"+ls+
                        "# #"+ls+
                        "###"+ls;
        System.out.println(taille6x3);
		System.out.println(Imperatif.rectangle(6,3));
        Assert.assertEquals("Les deux String devraient être égales", taille6x3, Imperatif.rectangle(6,3));
        String taille2x2 =
                        "##"+ls+
                        "##"+ls;
        System.out.println(taille2x2);
        System.out.println(Imperatif.rectangle(2,2));
        Assert.assertEquals("Les deux String devraient être égales", taille2x2, Imperatif.rectangle(2,2));
    }

    @Test(timeout = 1000)
    public void testB(){
        Assert.assertEquals(2, Imperatif.premiersEntiers(2).intValue());
        Assert.assertEquals(6, Imperatif.premiersEntiers(3).intValue());
        Assert.assertEquals(120, Imperatif.premiersEntiers(5).intValue());
        Assert.assertEquals(362880, Imperatif.premiersEntiers(9).intValue());
    }

    @Test(timeout = 1000, expected = IllegalArgumentException.class)
    public void testB1(){
        Assert.assertNull(Imperatif.premiersEntiers(-10));
    }

    @Test(timeout = 1000, expected = IllegalArgumentException.class)
    public void testB2(){
        Assert.assertNull(Imperatif.premiersEntiers(0));
    }
}
