package Java_homework_week6_SS;

public class Programme3 {
    /**
     * Declare one instance and one static variable.
     * Declare one instance method.
     * Declare one static method.
     * Call both instance and static variables into both instance and static methods inside the
     * print statement.
     * Declare the Main method.
     * Call both instance and static methods into the Main method and run the programme
     */
    String name = "Java";// name is Instance variable
    static int num = 20;//z is Static variable

    public static void main(String[] args) {//main method
        Programme3 obj = new Programme3();
        obj.instance();//calling instance method
        Programme3.Static();//calling static method
    }

    public void instance() {//instance is Instance method
        System.out.println(name);
        System.out.println(num);
    }

    static void Static() {//Static is Static method
        Programme3 Stat = new Programme3();
        System.out.println(Stat.name);
        System.out.println(num);
    }


}
