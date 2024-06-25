public class App {

    /**
     * TODO:
     * 
     * completare la classe DataHelper
     * 
     * aggiungere i seguenti metodi per testare la classe DataHelper:
     * - testRandomInteger : void
     * testare le 3 implementazioni del metodo getRandomInteger
     * 
     * - testRandomUniqueInteger : void
     * testare le 3 implementazioni del metodo getRandomUniqueInteger
     * 
     * - testFrequencyMap : void
     * testare il metodo getFrequencyMap;
     * sfruttare i metodi precedentemente svolti e utilizzarli come
     * dati in ingresso per il metodo getFrequencyMap
     * 
     */

    public static void main(String[] args) throws Exception {
        testRandomInteger();
    }

    public static void testRandomInteger() {

        DataHelper datahelperRandom = new DataHelper();

        System.out.println("restituisce una lista di numeri interi casuali compresi tra 0 e 10 (size 3)");
        System.out.println(datahelperRandom.getRandomInteger(3));
        System.out.println("restituisce una lista di numeri interi casuali compresi tra 0 e max (size 3, max 10)");
        System.out.println(datahelperRandom.getRandomInteger(3, 10));
        System.out.println("restituisce una lista di numeri interi casuali compresi tra min e max (size 3 min 100 max 300)");
        System.out.println(datahelperRandom.getRandomInteger(3,100,300));
    }
}
