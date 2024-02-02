package Main;

import OtherClasses.Common;

public class Main {
    public static void main(String[] args) {
        Common c1 = new Common(10,20);
        Common c2 = new Common("Hello", false);
        Common c3 = new Common("Viraj", 20.5);

        c1.printData();
        c2.printData();
        c3.printData();
    }
}
