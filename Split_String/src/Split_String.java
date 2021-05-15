import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Split_String {
    public static void main(String[] args) throws IOException {
        String[] words = new String[0];
            // Create a FileReader object passing it the filename.
            FileReader fileReader = new FileReader("secret.txt");
            // Create a BufferedReader object passing FileReader object.
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            // Perform a priming read to read the file.
            String line = bufferedReader.readLine();
            StringBuilder str = new StringBuilder();
            //Split the line into words.
            words  = line.split(" ");
            for (int i = 0; i < words.length; i+=5) {
                //Append first character of every fifth word to a StringBuilder object.
                str.append(Character.toUpperCase(words[i].charAt(0)))  ;
            }
            System.out.println(str);
            bufferedReader.close();

    }
}

//        if ((line = bufferedReader.readLine()) != null) {
//          //Split the line into words.
//          words  = line.split(" ");
//          for (int i = 0; i < words.length; i++) {
//              if (((i + 1) % 5) == 0){
//              //Append first character of every fifth word to a StringBuilder object.
//              str.append(Character.toUpperCase(words[i].charAt(0)))  ;
//              }
//          }
//        }