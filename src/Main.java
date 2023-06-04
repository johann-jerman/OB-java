// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SmartDevise voidSmartDevise = new SmartDevise();
        SmartDevise completeSmartDevise = new SmartDevise("samsung");

        SmartPhone voidSmartPhone = new SmartPhone();
        SmartPhone completeSmartPhone = new SmartPhone("samsung", 100);

        SmartWatch voidSmartWatch = new SmartWatch();
        SmartWatch completeSmartWatch = new SmartWatch("samsung", 1000);

        System.out.println(voidSmartDevise);
        System.out.println(completeSmartDevise);

        System.out.println(voidSmartPhone);
        System.out.println(completeSmartPhone);

        System.out.println(voidSmartWatch);
        System.out.println(completeSmartWatch);


    }
}