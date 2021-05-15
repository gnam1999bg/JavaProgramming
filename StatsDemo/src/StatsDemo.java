import java.util.Scanner;
// TASK #3 Add the file I/O import statement here
import java.io.*;
/**
   This class reads numbers from a file, calculates the
   mean and standard deviation, and writes the results
   to a file.
*/

public class StatsDemo
{
   // TASK #3 Add the throws clause
   public static void main(String[] args) throws IOException {
      double sum = 0;      // The sum of the numbers
      int count = 0;       // The number of numbers added
      double mean = 0;     // The average of the numbers
      double stdDev = 0;   // The standard deviation
      String line;         // To hold a line from the file
      double difference;   // The value and mean difference

      // Create an object of type Scanner
      Scanner keyboard = new Scanner (System.in);
      String filename;     // The user input file name

      // Prompt the user and read in the file name
      System.out.println("This program calculates " +
                         "statistics on a file " +
                         "containing a series of numbers");
      System.out.print("Enter the file name:  ");
      filename = keyboard.nextLine();

      // ADD LINES FOR TASK #4 HERE

      /*//Option 1:
      // Create a FileReader object passing it the filename
      FileReader fileReader = new FileReader(filename);
      // Create a BufferedReader object passing FileReader object
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      // Perform a priming read to read the first line of the file
      if ((line = bufferedReader.readLine()) != null) {
         //Loop until you are at the end of the file
         do {
            // Convert the line to a double value and add the value to sum
            sum = sum + Double.parseDouble(line);
            // Increment the counter
            count++;
         } while ((line = bufferedReader.readLine()) != null);
      }
      // Close the input file
      bufferedReader.close();
      //fileReader.close();
      // Store the calculated mean
      mean = sum / count;*/

      //Option 2:
      // Create a FileReader object passing it the filename
      FileReader fileReader = new FileReader(filename);
      // Create a BufferedReader object passing FileReader object
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      // Perform reading line until you are at the end of the file
      while ((line = bufferedReader.readLine()) != null) {
         // Convert the line to a double value and add the value to sum
         sum = sum + Double.parseDouble(line);
         // Increment the counter
         count ++;
      }
      // Close the input file
      bufferedReader.close();
      //fileReader.close();
      // Store the calculated mean
      mean = sum / count;

      /*//Option 3:
      // Create a FileReader object passing it the filename
      //File fileReader = new File(filename);
      FileReader fileReader = new FileReader(filename);
      // Create a BufferedReader object passing FileReader object
      Scanner inputScanner = new Scanner(new BufferedReader(fileReader));
      // Perform reading line until you are at the end of the file
      while (inputScanner.hasNext()) {
         line = inputScanner.nextLine();
         // Convert the line to a double value and add the value to sum
         sum = sum + Double.parseDouble(line);
         // Increment the counter
         count ++;
      }
      // Close the input file
      inputScanner.close();
      // Store the calculated mean
      mean = sum / count;*/

      // ADD LINES FOR TASK #5 HERE

      // Option 1:
      /*// Reconnect FileReader object passing it the filename
      fileReader = new FileReader(filename);
      // Reconnect BufferedReader object passing FileReader object
      bufferedReader = new BufferedReader(fileReader);
      // Reinitialize the sum of the numbers
      sum = 0;
      // Reinitialize the number of numbers added
      count = 0;
      // Perform a priming read to read the first line of the file
      if ((line = bufferedReader.readLine()) != null) {
         // Loop until you are at the end of the file
         do{
         // Convert the line into a double value and subtract the mean
         difference = Double.parseDouble(line) - mean;
         // Add the square of the difference to the sum
         sum = sum + difference * difference;
         // Increment the counter
         count ++;
         } while ((line = bufferedReader.readLine()) != null);
      }
      // Close the input file
      fileReader.close();
      bufferedReader.close();
      // Store the calculated standard deviation
      stdDev = Math.sqrt(sum / count);*/

      // Option 2:
      // Reconnect FileReader object passing it the filename
      fileReader = new FileReader(filename);
      // Reconnect BufferedReader object passing FileReader object
      bufferedReader = new BufferedReader(fileReader);
      // Reinitialize the sum of the numbers
      sum = 0;
      // Reinitialize the number of numbers added
      count = 0;
      // Perform reading line until you are at the end of the file
      while ((line = bufferedReader.readLine()) != null) {
         // Convert the line into a double value and subtract the mean
         difference = Double.parseDouble(line) - mean;
         // Add the square of the difference to the sum
         sum = sum + difference * difference;
         // Increment the counter
         count ++;
      }
      // Close the input file
      fileReader.close();
      bufferedReader.close();
      // Store the calculated standard deviation
      stdDev = Math.sqrt(sum / count);

      /*//Option 3:
      // Create a FileReader object passing it the filename
      File file = new File(filename);
      // Create a BufferedReader object passing FileReader object
      inputScanner = new Scanner(new BufferedReader(fileReader));
      // Reinitialize the sum of the numbers
      sum = 0;
      // Reinitialize the number of numbers added
      count = 0;
      // Perform reading line until you are at the end of the file
      while (inputScanner.hasNext()) {
         line = inputScanner.nextLine();
         // Convert the line into a double value and subtract the mean
         difference = Double.parseDouble(line) - mean;
         // Add the square of the difference to the sum
         sum = sum + difference * difference;
         // Increment the counter
         count ++;
      }
      // Close the input file
      inputScanner.close();
      // Store the calculated standard deviation
      stdDev = Math.sqrt(sum / count);*/

      // ADD LINES FOR TASK #3 HERE
      // Create a FileWriter object using "Results.txt"
      FileWriter outputFile = new FileWriter("Results.txt");
      // Create a PrintWriter object passing the
      // FileWriter object
      PrintWriter printWriter = new PrintWriter(outputFile);
      // Print the results to the output file
      printWriter.print("Mean = ");
      printWriter.format("%.3f%n", mean);
      printWriter.print("Standard Deviation = ");
      printWriter.format("%.3f%n", stdDev);
      // Close the output file
      printWriter.close();
      //outputFile.close();
   }
}