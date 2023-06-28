import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnibitAssignment {

  public static List<List<Integer>> UnibitAssignmentt(int[] array, int target) {
    List<List<Integer>> pairs = new ArrayList<>();
    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] + array[j] == target) {
          pairs.add(Arrays.asList(array[i], array[j]));
        }
      }
    }
    return pairs;
  }

  public static List<Integer> mergeArray(int[] array) {
    List<Integer> mergedArray = new ArrayList<>();
    for (int i = 0; i < array.length; i++) {
      if (i == 0) {
        mergedArray.add(array[i]);
      } else {
        if (array[i] > mergedArray.get(mergedArray.size() - 1)) {
          mergedArray.add(array[i]);
        } else {
          int j = mergedArray.size() - 1;
          while (j >= 0 && array[i] <= mergedArray.get(j)) {
            j--;
          }
          mergedArray.add(j + 1, array[i]);
        }
      }
    }
    return mergedArray;
  }

  public static List<List<Integer>> findDoublePairs(List<Integer> array, int target) {
    List<List<Integer>> pairs = new ArrayList<>();
    for (int i = 0; i < array.size(); i++) {
      for (int j = i + 1; j < array.size(); j++) {
        for (int k = j + 1; k < array.size(); k++) {
          if (array.get(i) + array.get(j) + array.get(k) == target) {
            pairs.add(Arrays.asList(array.get(i), array.get(j), array.get(k)));
          }
        }
      }
    }
    return pairs;
  }

  public static void main(String[] args) {
    int[] array = { 1, 3, 2, 2, -4, -6, -2, 8 };
    int target = 4;
    List<List<Integer>> pairs = UnibitAssignmentt(array, target);
    System.out.println(pairs);
    List<Integer> mergedArray = mergeArray(array);
    System.out.println(mergedArray);
    int doubleTarget = target * 2;
    List<List<Integer>> doublePairs = findDoublePairs(mergedArray, doubleTarget);
    System.out.println(doublePairs);
  }
}
