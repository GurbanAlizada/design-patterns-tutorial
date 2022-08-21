package iteratorPattern2;

import java.util.Iterator;
import java.util.List;


public class App {

    public static void main(String[] args) {

        Kitap kitap = new Kitap("Matematik");

        Fasikul fasikul = new Fasikul("Türkce");



//        List<Soru> soruList = kitap.getSoruList();

//        for (Soru soru : soruList) {
//            Long soruNo = soru.getSoruNo();
//
//            System.out.println("Soru No: " + soruNo);
//        }



//        Soru[] sorular = fasikul.getSorular();
//
//        for (Soru soru : sorular) {
//            Long soruNo = soru.getSoruNo();
//
//            System.out.println("Soru No: " + soruNo);
//        }



        Iterator soruIteratorKitap = kitap.getSoruIterator();
        Iterator soruIteratorFasikul = fasikul.getSoruIterator();

        yazdir(soruIteratorKitap);
        yazdir(soruIteratorFasikul);
    }

    private static void yazdir(Iterator iterator) {


        while (iterator.hasNext()) {
            Soru soru = (Soru) iterator.next();

            Long soruNo = soru.getSoruNo();

            System.out.println("Soru No: " + soruNo);
        }


    }



}
