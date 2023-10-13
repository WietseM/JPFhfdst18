package be.vdab.jpfhfdst18;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        var zaaiSeizoen = Seizoen.LENTE;
        var skiSeizoen = Seizoen.WINTER;
        System.out.println(zaaiSeizoen);
        System.out.println(zaaiSeizoen.getBeginMaand());
        System.out.println(skiSeizoen);
        System.out.println(skiSeizoen.getBeginMaand());

        for (var seizoen : Seizoen.values()){
            System.out.println(seizoen);
        }

        Random rand = new Random();
        int index = rand.nextInt(4);
        System.out.println(Seizoen.values()[index]);


        var zwemSeizoen = Seizoen.valueOf("ZOMER");
        System.out.println(zwemSeizoen.ordinal());

        var persoon = new Persoon("Wietse", "Mees", Geslacht.MAN);
        System.out.println(persoon);
    }
}
