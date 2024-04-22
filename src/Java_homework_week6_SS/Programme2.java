package Java_homework_week6_SS;

public class Programme2 {
    /**
     * Declare two static variables
     * Declare one static method
     * Call both static variables into the static method inside the print statement.
     * Declare the Main method
     * Call the static method into the Main method and Run the programme.
     */
    static int x = 15; //x is static variable
    static String name = "Shital Sanghani";// name is static variable

    public static void main(String[] args) {//declare main method
        Programme2.m1();
    }

    public static void m1() {//Static method declaration
        System.out.println(x);
        System.out.println(name);
    }
}
