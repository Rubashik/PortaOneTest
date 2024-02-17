import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Calculator {

    public static int findMin(List<Integer> list){
        return Collections.min(list);
    }

    public static int findMax(List<Integer> list){
        return Collections.max(list);
    }

    public static double findAverage(List<Integer> list){
        double sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum / list.size();
    }

    public static double findMedian(List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>(list); // Create a copy of the original list
        Collections.sort(sortedList);

        if (sortedList.size() % 2 == 0) {
            return (sortedList.get(sortedList.size() / 2 - 1).doubleValue() + sortedList.get(sortedList.size() / 2).doubleValue()) / 2.0;
        } else {
            return sortedList.get(sortedList.size() / 2).doubleValue();
        }
    }

    public static List<Integer> findLongestIncrSequence(List<Integer> numbers){
        List<Integer> currentSequence = new ArrayList<>(Arrays.asList(numbers.get(0)));
        List<Integer> longestSequence = new ArrayList<>(Arrays.asList(numbers.get(0)));

        for(int i = 1; i < numbers.size(); i++){
            if (numbers.get(i) > numbers.get(i - 1)) {
                currentSequence.add(numbers.get(i));
            } else {
                if (currentSequence.size() > longestSequence.size()) {
                    longestSequence = new ArrayList<>(currentSequence);
                }
                currentSequence.clear();
                currentSequence.add(numbers.get(i));
            }
        }

        if (currentSequence.size() > longestSequence.size()) {
            longestSequence = new ArrayList<>(currentSequence);
        }

        return longestSequence;
    }

    public static List<Integer> findLongestReduceSequence(List<Integer> numbers){
        List<Integer> currentSequence = new ArrayList<>(Arrays.asList(numbers.get(0)));
        List<Integer> longestSequence = new ArrayList<>(Arrays.asList(numbers.get(0)));

        for(int i = 1; i < numbers.size(); i++){
            if (numbers.get(i) < numbers.get(i - 1)) {
                currentSequence.add(numbers.get(i));
            } else {
                if (currentSequence.size() > longestSequence.size()) {
                    longestSequence = new ArrayList<>(currentSequence);
                }
                currentSequence.clear();
                currentSequence.add(numbers.get(i));
            }
        }

        if (currentSequence.size() > longestSequence.size()) {
            longestSequence = new ArrayList<>(currentSequence);
        }

        return longestSequence;
    }
}
