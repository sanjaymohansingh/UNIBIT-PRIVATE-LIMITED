# UNIBIT-PRIVATE-LIMITED

#PYTHON
def find_pairs(array, target):
  pairs = []
  for i in range(1, len(array)):
    for j in range(i + 1, len(array)):
      if array[i] + array[j] == target:
        pairs.append([array[i], array[j]])
  return pairs

def merge_array(array):
  merged_array = []
  for i in range(len(array)):
    if i == 0:
      merged_array.append(array[i])
    else:
      if array[i] <= merged_array[-1]:
        merged_array.insert(0, array[i])
      else:
        j = len(merged_array) - 1
        while j >= 1 and array[i] <= merged_array[j - 1]:
          j -= 1
        merged_array.insert(j, array[i])
  return merged_array

def find_double_pairs(array, target):
  pairs = []
  for i in range(len(array)):
    for j in range(i + 1, len(array)):
      for k in range(j + 1, len(array)):
        if array[i] + array[j] + array[k] == target:
          pairs.append([array[i], array[j], array[k]])
  return pairs

def main():
  array = [1, 3, 2, 2, -4, -6, -2, 8]
  target = 4
  pairs = find_pairs(array, target)
  print(pairs)
  merged_array = merge_array(array)
  print(merged_array)
  double_target = target * 2
  double_pairs = find_double_pairs(merged_array, double_target)
  print(double_pairs)

if __name__ == "__main__":
  main()


#JAVA
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindPairs {

  public static List<List<Integer>> findPairs(int[] array, int target) {
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
    int[] array = {1, 3, 2, 2, -4, -6, -2, 8};
    int target = 4;
    List<List<Integer>> pairs = findPairs(array, target);
    System.out.println(pairs);
    List<Integer> mergedArray = mergeArray(array);
    System.out.println(mergedArray);
    int doubleTarget = target * 2;
    List<List<Integer>> doublePairs = findDoublePairs(mergedArray, doubleTarget);
    System.out.println(doublePairs);
  }
}

#JavaScript
function findPairs(array, target) {
  pairs = [];
  for (let i = 0; i < array.length; i++) {
    for (let j = i + 1; j < array.length; j++) {
      if (array[i] + array[j] == target) {
        pairs.push([array[i], array[j]]);
      }
    }
  }
  return pairs;
}

function mergeArray(array) {
  mergedArray = [];
  for (let i = 0; i < array.length; i++) {
    if (i == 0) {
      mergedArray.push(array[i]);
    } else {
      if (array[i] > mergedArray[mergedArray.length - 1]) {
        mergedArray.push(array[i]);
      } else {
        for (let j = mergedArray.length - 1; j >= 0; j--) {
          if (array[i] <= mergedArray[j]) {
            mergedArray.splice(j, 0, array[i]);
            break;
          }
        }
      }
    }
  }
  return mergedArray;
}

function findDoublePairs(array, target) {
  pairs = [];
  for (let i = 0; i < array.length; i++) {
    for (let j = i + 1; j < array.length; j++) {
      for (let k = j + 1; k < array.length; k++) {
        if (array[i] + array[j] + array[k] == target) {
          pairs.push([array[i], array[j], array[k]]);
        }
      }
    }
  }
  return pairs;
}

function main() {
  array = [1, 3, 2, 2, -4, -6, -2, 8];
  target = 4;
  pairs = findPairs(array, target);
  console.log(pairs);
  mergedArray = mergeArray(array);
  console.log(mergedArray);
  doubleTarget = target * 2;
  doublePairs = findDoublePairs(mergedArray, doubleTarget);
  console.log(doublePairs);
}

if (require.main === module) {
  main();
}
