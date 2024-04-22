package Java_homework_week6_SS;

public class Programme4 {
    /**
     * Declare two instance and two static variables.
     * Declare one instance method.
     * Declare one static method.
     * Call all four instance and static variables into both instance and static methods inside the
     * print statement.
     * Declare the Main method.
     * Call both instance and static methods into the Main method and run the programme
     */
    char c = 's';//c is Instance variable
    double d = 10.20;//d is Instance variable
    static String s = "String";//s is static variable
    static float f = 30.33f;//f is float variable

    public static void main(String[] args) {//main method
        Programme4 prog = new Programme4();
        prog.s1();//calling Instance method
        Programme4.s2();//calling static method
    }

    public void s1() {//s1 is Instance method
        System.out.println(c);
        System.out.println(d);
        System.out.println(s);
        System.out.println(f);
    }

    static void s2() {//s2 is static method
        Programme4 programme4 = new Programme4();
        System.out.println(programme4.c);
        System.out.println(programme4.d);
        System.out.println(s);
        System.out.println(f);
    }

}
