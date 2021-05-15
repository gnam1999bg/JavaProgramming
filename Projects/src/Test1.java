import javax.swing.JOptionPane;

public class Test1 {
    public static void main(String[] args) {
        String inputString; //For reading input
        String name;
        int age;
        float salary = 2745.25F;

        // Get Username
        name = JOptionPane.showInputDialog("What is your name?");

        //Get age
        inputString = JOptionPane.showInputDialog("How old are you?");
        age = Integer.parseInt(inputString);

        //Get salary
        //inputString = JOptionPane.showInputDialog("What is your salary?");
        //salary = Double.parseDouble(inputString);

        //Display the result
        JOptionPane.showMessageDialog(null, "Hello " + name +
                ". You're " + age + " years old. And your salary is " + salary + "$." );
        System.exit(0);
    }
}
