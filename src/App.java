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

        // getRandomIntegerTester();
        // getRandomIntegerTesterMaxSize();
        getRandomIntegerTesterMaxAndMinSize();
    }

    public static void getRandomIntegerTester() {

        DataHelper dh = new DataHelper();
        System.out.println(dh.getRandomInteger(10));
    }

    public static void getRandomIntegerTesterMaxSize() {

        DataHelper dh = new DataHelper();
        System.out.println(dh.getRandomInteger(8,100));
    }

    public static void getRandomIntegerTesterMaxAndMinSize() {

        DataHelper dh = new DataHelper();
        System.out.println(dh.getRandomInteger(5,100, 200));
    }
}
