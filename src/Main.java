import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    private static final String FILE_NAME = "10m.txt";


    public static void main(String[] args) {

        List<Integer> numbersList;

        try {
            numbersList = CustomFileReader.readFile(FILE_NAME);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Min: " + Calculator.findMin(numbersList));
        System.out.println("Max: " + Calculator.findMax(numbersList));
        System.out.println("Average: " + String.format("%.1f", Calculator.findAverage(numbersList)));
        System.out.println("Median: " + String.format("%.1f" , Calculator.findMedian(numbersList)));
        System.out.println("Longest Increasing sequence: " + Calculator.findLongestIncrSequence(numbersList));
        System.out.println("Longest Reducing sequence: " + Calculator.findLongestReduceSequence(numbersList));
    }

}