package nyugtaprojektek;
/* Probléma:
tüntessük el a kézzel beírt szóközöket,
a huf ne tartalmazzon eurót
a kedvezmény helyett legyen szervízdíj, amit hozzá kell adni a végössdzeghez
*/
public class Nyugta3 {

    public static void main(String[] args) {
        //String csillagok = "********************";
        vonal("*",20);
        kiiras("\n");
        //kiiras("\n");
        //System.out.println(csillagok);
        //System.out.println("     Nyugta 3");
        //System.out.printf("%14s\n", "Nyugta 3");
        szovegFormKiir("Nyugta 3");
        kiiras("\n");
        
        //System.out.println(csillagok);
         vonal("*",20);
        kiiras("\n");
        
        final String HUF = "Ft";
        int tetel1 = 350, tetel2 = 90, tetel3 = 1320;
//        System.out.printf("Tétel 1:     %d %s\n", tetel1, huf);
//        System.out.printf("Tétel 1:      %d %s\n", tetel2, huf);
//        System.out.printf("Tétel 3:    %d %s\n", tetel3, huf);
        //System.out.printf("%10s: %5d %s\n", "Tétel 1", tetel1, HUF);
        penznemEsTetel("Tétel","ft",1);
        penznemEsTetel("Tétel","ft",1);
        penznemEsTetel("Tétel","ft",1);
        //System.out.printf("%10s: %5d %s\n", "Tétel 2", tetel2, HUF);
        //System.out.printf("%10s: %5d %s\n", "Tétel 3", tetel3, HUF);

        vonal("=",20);
        kiiras("\n");
        //String duplaVonal = "====================";
        //System.out.println(duplaVonal);
        
        int osszesen = tetel1 + tetel2 + tetel3;
        //System.out.printf("Összesen:   %d %s\n", osszesen, huf);
        System.out.printf("%10s: %5d %s\n", "Összesen", osszesen, HUF);
        
        //String szaggatottVonal = "--------------------";
        //System.out.println(szaggatottVonal);
        vonal("-", 20);
        kiiras("\n");
        
        int szervizDijMertek = 10;
        int szervizDij = osszesen / szervizDijMertek;
        //System.out.printf("Kedvezmény:  %d %s\n", kedvezmeny, huf);
        System.out.printf("%10s: %5d %s\n", "Szervízdíj", szervizDij, HUF);
        System.out.printf("(%d%%)\n", szervizDijMertek);
        
        //System.out.println(duplaVonal);
        
        //int fizetendo = osszesen - szervizDij;
        int fizetendo = osszesen + szervizDij;
        //System.out.printf("Fizetendő:  %d %s\n", fizetendo, huf);
        System.out.printf("%10s:  %d %s\n", "Fizetendő", fizetendo, HUF);
        double euro = fizetendo / 350.0;
        //HUF = "\u20ac";//EZ NEM JÓ!!!!
        final String eur = "\u20ac";
        //System.out.printf("            %f %s\n", euro, eur);
        
        /* 7.2 7 szélesen 2 tizedessel,a max: 1234.99
        *  a %10s  egy "" -t ír ki, ezzel tolom beljebb
        */
        System.out.printf("%10s%7.2f %s\n","", euro, eur);//
      
        //System.out.println(szaggatottVonal);
        vonal("-", 20);
         kiiras("\n");
        //System.out.println("");
        //String rovidVonal = "_______";
        //System.out.print(rovidVonal);
        vonal("_",7);
        
        //String rovidVonalValaszto = "      ";
        //System.out.print(rovidVonalValaszto);
        vonal(" ", 6);
        //System.out.println(rovidVonal);
        vonal("_",7);
        kiiras("\n");
        
        //System.out.print(" Dátum");
        kiiras(" Dátum");
        //System.out.print(rovidVonalValaszto);
        kiiras("       Név");
        kiiras("\n");
        //vonal("_",7);
        
        //System.out.println(csillagok);
        vonal("*",20);
        kiiras("\n");
        kiiras("        CÉG");
        kiiras("\n");
       //System.out.println("        CÉG");
        //System.out.println(csillagok);
        vonal("*",20);
        kiiras("\n");
    }
    public static void main0(String[] args) {
        //kiiras("ok");
        //penznemEsTetel();
        //vonalKiirasSeged();
    }

    private static void kiiras(String szoveg) {
        System.out.print(szoveg);
        
    }

    private static void vonal(String szaggatottVonal,int vonalszam) {
        for (int i = 0; i < vonalszam; i++) {
            kiiras(szaggatottVonal);
        }
    }

    private static void penznemEsTetel(String tetel,String penznem) {
        //System.out.printf("%10s: %5d %s\n", "Tétel %d", tetel, penznem, tetelszam);
        //System.out.printf("%10s: %5d %s\n", "Tétel %30d", tetel,tetelszam,penznem);
        System.out.printf("%10s: %5d %s\n", "Tétel 2", tetel, penznem);
        //System.out.printf("%10s: %5d %s\n", "Tétel","%d", tetel, penznem,nemtom,tetelszam);
    }

    private static void szovegFormKiir(String szoveg) {
        System.out.printf("%14s",szoveg);
    }

    private static void szamFormKiir() {
        
    }

}
