import java.util.Arrays;
import java.util.Scanner;

public class Average {
    private final int[] data = new int[5];
    private double mean;

    /**
     * The constructor to allocate memory for the array,
     * display a prompt for the user to enter scores number.
     */

    public Average(){
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter score number " + (i+1) + ": ");
            data[i] = keyboard.nextInt();
        }
        selectionSort();
        calculateMean();
    }

    /**
     * The calculateMean method calculates the mean of scores user entered.
     */

    public void calculateMean(){
        double total = 0;
        for (int i = 0; i < 5; i++)
            total = total+ data[i];
        mean = total / data.length;
    }

    /**
     * The toString method returns a String containing data in descending order and the mean
     * @return result string
     */

    public String toString() {
        return "Data: " + Arrays.toString(data) +
                "\nMean: " + mean;
    }

    /**
     * The selectionSort method performs a selection sort on an
     * int array. The array is sorted in descending order.
     */

    public void selectionSort()
    {
        int startScan, index, minIndex, maxValue;

        for (startScan = 0; startScan < (data.length-1); startScan++)
        {
            minIndex = startScan;
            maxValue = data[startScan];
            for(index = startScan + 1; index < data.length; index++)
            {
                if (data[index] > maxValue)
                {
                    maxValue = data[index];
                    minIndex = index;
                }
            }
            data[minIndex] = data[startScan];
            data[startScan] = maxValue;
        }
    }
}
