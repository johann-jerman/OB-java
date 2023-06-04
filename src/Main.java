// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int num = ivaCalculate(100);
        System.out.println(num);

    }

    public static int ivaCalculate(int numbreToCalc){
        int iva = numbreToCalc * 21 / 100;
        int finalNumber = iva + numbreToCalc;
        return finalNumber;
    }
}