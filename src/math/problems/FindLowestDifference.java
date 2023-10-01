package math.problems;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator ;
public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};

        // find the symmetric difference first

        // Convert both arrays to ArrayLists
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            arrayList1.add(array1[i]);
        }
        ArrayList<Integer> arrayList2 = new ArrayList<>();

        for (int i = 0; i < array2.length; i++) {
            arrayList2.add(array2[i]);
        }
        HashSet<Integer> symmetricDifference = new HashSet<>();

        for (int i = 0; i < arrayList1.size(); i++) {
            if (!(arrayList2.contains(arrayList1.get(i)))) {
                symmetricDifference.add(arrayList1.get(i));
            }
            if (!(arrayList1.contains(arrayList2.get(i)))) {
                symmetricDifference.add(arrayList2.get(i));
            }
        }

        // find the symmetric difference first

        int lowestNumber = findLowestDifference(symmetricDifference);
        System.out.println("The lowest number in the symmetric difference is: " + lowestNumber);
    }

    public static int findLowestDifference(HashSet<Integer> set) {
        if (set.isEmpty()) {
            throw new IllegalArgumentException("The set is empty.");
        }
        int lowest = Integer.MAX_VALUE;

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num < lowest) {
                lowest = num;
            }
        }

        return lowest;

    }

}
