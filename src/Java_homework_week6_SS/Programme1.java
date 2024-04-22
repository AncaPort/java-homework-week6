package Java_homework_week6_SS;

public class Programme1 {
    /**
     * Declare two instance variables.
     * Declare one instance method.
     * Call both instance variables into the instance method inside the print statement.
     * Declare the Main method.
     * Call the above instance method into the Main method and Run the programme.
     */
    int a = 5;//a is Instance variable
    String name = "Shital Sanghani";//name is a Instance variable

    public static void main(String[] args) {//main method
        Programme1 programme1 = new Programme1();
        programme1.myProgramme();
    }

    public void myProgramme() {//Instance method
        System.out.println(a);
        System.out.println(name);

    }

}
