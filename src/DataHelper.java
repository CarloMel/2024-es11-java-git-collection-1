import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class DataHelper {

    // TODO: completare i metodi seguenti

    // restituisce una lista di numeri interi casuali compresi tra 0 e 10
    public static List<Integer> getRandomInteger(int size) {

        List<Integer> listToReturn = new ArrayList<>();
        Random random = new Random();

        for (int x = 0; x < size; x++) {

            // genera numero tra 1 e 10
            int randomNumber = random.nextInt(11);
            listToReturn.add(randomNumber);
        }

        return listToReturn;
    }

    // restituisce una lista di numeri interi casuali compresi tra 0 e max
    public static List<Integer> getRandomInteger(int size, int max) {

        List<Integer> listToReturn = new ArrayList<>();
        Random random = new Random();

        for (int x = 0; x < size; x++) {

            // genera numero tra 1 e 10
            int randomNumber = random.nextInt(max + 1);
            listToReturn.add(randomNumber);
        }

        return listToReturn;
    }

    // restituisce una lista di numeri interi casuali compresi tra min e max
    public static List<Integer> getRandomInteger(int size, int min, int max) {

        List<Integer> listToReturn = new ArrayList<>();
        Random random = new Random();

        for (int x = 0; x < size; x++) {

            // genera numero tra 1 e 10
            int randomNumber = random.nextInt(max - min + 1) + min;
            listToReturn.add(randomNumber);
        }

        return listToReturn;
    }

    // restituisce una lista di numeri casuali NON DUPLICATI compresi tra 0 e 10
    public static List<Integer> getRandomUniqueInteger(int size) {

        List<Integer> intList = getRandomInteger(size);
        List<Integer> listToReturn = new ArrayList<>();

        for (int x = 0; x < intList.size(); x++) {

            listToReturn.add(intList.get(x));
        }

        return listToReturn;
    }

    // // restituisce una lista di numeri casuali NON DUPLICATI compresi tra 0 e max
    public static List<Integer> getRandomUniqueInteger(int size, int max) {

        List<Integer> intList = getRandomInteger(size, max);
        List<Integer> listToReturn = new ArrayList<>();

        for (int x = 0; x < intList.size(); x++) {

            listToReturn.add(intList.get(x));
        }

        return listToReturn;
    }

    // // restituisce una lista di numeri casuali NON DUPLICATI compresi tra min e max
    public static List<Integer> getRandomUniqueInteger(int size, int min, int max) {

        List<Integer> intList = getRandomInteger(size, min, max);
        List<Integer> listToReturn = new ArrayList<>();

        for (int x = 0; x < intList.size(); x++) {

            listToReturn.add(intList.get(x));
        }

        return listToReturn;
    }

    // restituisce una mappa di frequenza di numeri interi
    public static Map<Integer, Integer> getFrequencyMap(List<Integer> list) {

        Map<Integer, Integer> listToReturn = new HashMap<>();

        for (int x = 0; x < list.size(); x++) {
            int number = list.get(x);

            if (listToReturn.containsKey(number)) {

                int updatedValue = listToReturn.get(number);

                listToReturn.put(number, updatedValue + 1);
            } else {

                listToReturn.put(number, 1);
            }

        }

        return listToReturn;
    }

}
